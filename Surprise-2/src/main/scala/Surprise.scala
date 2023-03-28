case class Test(string: String, isEven: Boolean)

object Main extends App {

  private val list = List(Test("1", false), Test("2", true), Test("3", false), Test("4", true), Test("5", false))
  //Filter even number
  private val evenValue = list.filter(num => num.isEven)
  //Filter odd numbers
  private val oddValue = list.filterNot(num => num.isEven)
  //Even Partition
  private val evenPartitionedTests = list.partition(num => num.isEven)
  //Odd Partition
  private val oddPartitionedTests = list.partition(num => !num.isEven)
  //Only Even Number from the Given List
  private val firstFieldOfEvenTests = evenValue.map(num => num.string.toInt)

  println(s"EvenList := $evenValue\nOddList := $oddValue\nEvenPartition$evenPartitionedTests\nOddPartition$oddPartitionedTests\nEvenNumbers$firstFieldOfEvenTests")
}