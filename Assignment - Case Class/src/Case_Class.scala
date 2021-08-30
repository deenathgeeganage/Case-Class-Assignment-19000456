import scala.math.sqrt
import scala.math.pow

object Case_Class extends App {
  val a=Point(5,7)
  val b=Point(1,6)

  // Question 1-Add two given points
  println(a+b)

  //Question 2-Move the point by given distance
  val p3=a.move(6,8)

  //Question 3-Calculate the distance between two points
  println(b.distance(a))

  //Question 4-Invert a point
  println(a.invert())

}

case class Point(a:Int,b:Int){

  def x:Int=a
  def y:Int=b

  def +(p:Point):Point=Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int):Point=Point(this.x+dx,this.y+dy)
  def distance(p:Point):Double= sqrt( pow(this.x-p.x,2) + pow(this.y-p.y,2))
  def invert():Point= Point(this.y,this.x)
  override def toString:String="(" +x+ "," +y+ ")"

}
