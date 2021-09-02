class demo {
    private var pr_a : Int = 1
    protected var pro_a :Int = 2
    var a : Int = 3 
    def show() {
        println("\npublic var inside own class "+a)
        println("\nprivate var inside own class "+pr_a)
        println("\nprotected var inside own class "+pro_a)
    }
}
class child extends demo{
    def showChild(){
        println("\npublic var inside sub class "+a)
        println("\nprivate var cannot used inside sub class")
        println("\nprotected var inside sub class "+pro_a)
    }

}

object Run3{
    def main(args : Array[String])
    {
        var e = new demo() 
        var obj = new child()
        e.show()
        obj.showChild()
    }
}