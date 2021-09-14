object run
{
    def arthmetic(a:Int , b: Int ) : Unit = {
        println("addition  = "+(a+b))
        println("subtraction  = "+(a-b))
        println("mutliplication  = "+(a*b))
        println("division  = "+(a/b))
        println("modulus= "+(a%b))
         println("-----\t-----\t-----\t-----\t \n")
    }

    def relation(a:Int , b: Int ) : Unit = {
        println("equality (a==b)  is :  "+(a==b))
        println("not equality (a!=b) is :  "+(a!=b))
        println("greater than (a>b) is  :"+(a>b))
        println("less than (a<b) is : "+(a<b))
         println("-----\t-----\t-----\t-----\t \n")
        
    }

    def logical(a:Boolean , b: Boolean ) : Unit = {
        println("logical not  (!a or !b ) is : "+(! a)+" / "+(! b))
        println("logical and (a&&b) is : "+(a && b))
        println("logical or (a||b)  is : "+(a || b))
         println("-----\t-----\t-----\t-----\t \n")
    }

    def bitwise(a:Int , b: Int) : Unit = {
        var c :Int =0 
        c= a|b
        println("Bitwise or (a!b) is : "+c)
        c = a&b
        println("Bitwise and (a&b) is : "+c)
        c = ~a
        println("complement of a  (~a) is :  "+c)
        c = a<<2
        println("leftshift 2 units a (a<<2) is : "+c)
        c=a>>2
        println("rightshift 2 units a (a>>2) is : "+c)
        println("-----\t-----\t-----\t-----\t \n")
    }

    def main(args :Array[String])
    {
        arthmetic(10,5)
        relation(10,5)
        logical(false,true)
        bitwise(2,3)
    }

    
}