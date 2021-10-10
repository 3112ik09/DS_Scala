object run{

    def compare(a :String , b : String)
    {
        if(a.equals(b))
        println("Equal")
        else 
        println("Not Equal")
    }
    def upper_to_lower(a :String)
    {
        println(s"the original string is $a")
        val res =  a.toUpperCase
        println(s"the modified string is $res")
    }
    def index(a :String , b : Char)
    {
        val result = a.indexOf(b)
        println(s"the index of $b in $a =>>"+result)
    }


    def index_sub()
    {
        val string1 = "scala programming language "
        val indexVal = string1.indexOf("lang")
    
        println("The index of first occurrence of the substring is " + indexVal)
    }


    def char_array()
    {
        val ch  = Array('a', 'b', 'c')
        var st = ch.mkString
        println(s"the char array to string is $st")
    }

    def main(args : Array[String])
    {
        val a  = "ABC"
        var b  = "ABC"
        compare(a,b)
        val lower = "isHant"
        upper_to_lower(lower)
        var ch :Char = 's'
        index(lower , ch)
        index_sub()
        char_array()

    }


}