import io.StdIn._
object prime extends App{
	def gcd(i:Int,x:Int):Int=x match{
	case 0=>i
	case x if i<x=>gcd(x,i)
	case _ => gcd(x,i%x)
	}

	def cal(i:Int,x:Int=2):Boolean=x match{
	case x if (x==i)=>true
	case x if gcd(i,x)>1=>false
	case _ =>cal(i,x+1)
	}
	
	print("enter number:");
	var v=readInt();
	println(cal(v));
}