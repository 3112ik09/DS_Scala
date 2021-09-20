object student{
    def check(a :Int ) : Boolean ={
        if(a>65)
        return true
        else 
        false
    }
    def main(args : Array[String])
    {
        var a : Int =75
        if(check(a))
        {
            a=a+20
            println("\n student passed with distinction")

        }
        else
        println("sry !! failed")
    }
}