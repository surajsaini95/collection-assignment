package com.knoldus

/** *
 * assumption is made that if value of interest is not present in
 * list or the list is empty it returns -1 where return type in Int
 *
 */
class Assignment1 {
  def secondMaxFromList(list: List[Int]): Int = {
    @scala.annotation.tailrec
    def secondMax(list: List[Int], first: Int, second: Int): Int = list match {
      case Nil => -1
      case f :: Nil => if (f > first) first else if (f > second) f else second
      case f :: rest => if (f > first) secondMax(rest, f, first)
      else if (f > second && f != first) secondMax(rest, first, f)
      else secondMax(rest, first, second)
    }

    val defaultFirst: Int = 0
    val defaultSecond: Int = 0
    secondMax(list, defaultFirst, defaultSecond)
  }

  def kthFromList(list: List[Int], k: Int): Int = {
    @scala.annotation.tailrec
    def recursiveTraverse(list: List[Int], k: Int, counter: Int): Int = list match {
      case Nil => -1
      case first :: rest => if (k == counter) first else recursiveTraverse(rest, k, counter + 1)
    }

    val defaultCounter: Int = 0
    recursiveTraverse(list, k, defaultCounter)
  }

  def isListPalindrome(list1: List[Int]): Boolean = {
    def reverseList(list: List[Int]): List[Int] = list match {
      case Nil => List()
      case first :: Nil => List(first)
      case first :: rest => reverseList(rest) ::: List(first)
    }

    list1 == reverseList(list1)
  }


  def reverseList(list: List[Int]): List[Int] = list match {
    case Nil => List()
    case first :: Nil => List(first)
    case first :: rest => reverseList(rest) ::: List(first)
  }

  /*assumption is made that if
  there is no even number in
  list or the list is empty it returns -1
 */
  def firstEvenFromList(list: List[Int]): Int = list match {
    case Nil => -1
    case first :: Nil => if (first % 2 == 0) first else -1
    case first :: rest => if (first % 2 == 0) first else firstEvenFromList(rest)
  }

  def compressList(list: List[Int]): List[Int] = {
    def recursiveRemoveAdjacent(list: List[Int], adjacent: Int): List[Int] = list match {
      case Nil => List()
      case first :: rest => if (adjacent != first) first :: recursiveRemoveAdjacent(rest, first)
      else recursiveRemoveAdjacent(rest, adjacent)
    }

    val defaultAdjacent: Int = -1
    recursiveRemoveAdjacent(list, defaultAdjacent)
  }

  def duplicateList(list: List[Int]): List[Int] = list match {
    case Nil => List()
    case first :: rest => List(first, first) ::: duplicateList(rest)
  }

  def dropFromList(element: Int, list: List[Int]): List[Int] = {
    def recursiveRemove(element: Int, list: List[Int], counter: Int): List[Int] = list match {
      case Nil => List()
      case first :: rest => if (counter % element != 0) first :: recursiveRemove(element, rest, counter + 1)
      else recursiveRemove(element, rest, counter + 1)
    }

    val defaultCounter: Int = 1
    recursiveRemove(element, list, defaultCounter)
  }

}

object Assignment1 extends App {
  val ob = new Assignment1
  val list1 = List(1, 2, 3, 4)
  println(ob.secondMaxFromList(list1))

  val list2 = List(1, 2, 3, 4, 5)
  println(ob.kthFromList(list2, 3))

  val list3 = List(1, 2, 3, 2, 1)
  println(ob.isListPalindrome(list3))

  println(ob.reverseList(list1))

  val list4 = List(1, 21, 3, 4, 5)
  println(ob.firstEvenFromList(list4))

  val list5 = List(1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5)
  println(ob.compressList(list5))

  val list6 = List(1, 2, 3, 3, 4)
  println(ob.duplicateList(list6))

  val list7 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
  val n: Int = 3
  println(ob.dropFromList(n, list7))

}
