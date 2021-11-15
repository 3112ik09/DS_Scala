import Array._
object run{

    def q6()
    {
        val fruits = Array("cherry", "apple", "banana")
        for(x<-fruits)
        println(x)
        println("after sorting ::")
        scala.util.Sorting.quickSort(fruits)
        for(x<-fruits)
        println(x)
    }

    def q7()
    {
        var arr= Array(Array(1,2,3),
                    Array(4,5,6),
                     Array(7,8,9))
        for(i<-0 to 2)
        {
        for(j<-0 to 2)
            print(" "+arr(i)(j))
         println()   
        }
        println("New matrix ::")
        for(i<-0 to 2)
        {
        for(j<-0 to 2)
            print(" "+arr(2-j)(2-i))
         println()   
        }
    }

    def q8()
    {

        var arr= Array(Array(1,2,3),
                    Array(4,5,6),
                     Array(7,8,9))
        for(i<-0 to 2)
        {
        for(j<-0 to 2)
            print(" "+arr(i)(j))
         println()   
        }
        println("New matrix ::")
        for(i<-0 to 2)
        {
        for(j<-0 to 2)
            print(" "+(arr(i)(2)/3))
         println()   
        }
    }
    def q9()
    {
        val arr = Range(1 ,30 , 5)
        for(x <-arr)
        println(x)
        var arr1 = Array(1, 2, 3, 4)
        var arr2 = Array(5, 6, 7, 8)

        var arr3 = concat( arr1, arr2)
        println("concatenate array :")
        for(x<-arr3)
        println(x)
    }
    def main(a : Array[String])
    {
        println("answer of q6")
        q6()
        println("******     *******     *******\n")
        q7()
        println("******     *******     *******\n")
        q8()
        println("******     *******     *******\n")
        q9()
        println("******     *******     *******\n")



    }
}