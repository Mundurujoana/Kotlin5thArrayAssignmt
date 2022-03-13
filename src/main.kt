fun main() {
//question1
    var finalresult = pdtOfArray(arrayOf(1,2,5,3))
    println(finalresult)

    //question2
   var result = findSum(arrayOf("joana",1.25,3,78F,true,'a',"school",45.7,2.9))
    println(result)

    //question3
    var myvowls = vowChar(arrayOf('a','e','i','o','u'))
    println(myvowls)
}
//1.Write a function that takes in an array of integers and returns the product of
//all the elements(3pts)
fun pdtOfArray(num:Array<Int>):Int {
    var product = 1
    num.forEach { cal->
        product *= cal
        }
return product
}

//2.Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements(3pts)
fun findSum(numb: Array<Any>): Double{
    var sum = 0.0
    numb.forEach { mixed ->
        if (mixed is Double) {
            sum += mixed
        }
        }
    return sum
}

//3.Write a function that takes in an array of characters and returns the number of
//vowels in the array.
fun vowChar(vowch:Array<Char>):Any {
    var count =0
    vowch.forEach { ch ->
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
           count++
        }
    }
        return count

}