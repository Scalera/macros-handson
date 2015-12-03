package scalera.tuple.samples

import scalera.tuple.macros.Tuple

object Samples extends App {

  val t2 = Tuple(true,"hi")

  val t3 = Tuple("hi",3,List(1,2,3))

  val t4 = Tuple("hi",4,List(1,2),List(true))

  val t5 = Tuple("bye",false, Array(3),Set(1,2,3),5)

  println

}
