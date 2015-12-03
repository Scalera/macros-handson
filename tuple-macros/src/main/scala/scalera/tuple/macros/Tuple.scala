package scalera.tuple.macros

import scala.language.experimental.macros

object Tuple {

  def apply[T, U](t1: T,t2: U) = macro Macros.tuple2Impl[T,U](t1,t2)

}
