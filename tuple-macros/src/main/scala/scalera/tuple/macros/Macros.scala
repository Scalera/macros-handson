package scalera.tuple.macros

import scala.reflect.macros.whitebox.Context

object Macros {

  def tuple2Impl[T,U](
    c: Context)(
    t1: c.Expr[T],
    t2: c.Expr[U]) : c.Expr[Tuple2[T,U]] = {
    c.Expr[Tuple2[T,U]](
      q"""($t1,$t2)""")
  }
}
