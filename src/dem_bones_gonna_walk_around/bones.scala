package dem_bones_gonna_walk_around

object bones extends App{

  var body = Array("toe", "foot", "ankle", "leg", "knee", "thigh", "hip", "back", "neck", "head", "finger", "hand", "arm", "shoulder")

  for (i <- 0 until body.length -1) {
//    var newBone = new Bone (body(i))
//    println(newBone.bone)
    if (i == 0) {
      var newBone = new Bone ("none", body(i))
      println(newBone.prev, newBone.bone)
    }
    else {
      var newBone = new Bone(body(i-1), body(i))
      println(newBone.prev, newBone.bone)
    }
  }

}

class Bone (val prev: String, val bone: String) {


}
