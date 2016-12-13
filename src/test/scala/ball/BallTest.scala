package ball

import org.scalatest.FunSuite

class BallTest extends FunSuite {
  test("ball should tell if it is a odd run ball") {
    val ballWith1Run = new Ball("1")
    val ballWith2Run = new Ball("2")

    assertResult(true)(ballWith1Run.isOddRun)
    assertResult(false)(ballWith2Run.isOddRun)
  }

  test("ball should tell if it is a wicket ball") {
    val ballWith1Run = new Ball("1")
    val ballWith2Run = new Ball("W")

    assertResult(false)(ballWith1Run.isWicket)
    assertResult(true)(ballWith2Run.isWicket)
  }


}
