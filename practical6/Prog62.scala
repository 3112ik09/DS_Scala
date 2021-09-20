object run2{ 

    def check(a : Int ) : Boolean ={
        var i :Int =0
        for(i<-2 until a)
        if(a%i==0)
        return false
        return true
    }

    def main( args : Array[String])
    { 
        var a :Int =0 
        a = scala.io.StdIn.readInt()
        if(check(a))
        println("is prime no")
        else 
        println("is not prime no ")
    }
}