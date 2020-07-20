package dem_bones_gonna_walk_around

object bones extends App{

  
  def singDemBones(godName: String): List[String] = {

    val body = Array("toe", "foot", "ankle", "leg", "knee", "thigh", "hip", "back", "neck", "head", "finger", "hand", "arm", "shoulder")

    body
      .sliding(2)
      .map{case Array(x, y) => Bone(x, y).sing}
      .toList :+ s"So here's the name of the ${godName}"
  }

  singDemBones("<<Insert your higher power's name here>>").map(println _)


}

case class Bone (val name: String, val next: String) {
  def sing = s"The ${name} bone is connected to the ${next} bone."
}


