package format

class InputFormatter(data: String) {

  def format(): List[String] = {
    data.trim().replaceAll(" +", " ").split(" ").toList
  }
}
