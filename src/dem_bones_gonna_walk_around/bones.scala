package dem_bones_gonna_walk_around

object bones extends App{

  var body = Array("toe", "foot", "ankle", "leg", "knee", "thigh", "hip", "back", "neck", "head", "finger", "hand", "arm", "shoulder")

  body.foreach(i in body => println(new Bone(i)))

}

class Bone (bone: String) {


}
