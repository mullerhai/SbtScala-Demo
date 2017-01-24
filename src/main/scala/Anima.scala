/**
  * Created by zhanghaining on 2017/1/24.
  */
abstract class Anima {

  var leg:Integer
  var foot:Integer
  var eye:Integer
  var hand:Integer
  def sayHello (word:String):String={
    return word
  }
  def eat(ani:Any):String={
    return ani.toString
  }

}
