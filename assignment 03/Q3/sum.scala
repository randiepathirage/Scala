import io.StdIn._
object sum extends App{
	def cal(a:Int):Int= a match{
		case 0 =>0;
		case 1 =>1;
		case _ =>a+cal(a-1);
	
	}

	print("enter number:");
	var s=readInt();
	print(cal(s));

}