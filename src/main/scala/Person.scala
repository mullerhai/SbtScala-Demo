/**
  * Created by zhanghaining on 2017/1/24.
  */
import  java.util.'HashMap'


object Person {


  def main(args: Array[String]): Unit = {
    val person=new Duck()
    person.eye=3
    person.foot=4
    person.hand=5
    person.leg=12
    var duckRel=person.sayHello("I am  one duck really")
 val result= computeAdd(4,5)
    val dive=computeDivide(12,4)
    val dogBread=List("China","Chine","France","Japan","American","Mexico")
    for (bread<- dogBread){ println(bread)
    if(bread.length>5){
      println("Big Error")
    }}
    for(i <- 1 to 10){
      println("hello world" +
        "maha")
    }
    println("中国人名"+result +dive+duckRel)
  }

  def computeAdd(a:Integer,b:Integer):Integer={
  val c= a + b
  return c
  }

  def computeDivide(a:Integer,b:Integer):Integer={
    val result=a/b
    return result
  }
}
