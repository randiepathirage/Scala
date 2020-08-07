import io.StdIn._
import scala.math.sqrt

case class Point(a:Int,b:Int){
	def x:Int=a;
	def y:Int=b;

	def +(p:Point)=Point(this.x+p.x,this.y+p.y);

	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);

	def distance(p:Point)=sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		
	def invert()=Point(this.y,this.x);
}

object Case extends App{
	val p1=Point(8,4);
	val p2=Point(1,1);

	print("p1=");
	println(p1);

	print("p2=");
	println(p2);

	//sum of p1 and p2
	val sum=p1+p2;
	print("sum of p1 and p2=");
	println(sum);
	
	//move p1 
	val p3=p1.move(2,3);
	print("p1 move by(2,3)=");
	println(p3);

	//distance
	val dis=p1.distance(p2);
	print("distance between p1 and p2=");
	println(dis);

	//invert p1
	val inverted=p1.invert()
	print("invert p1=");
	println(inverted);

	
}

