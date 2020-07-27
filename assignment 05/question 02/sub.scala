import io.StdIn._

object Sub extends App{

	val x = new Rational(3,4)
   	val y = new Rational(5,8)
    	val z = new Rational(2,7)

	println("Rational x is " +x)
    	println("Rational y is " +y)
    	println("Rational z is " +z)
    	
    	val result= x-y-z
    	println("X - Y - Z = "+ result)

}

class Rational(n:Int,d:Int){

	private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        def numer=n/GCD(n,d)
        def denom=d/GCD(n,d)

	//def neg= new Rational(-this.numer,this.denom)
	
	override def toString= numer+"/"+denom
	def -(r:Rational)= new Rational(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom)

	
	
}

