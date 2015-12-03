package scalera.tuple.macros

import scala.language.experimental.macros

object Tuple {

  //  Basic tuple macros up to 5 typesa

  def apply[A, B](t1: A, t2: B): (A, B) =
  macro Macros.tuple2Impl[A, B]

  def apply[A, B, C](t1: A, t2: B, t3: C): (A, B, C) =
  macro Macros.tuple3Impl[A, B, C]

  def apply[A, B, C, D](t1: A, t2: B, t3: C, t4: D): (A, B, C, D) =
  macro Macros.tuple4Impl[A, B, C, D]

  def apply[A, B, C, D, E](t1: A, t2: B, t3: C, t4: D, t5: E): (A, B, C, D, E) =
  macro Macros.tuple5Impl[A, B, C, D, E]

  //  Generic tuple macro?
  

}
