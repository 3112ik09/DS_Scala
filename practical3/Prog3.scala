object Run {
            var varByte : Byte = 10 ;
            var varShort : Short = 1
            var varInt : Int = 20
            var varLong : Long = 100000
            var varFloat : Float = 3.15f
            var varDouble : Double = 1.56789
            var varChar : Char = 'a'
            var varStr  = "ishant" 
            var a: Boolean = true

    def unitTest(a: String) :Unit = {
        println("Unit datatype returns void  ");
    }

    val nullVal :String = null 
    val NullVal : Null = null
    
    def logException() :Nothing = {
        println(" logging Exeption ")
        throw new Exception(" my new Exception")
    }

    def Aval(x:AnyVal)  = println(x) 
    def Aref(x:AnyRef)  = println(x)
    def Anny(x:Any) = println(x)

    def main(args : Array[String])
    {
            
        println(" Byte  = "+varByte);
        println(" int = "+varInt);
        println(" short  = "+varShort);
        println(" Long  = "+varLong);
        println(" Float  = "+varFloat);
        println(" Double  = "+varDouble);
        println(" char  = "+varChar);
        if(a)
        println(" boolean is true") ; 
        // println(nullVal.length);

        // println(NullVal.length);

        unitTest(" aa");
        // logException() ; 
        Aval(2); 
        Aref(nullVal);
        Anny('s');



        
    }

}

