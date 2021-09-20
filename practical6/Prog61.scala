object run 
{
    def sq(a :Int ) : Int ={
        return a*a; 
    }
    def cube(a : Int ): Int= { 
        return a*a*a;
    }
    def forth( a : Int ): Int ={
        return a*a*a*a ;
    }

    def main(a : Array[String])
    {
        var n :Int =0
        n = scala.io.StdIn.readInt()
        println("the square of no is "+sq(n))
        println("the cube of no is "+cube(n))
        println("the forth of no is "+forth(n))
    }
}