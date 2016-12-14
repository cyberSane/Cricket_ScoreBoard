package ball

import java.util.Observable

class Balls(balls: List[Ball]) extends Observable {

  def isLastBall(ball: Ball): Boolean = {
    (balls.indexOf(ball) + 1) % 6 == 0
  }

  def get(ballNumber: Int): Ball = {
    val ball: Ball = balls(ballNumber)

    if (isLastBall(ball)) {
      setChanged()
      notifyObservers(true)
    }
    ball
  }


}
