import io.StdIn._

object Negative extends App{

	val x = new Rational(3,4)
	var negativeX=x.neg
	println(negativeX)

	val z = new Rational(2)
	var negativeZ=z.neg
	println(negativeZ)

   	val y = new Rational(5,0)
	var negativeY=y.neg
	println(negativeY)
}

class Rational(n:Int,d:Int){
	require(d>0,"d must be greater than 0")	

	def numer=n/GCD(n,d)
        def denom=d/GCD(n,d)

	//constructor
	def this(n:Int)=this(n,1)

	private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        

	def neg= new Rational(-this.numer,this.denom)

	override def toString= numer+"/"+denom

}

