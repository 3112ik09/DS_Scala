class calculator{
    val add = (  a : Int ,  b : Int) => a+b
    val sub = (  a : Int ,  b : Int) => a-b
    val mul =(  a : Int ,  b : Int) => a*b
    val divide = (  a : Int ,  b : Int) => a/b
}

object Run{
    var a : Int = 0 
    var b : Int = 0 
    def main(args : Array[String])
    {
        println("Enter first number")
         a = scala.io.StdIn.readInt(); 
         println("Enter second number")
         b = scala.io.StdIn.readInt(); 
        var obj = new  calculator(); 
        println("addition  = "+obj.add(a,b)); 
        println("subtraction   = "+obj.sub(a,b)); 
        println("multiplication  = "+obj.mul(a,b)); 
        println("division  = "+obj.divide(a,b)); 
    }
}