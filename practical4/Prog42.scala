object run2{
    def add (a :Int , b: Int ) : Int={
        return a+b
    }
    def main(args : Array[String])
    {
        var a:Int = 5 ; 
        var b : Int = 10  ; 
        println("the sum is " ,add(a,b)) ; 

        // immutable 
        val c : Int = 3 ; 
        val d : Int=  4; 
        println("the sum is",add(c,d)) ;
    }
}