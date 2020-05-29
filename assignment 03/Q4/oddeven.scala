import io.StdIn._
object oddeven extends App{
	print("enter number:");
	var v=readInt();

	if(isEven(v))
		print("even");

	else
		print("odd");

	def isEven(n:Int):Boolean={
		n match{
		case 0 => true;
		case _ =>isOdd(n-1);
		}
	}

	def isOdd(n:Int):Boolean= !(isEven(n))



}