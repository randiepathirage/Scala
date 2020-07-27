import io.StdIn._

object Negative extends App{

	//take input from user
	print("ENTER NUMERATOR:")
	var num=readInt()

	print("ENTER DENOMINATOR:")
	var den=readInt()

	val r1=new Rational(num,den)
	var negative=r1.neg
	println(negative)
}

class Rational(n:Int,d:Int){

	private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        def numer=n/GCD(n,d)
        def denom=d/GCD(n,d)

	def neg= new Rational(-this.numer,this.denom)

	override def toString= numer+"/"+denom

}

