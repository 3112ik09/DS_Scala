object run2{
    def max(a :Int , b:Int) : Unit ={
        if(a>b)
        println("the grater no is ", a)
        else 
        println("the greater no is",b)

    }
    def min(a :Int , b:Int) : Unit ={
        if(a<b)
        println("the smaller no is ", a)
        else 
        println("the smaller no is",b)

    }


    def main(a : Array[String])
    {
        var n :Int =0
        var m :Int =0
        n = scala.io.StdIn.readInt()
        m = scala.io.StdIn.readInt()
        max(m,n)
        min(m,n)
    }
}