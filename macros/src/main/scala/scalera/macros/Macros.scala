package scalera.macros

import scala.reflect.macros._

object Macros {

  def entityImpl(
                  c: whitebox.Context)(
                  name: c.Expr[String])(
                  attributes: c.Expr[(String, Rep[_])]*) = {
    import c.universe._
    c.Expr[Any]( q"""new {
      ${classExpr(c)(name)(attributes:_*)}
      }""")
  }

  def classExpr(
                 c: whitebox.Context)(
                 name: c.Expr[String])(
                 attributes: c.Expr[(String, Rep[_])]*) = {
    import c.universe._
    val members =
      attributes.map{ att =>
        c.eval(c.Expr[(String,Rep[_])](c.untypecheck(att.tree))) match {
          case (attName,value) =>
            ValDef(
              Modifiers(Flag.CASEACCESSOR | Flag.PARAMACCESSOR),
              TermName(attName),
              Ident(TypeName(value.tpe.in(c.mirror).tpe.toString)),
              EmptyTree)
        }
      }.toList
    c.Expr(q"""case class ${TypeName(c.eval(name))}(..$members)""")
  }

}
