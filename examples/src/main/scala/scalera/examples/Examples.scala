package scalera.examples

import scalera.macros._
import scalera.macros.Entity._

object Examples extends App {

  val entities =
    Entity("MyEntity")(
      "att1" -> 5,
      "att2" -> true)

  import entities._

  val myEntity = MyEntity(2,false)

  assert(myEntity.isInstanceOf[Serializable with Product],"It should be serializable")

  assert{
    val extractedAtt1: Int = myEntity.att1
    val extractedAtt2: Boolean = myEntity.att2
    myEntity == MyEntity(extractedAtt1,extractedAtt2)
  }

}
