package dem_bones_gonna_walk_around

// in Scala the class name also works as the constructor which can take a # of parameters
class Bone (name: String){
    var n: String = name

    def getName() : String = {
       return name;
    }

    def sing(nextBone: String): Unit ={
      println("The " + n + " bone's connected to the " + nextBone + " bone.")
    }
}
