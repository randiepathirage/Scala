import io.StdIn._
object primeseq extends App{
	def gcd(a:Int,b:Int):Int=b match{
		case 0=>a;
		case b if(b>a)=>gcd(b,a);
		case _=>gcd(b,a%b);
	
	}
	
	def cal(a:Int,b:Int=2):Boolean=b match{
		case x if(x==a)=>true;
		case x if gcd(a,x)>1=>false;
		case _=>cal(a,b+1);
	}

	def call(v:Int,n:Int=2):Unit={
		if(v==n){
			if(cal(v))
				println(v);
			return;
		}
		if(cal(n)){
			println(n);
		}
		call(v,n+1);
	}

	print("enter number:");
	var v=readInt();
	call(v);
}