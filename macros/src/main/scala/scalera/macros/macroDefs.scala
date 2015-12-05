package scalera.macros

import scala.language.experimental.macros
import scala.reflect.runtime.universe.{WeakTypeTag,weakTypeTag}

/**
  * Wrapper for storing type info about
  * contained value.
  * @param t contained value.
  * @param ev1 Implicit [[WeakTypeTag]] of [[T]]
  * @tparam T Value type.
  */
case class Rep[T:WeakTypeTag](t: T){
  val tpe: WeakTypeTag[T] = weakTypeTag[T]
}

object Entity {

  /**
    * Implicit converter from some value
    * to its [[Rep]] value (with type info).
    * @param t Value to be converted
    * @tparam T Value type
    * @return A [[Rep]] of [[T]]
    */
  implicit def toRep[T:WeakTypeTag](t: T): Rep[T] = Rep(t)

  def apply(name: String)(attributes: (String, Rep[_])*): Any =
  macro Macros.entityImpl

}