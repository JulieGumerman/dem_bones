package dem_bones_gonna_walk_around

object bones extends App{

  def singDemBones(godName: String): Unit = {
    //body parts

    var body = Array("toe", "foot", "ankle", "leg", "knee", "thigh", "hip", "back", "neck", "head", "finger", "hand", "arm", "shoulder")

    //hash table! Whoo!!!

    val collectionOfBodyParts = scala.collection.mutable.HashMap.empty[Int,Bone]

    //get body parts from array into classes; get classes into a hashtable

    for (i <- 0 until body.length -1) {
      if (i == 0) {
        var newBone = new Bone ("none", body(i))
        println(newBone.prev, newBone.bone)
        collectionOfBodyParts += ((i) -> newBone)
      }
      else {
        var newBone = new Bone(body(i - 1), body(i))
        println(newBone.prev, newBone.bone)
        collectionOfBodyParts += ((i) -> newBone)
      }
    }

    println(collectionOfBodyParts)

    for ((key, value) <- collectionOfBodyParts) {
      println(s" The ${value.prev} is connected to the ${value.bone} bone")
    }
    println(s"And these are the words of the ${godName}")
  }

  singDemBones("<<Insert your higher power's name here>>")


}

//"body" class

class Bone (val prev: String, val bone: String) {


}


