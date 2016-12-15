package format

import org.scalatest.FunSuite

class InputFormatterTest extends FunSuite {
  val singleSpacedInput: String = "1 0 0 0 6 4 1 2 1 W"
  val multipleSpacedInput: String = "1 0    0 0 6    4      1 2 1   W "
  val expectedData: List[String] = List("1", "0", "0", "0", "6", "4", "1", "2", "1", "W")

  test("should format given data when data is separated by single space and return list of letters") {
    val inputFormatter: InputFormatter = new InputFormatter(singleSpacedInput)
    assertResult(expectedData)(inputFormatter.format())
  }

  test("should format given data when data is separated by multiple space and return list of letters") {
    val inputFormatter: InputFormatter = new InputFormatter(multipleSpacedInput)
    assertResult(expectedData)(inputFormatter.format())
  }
}
