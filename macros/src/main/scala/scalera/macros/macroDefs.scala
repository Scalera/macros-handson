package scalera.macros

import scala.language.experimental.macros

object Entity {

  def apply(name: String)(attributes: (String, Any)*): Any =
  macro Macros.entityImpl

}