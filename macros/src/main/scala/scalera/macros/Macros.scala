package scalera.macros

import scala.reflect.macros._

object Macros {

  def tuple2Impl[A, B](
                        c: whitebox.Context)(
                        t1: c.Expr[A],
                        t2: c.Expr[B]): c.Expr[(A, B)] = {
    import c.universe._
    c.Expr( q"""($t1,$t2)""")
  }

  def tuple3Impl[A, B, C](
                           c: whitebox.Context)(
                           t1: c.Expr[A],
                           t2: c.Expr[B],
                           t3: c.Expr[C]): c.Expr[(A, B, C)] = {
    import c.universe._
    c.Expr( q"""($t1,$t2,$t3)""")
  }

  def tuple4Impl[A, B, C, D](
                              c: whitebox.Context)(
                              t1: c.Expr[A],
                              t2: c.Expr[B],
                              t3: c.Expr[C],
                              t4: c.Expr[D]): c.Expr[(A, B, C, D)] = {
    import c.universe._
    c.Expr( q"""($t1,$t2,$t3,$t4)""")
  }

  def tuple5Impl[A, B, C, D, E](
                                 c: whitebox.Context)(
                                 t1: c.Expr[A],
                                 t2: c.Expr[B],
                                 t3: c.Expr[C],
                                 t4: c.Expr[D],
                                 t5: c.Expr[E]): c.Expr[(A, B, C, D, E)] = {
    import c.universe._
    c.Expr( q"""($t1,$t2,$t3,$t4,$t5)""")
  }


}
