object run {
    def con()
    {
        val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
      val fruit2 = "mangoes" :: ("banana" :: Nil)
      // use two or more lists with ::: operator
      var fruit = fruit1 ::: fruit2
      println( "fruit1 ::: fruit2 : " + fruit )
      
      // use two lists with Set.:::() method
      fruit = fruit1.:::(fruit2)
      println( "fruit1.:::(fruit2) : " + fruit )

      // pass two or more lists as arguments
      fruit = List.concat(fruit1, fruit2)
      println( "List.concat(fruit1, fruit2) : " + fruit  )
    }
    def uni()
    {
        val num = List.fill(10)(2)
      println( "num : " + num  )
      
    }
   def main(args: Array[String]) {
    val nums: List[Int] = List(1, 2, 3, 4)
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val se = Nil
    println(fruit(1))
    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "is list(fruit) empty: " + fruit.isEmpty )
    println( "is list(se) empty : " + se.isEmpty )
    println("****      *****     *****")
    println("Q3.    CONCAT")
    con()
    println("****      *****     *****")
    println("Q6.    UNIFORM ")
    uni()

   }
}