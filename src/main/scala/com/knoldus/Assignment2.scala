package com.knoldus

class Assignment2 {

  def sumConditional(map: Map[String, Int], str: String): Int = {

    map.foldLeft(0) { (acc: Int, element: (String, Int)) => {
      if (element._1.contains(str)) {
        acc + element._2
      } else {
        acc + 0
      }
    }
    }
  }

  def getLastElement(list: List[Int]): Int = {
    list.foldLeft(0) { (acc: Int, element: Int) => {
      element
    }
    }
  }
}

object Assignment2 extends App {
  val ob = new Assignment2

  //solution1
  val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
  val str = "anu"
  print(ob.sumConditional(map, str))

  //solution3
  val list1 = List(1, 1, 2, 3, 5, 8)
  print("\n" + ob.getLastElement(list1))

}
