fun main(){
    var obj=dc("Mostafa",21)
    var obj2=dc("Mostafa",22)
    var obj3=dc()//parameter is default in dataClass
    //assigment 2 object
    println(obj==obj2)
    obj.printInfo()
    obj3.printInfo()
    // companentN()
    println(obj3.component1())
    println(obj3.component2())
    //destructing dataClass
    var obj4=dc(age=33)
    var(name,age)=obj4
    //or var(name,age)=dc() if i have defaults value in data class
    println(name)
    println(age)
    //copy
    //in copy calling function by parameter a
    var obj5=obj3.copy(name=obj3.name,age=23)
    println("${obj5.name} ${obj5.age}")

}
data class dc(var name:String="desha",var age:Int=22){
    fun printInfo(){
        println("My name is $name and my age is $age")
    }
}