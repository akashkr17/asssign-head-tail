package edu.knoldus

class Sorting {

  def isort(xs: List[Int]): List[Int] = {
    xs match {
      case Nil => Nil
      case _   => insert(xs.head, isort(xs.tail))

    }
  }

  def insert(elem: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty || elem <= list.head) elem :: list
    else list.head :: insert(elem, list.tail)
  }

}
