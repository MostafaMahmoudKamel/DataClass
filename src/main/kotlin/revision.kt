fun main(){
    var obj=User(name="dehsa",address="talkha",age=21)
    obj.printData()
    //copy
    var obj2=obj.copy(name="abdo")
    obj2.printData()
    //companentN
    println(obj.component1())//name
    println(obj.component2())//age
    println(obj.component3())//address
    //equals
    println(obj==obj2)//false name is different
    //destructing
    var (name,age)=obj
    println("$name $age")

    //innerClass in
    var OBJECT=Outer()
    var OBJECT2=OBJECT.Inner().printing()
}
data class User(var name:String,val age:Int,var address:String){
    fun printData()=println("my name is $name , my age is $age , address $address")
}
class Outer{
    var myName:String="Abood"
    inner class Inner{
        fun printing()=println(myName)
    }
}