object even extends App{
	print("enter number:");
	var v=io.StdIn.readInt();
	println(cal(v));

	def cal(n:Int):Int={
		n match{
			case 0 =>0
			case x if(isEven(x)) =>x+cal(x-1)
			case _ => cal(n-1)
		}	
	}

	def isEven(n:Int):Boolean={
		n match{
		case 0 => true;
		case _ =>isOdd(n-1);
		}
	}

	def isOdd(n:Int):Boolean= !(isEven(n))





}