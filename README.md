# macros-handson
Playing around with macros...

## Entity macro

This macro allows creating a case class from a variable number of ```Tuple2[String,_]```.

E.g.:

```scala
import scalera.macros._
import scalera.macros.Entity._

val entities = 
  Entity("MyEntity")(
    "att1" -> 5,
    "att2" -> true)

import entities._

val myEntity = MyEntity(2,false)

assert(myEntity.att1==5)
assert(myEntity.att2==false)
```

## License

Licensed to Scalera blog. 
Released under Apache License, Version 2.0.