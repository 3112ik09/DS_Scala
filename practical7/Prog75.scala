object run5{

    def main(args : Array[String])
    {
        val nums = Array(1, 8,9,3,4,5) ;
        var max : Int =0 
        for(x <- nums)
        if(x>max)
            max = x
        
        println("the maximum no in the array is " , max)


    }
}