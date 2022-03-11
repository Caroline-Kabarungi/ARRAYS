fun main(){
    create("dan","carol", "suzan","brian")
    capitalize()
    numbers()
    var list=arrayOf("carol","shivan","shalon")
        println(list.contentToString())



}
    fun create(a:String, b:String, c: String, d:String) {
        var names = arrayOf(a, b, c, d)
        println(names.contentToString())
    }
fun capitalize(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    for (carol in cities)
        println(carol.capitalize())



}
fun numbers(){
    var numbers=arrayOf(32,174,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var element=numbers.sortedArray()
    println(element.contentToString())

}
fun list(state:Array<String>):Array<String>{

    return state
}

