package ball

class Ball(value: String) {

  def isWicket: Boolean = {
    try {
      Integer.parseInt(value)
    }
    catch {
      case numberError: NumberFormatException => return true
      case nullPointer: NullPointerException => return true
    }
    false
  }

  def runs: Int = {
    if (!isWicket) {
      Integer.parseInt(value)
    }
    else {
      0
    }
  }

  def isOddRun: Boolean = {
    (runs % 2) != 0
  }

}
