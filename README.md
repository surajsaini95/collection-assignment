# Assignment 1

Q: FInd second max from a list
Input: List(1,2,3,4)
Output: 3

Q. Kth element from the list
  Input : kth(List(1,2,3,4,5),3)
  Output: 4

Q. Find out whether a list is a palindrome.
Example:
  Input: isPalindrome(List(1, 2, 3, 2, 1))
  Output: true

Q. Get reverse of a List.

Q. In a seq find out the first even number.
Example:
   Input: firstEven(List(1,21,3,4,5))
   Output: 4

Q. Remove continuously occurring duplicates from a List.
Example:
   Input: compress(List(1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5))
   Output: List(1, 2, 3, 1, 4, 5)

Q. Add duplicates of the elements.
Example:
   Input: duplicate(List(1, 2, 3, 3, 4))
   Output: List(1, 1, 2, 2, 3, 3, 3, 3, 4, 4)

Q. Remove every Nth element.
Example:
   Input: drop(3, List(1,2,3,4,5,6,7,8,9,10,11))
   Output: List(1,2,4,5,6,7,8,9,10,11)

# Assignment 2

Q1. Write a function: 
def sumConditional(map: Map[String, Int], str: String): Int
Takes: a map of name -> age and returns the sum of ages for which the name contains the str
Sample input: 
val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
val str = "anu"
sumConditional(map, str) should return 54


Q2. Input:
val map = Map(
 1 -> List(“Sunil”, “Laxmi”),
 2 -> List(“Bhavya”, “Sangeeta”),
 3 -> List(“Arun”, “Sushmita”),
 4 -> List(“Jamwant”)
)
Output:
val map = Map(
 1 -> List(“Sodd”, “Lodd”),
 2 -> List(“Beven”, “Seven”),
 3 -> List(“Aodd”, “Sodd”),
 4 -> List(“Jeven”)
)


Using FoldLeft

Q3. Find the last element of a list
Sample declaration of method: last(list: List[Int]): Int
Input: last(List(1, 1, 2, 3, 5, 8))
output: Int = 8

