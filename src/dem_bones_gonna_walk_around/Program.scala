package dem_bones_gonna_walk_around

object Program extends App{

    val humanSkeletonSize = 14;

    val toe = new Bone("toe")
    val foot = new Bone("foot")
    val ankle = new Bone("ankle")
    val leg = new Bone("leg")
    val knee = new Bone("knee")
    val thigh = new Bone("thigh")
    val hip = new Bone("hip")
    val back = new Bone("back")
    val neck = new Bone("neck")
    val head = new Bone("head")
    val finger = new Bone("finger")
    val hand = new Bone("hand")
    val arm = new Bone("arm")
    val shoulder = new Bone("shoulder")

    var gregTheSkeleton : Array[Bone] = new Array[Bone](humanSkeletonSize);

    gregTheSkeleton(0) = toe
    gregTheSkeleton(1) = foot
    gregTheSkeleton(2) = ankle
    gregTheSkeleton(3) = leg
    gregTheSkeleton(4) = knee
    gregTheSkeleton(5) = thigh
    gregTheSkeleton(6) = hip
    gregTheSkeleton(7) = back
    gregTheSkeleton(8) = neck
    gregTheSkeleton(9) = finger
    gregTheSkeleton(10) = hand
    gregTheSkeleton(11) = arm
    gregTheSkeleton(12) = shoulder

    for( i <- 0 until gregTheSkeleton.length - 1){
        gregTheSkeleton(i).sing(gregTheSkeleton(i + 1).n)
    }

}
