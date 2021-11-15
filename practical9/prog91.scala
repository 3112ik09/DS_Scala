object run{

    def main(a : Array[String])
    {
    //    var z:Array[String] = new Array[String](3)
        var z = new Array[String](3)
        // z(0) = "Zara"; z(1) = "Nuha"; z(4/2) = "Ayan"
        var z1 = Array("Zara", "Nuha", "Ayan")
        println(z1.size)
        // z(0) = 123 
            // OUTPUT ::  required: String
            //         z(0) = 123
            //                ^
            // one error found
        // var z2 = Array(123, 123, 123 )
        // z2(0) = "Aryan"
        // println(z2(0))
        var z3 = Array("Zara", "Nuha", "Ayan")
        var z4 = Array("1", "2", "Ayan")
        z4 = z3
        for ( x <- z4 ) {
         println( x )
      }

    }
}