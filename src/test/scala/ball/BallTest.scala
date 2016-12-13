package ball

import org.scalatest.FunSuite

class BallTest extends FunSuite {
  test("should tell if it is a odd run ball") {
    val ballWith1Run = new Ball("1")
    val ballWith2Runs = new Ball("2")

    assertResult(true)(ballWith1Run.isOddRun)
    assertResult(false)(ballWith2Runs.isOddRun)
  }

  test("should tell if it is a wicket ball") {
    val ballWith1Run = new Ball("1")
    val ballWith2Runs = new Ball("W")

    assertResult(false)(ballWith1Run.isWicket)
    assertResult(true)(ballWith2Runs.isWicket)
  }

  test("should return runs scored on that ball"){
    val ballWith1Run = new Ball("1")
    val ballWith6Runs = new Ball("6")

    assertResult(1)(ballWith1Run.runs)
    assertResult(6)(ballWith6Runs.runs)
  }

}
