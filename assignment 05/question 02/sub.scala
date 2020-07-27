import io.StdIn._

object Sub extends App{

	val a = new Rational(3,4)
   	val b = new Rational(5,8)
    	val c = new Rational(2,7)

}

class Rational(n:Int,d:Int){

	private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        def numer=n/GCD(n,d)
        def denom=d/GCD(n,d)

	def neg= new Rational(-this.numer,this.denom)
	
	def - (number:Rational)= new Rational
	(this.numer*numer.denom-this.denom*number.numer,
	this.denom*numer.denom)

	override def toString= numer+"/"+denom
	
}

