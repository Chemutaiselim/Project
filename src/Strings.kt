fun main(args: Array<String>) {
val str= "may the force be with you"
    println(str)
    //\" quotation
    //\t tab
    //\n
    //\b
    //\r
    //\\
    //\$
//raw string
    val threequo=""">a long time ago
        >in a galaxy 
        |far,far, away...
        |BUMM BUMM BUMM""".trimMargin(">")
    println (threequo)
   // for(char in str){
       // println(char)
       val contentequals= str.contentEquals("May the force be with you")
    println(contentequals)
}