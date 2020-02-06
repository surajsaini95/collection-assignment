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


  def updateMap(map: Map[Int, List[String]], map1: Map[Int, List[String]]): Map[Int, List[String]] = {

    def updateList(list: List[String], str: String): List[String] = list match {
      case Nil => List()
      case first :: rest => first.charAt(0) + str :: updateList(rest, str)
    }

    map.foldLeft(map1) { (acc: Map[Int, List[String]], element: (Int, List[String])) => {
      if (element._1 % 2 == 0) {
        acc + (element._1 -> updateList(element._2, "even"))
      } else {
        acc + (element._1 -> updateList(element._2, "odd"))
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

  //solution2

  val map1 = Map(
    1 -> List("Sunil", "Laxmi"),
    2 -> List("Bhavya", "angeeta"),
    3 -> List("Arun", "Sushmita"),
    4 -> List("Jamwant")
  )
  val  map2 = Map.empty[Int,List[String]]
  val res=ob.updateMap(map1,map1)
  print("\n"+res)

  //solution3
  val list1 = List(1, 1, 2, 3, 5, 8)
  print("\n" + ob.getLastElement(list1))

}
