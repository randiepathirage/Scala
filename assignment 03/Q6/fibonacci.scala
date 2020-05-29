object fibonacci extends App{
	
	print("enter number:");
	var v=io.StdIn.readInt();
	fiboseq(v);

	def fibo(n:Int):Int=n match{
		case 0 => 0
		case 1 => 1
		case _ => fibo(n-1)+fibo(n-2);	
	}

	def fiboseq(n:Int):Unit={
		if(n>0) fiboseq(n-1)
		println(fibo(n))
	}

}