//Найти длину наибольшей последовательности одинаковых чисел идущих подряд.
object Main {
    var ms1 = Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    def main(args: Array[String]): Unit = {
      var ms:Array[Int] = new Array[Int](3)
      printf("MaxLenght of elem: " + getElem() + "\n")

    }


  def getElem() : Int = {
    var lenghtms = 0
    var lenghtms2 = 0

    var index : Int = 0
    var index2 : Int = 0
    var size : Int = ms1.length
    var elem1 : Int = 0
    printf("SIZE " + size + "\n")
    while( index < size){
      printf("Index " + index)
      if(index + 1 <= size){
        elem1 = ms1(index)
      }

      printf("First elem: " + elem1.toString + "\n")
      printf("I1 = " + index + "\n")
      index +=1
      index2 = 0
      while(index2 < size){
        printf("I2 = " + index2 + "\n")
        var elem2 = 0
        elem2 = ms1(index2)
        index2 += 1
        printf("Second elem: " + elem2.toString + "\n")
        if(elem1 == elem2){
          index = index2
          printf("Detected\n")
          lenghtms2 += 1
          printf("Lenght1 = " + lenghtms + " Lenght2 = " + lenghtms2 + "\n")
          if(lenghtms2 >= lenghtms){
            lenghtms = lenghtms2
          }
        }else{
          lenghtms2 = 0
        }
      }
    }
    lenghtms
  }
}