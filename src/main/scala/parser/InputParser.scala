package parser

import ball.Ball

class InputParser(oversDetails: List[String], overThreshold: Double) {
  val overLength = 6

  def getBalls: List[Ball] = {
    var balls: List[Ball] = List[Ball]()

    for (x <- 0 until ballsThreshold) {
      val ballValue: String = oversDetails(x)
      balls ::= new Ball(ballValue)
    }
    balls
  }

  def ballsThreshold: Int = {
    val completedOvers: Int = Math.floor(overThreshold).asInstanceOf[Int]
    val remainingBalls: Int = Math.round((overThreshold - completedOvers) * 10).asInstanceOf[Int]
    completedOvers * overLength + remainingBalls
  }
}
