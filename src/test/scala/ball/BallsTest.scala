package ball

import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfter, FunSuite}

class BallsTest extends FunSuite with BeforeAndAfter with MockitoSugar {
  var balls: Balls = _
  val firstBall: Ball = new Ball("1")
  val secondBall: Ball = new Ball("2")
  val thirdBall: Ball = new Ball("W")
  val fourthBall: Ball = new Ball("1")
  val fifthBall: Ball = new Ball("4")
  val sixthBall: Ball = new Ball("3")

  before {
    val ballsArray = List(firstBall,
      secondBall,
      thirdBall,
      fourthBall,
      firstBall,
      sixthBall
    )
    balls = new Balls(ballsArray)
  }
  test("get should give the ball and notify nothing when ball is not the last ball of an over") {
    val expectedBall: Ball = thirdBall

    assertResult(expectedBall)(balls.get(2))
  }
}
