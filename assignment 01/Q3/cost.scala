object cost extends App{
	def shipping(x:Int)=if(x<50)3*50 else 3*50+(x-50)*.75;
	def coverPrice(x:Int)=24.95*x;
	def discount(x:Int)=x*.4;


	def cost(x:Int)=coverPrice(x)-discount(x)+shipping(x);
	println(cost(60));
}