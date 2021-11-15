object run 
{ 
    def t2()
    {
        var L1 = List("Pasta", "Pizza", "Juice")
        var L2 = List(5.5,5.2,5.3)
        val menu = L1.zip(L2).toMap
        val a = menu.keySet.toList
        val b = menu.values.toList
        println("keyset ---> "+a)
        println("values --> "+b)
    }
    def t3()
    {
        val i = Iterator(5, 1, 2, 3, 6, 4)
        while (i.hasNext)
            println(i.next)
    }
    def t4()
    {
            val Numbers = (300 to 400).filter(_ %2 == 0).take(20).toList.mkString(",")
            println(Numbers)
    }
    def main(args:Array[String]) 
    { 
        // Creating a set 
        val s1 = Set(5, 11, 23, 72, 14, 21, 118) 
        val m = s1.min
        val s = s1.max
        println(m)
        println(s)
        println("****      *****     *****")
        println("Q2.    map ")
        t2()
        println("****      *****     *****")
        println("Q3.    Iterate ")
        t3()
        println("Q4.    Even /no ")
        t4()
    } 
} 