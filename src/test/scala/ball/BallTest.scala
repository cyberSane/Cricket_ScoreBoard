package ball

import org.scalatest.FunSuite

class BallTest extends FunSuite {
  test("isOddRun should give true when run on the ball is odd") {
    val ballWith1Run = new Ball("1")

    assertResult(true)(ballWith1Run.isOddRun)
  }

  test("isOddRun should give false when run on the ball is even") {
    val ballWith2Runs = new Ball("2")

    assertResult(false)(ballWith2Runs.isOddRun)
  }

  test("isOddRun should give false when ball is a wicket ball") {
    val ballWithWicket = new Ball("W")

    assertResult(false)(ballWithWicket.isOddRun)
  }

  test("isWicket should give true when ball is a wicket ball") {
    val ballWithWicket = new Ball("W")

    assertResult(true)(ballWithWicket.isWicket)
  }

  test("isWicket should give false when ball is a run ball") {
    val ballWith1Run = new Ball("1")

    assertResult(false)(ballWith1Run.isWicket)
  }

  test("should return runs scored on that ball") {
    val ballWith1Run = new Ball("1")
    val ballWith6Runs = new Ball("6")

    assertResult(1)(ballWith1Run.runs)
    assertResult(6)(ballWith6Runs.runs)
  }

  test("should return 1 when it is a wicket ball") {
    val ballWithWicket = new Ball("W")

    assertResult(1)(ballWithWicket.wicket)
  }

  test("should return 0 when it is not a wicket ball") {
    val ballWithNoWicket = new Ball("1")

    assertResult(0)(ballWithNoWicket.wicket)
  }
}
