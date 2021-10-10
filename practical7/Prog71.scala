object run{
    def fun(a :Int , b:Int) : Unit ={
        if(a>b)
        {
            println("the greater no is " , a)
            if(b<a)
            println("the smaller no is " , b)
        }
        else
        {
             println("the greater no is " , b)
            if(a<b)
            println("the smaller no is " , a)
        }
        }

    def main(a : Array[String])
    {
        var n :Int =0
        var m :Int =0
        n = scala.io.StdIn.readInt()
        m = scala.io.StdIn.readInt()
        fun(n, m)
    }
}