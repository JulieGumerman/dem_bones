package dem_bones_gonna_walk_around

import scala.collection.mutable.LinkedList

object bones extends App{

  
  def singDemBones(godName: String): Unit = {

    val body = Array("toe", "foot", "ankle", "leg", "knee", "thigh", "hip", "back", "neck", "head", "finger", "hand", "arm", "shoulder")


    val collectionOfBodyParts = body.sliding(2).map{
      case Array(x, y) => Bone(x, y)
    }

    val incompleteSong = collectionOfBodyParts.map(bone =>
        s"The ${bone.name} bone is connected to the ${bone.next} bone."
    ).toList

    val completeSong = incompleteSong + s"So here's the name of the ${godName}"

    completeSong
  }




  singDemBones("<<Insert your higher power's name here>>")


}

//"body" class

case class Bone (val name: String, val next: String)


