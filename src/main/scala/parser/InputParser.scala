package parser

class InputParser(oversDetails: List[String], overThreshold: Double) {
  val overLength = 6

  def ballsThreshold: Int = {
    val completedOvers: Int = Math.floor(overThreshold).asInstanceOf[Int]
    val remainingBalls: Int = Math.round((overThreshold - completedOvers) * 10).asInstanceOf[Int]
    completedOvers * overLength + remainingBalls
  }

}
