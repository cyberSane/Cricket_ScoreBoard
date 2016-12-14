package parser

import ball.Ball
import org.scalatest.FunSuite

class InputParserTest extends FunSuite {
  test("should give the total balls according to the over threshold given") {
    val oversDetails: List[String] = List("1", "1", "2", "4", "3", "5", "6", "W")
    val oversThreshold: Double = 1.1
    val inputParser: InputParser = new InputParser(oversDetails, oversThreshold)
    val expected: Int = 7

    assertResult(expected)(inputParser.ballsThreshold)
  }

  test("should give list of balls upto oversThreshold according to the oversDetails given") {
    val oversDetails: List[String] = List("1", "W")
    val oversThreshold: Double = 0.1
    val inputParser: InputParser = new InputParser(oversDetails, oversThreshold)
    val expected: Ball = new Ball("1")
    val result: List[Ball] = inputParser.getBalls

    assertResult(1)(result.length)
    val resultHead: Ball = result.head
    //  assertResult(expected)(resultHead) need to fix
  }
}
