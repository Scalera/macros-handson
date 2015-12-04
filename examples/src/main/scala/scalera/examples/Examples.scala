package scalera.examples

import scalera.macros._

object Examples extends App {

  val entities =
    Entity("MyEntity")(
      "att1" -> 2,
      "att2" -> "Hi",
      "att3" -> List(true))

  import entities._

  val myEntity = MyEntity(2,"bye",List(false,false))

  val x = myEntity.att1

  assert(myEntity.isInstanceOf[Serializable with Product],"It should be serializable")

}
