object cost extends App{
	def shipping(x:Int)=if(x<50) 50*3 else 3*50+(x-50)*.75;
	def Price(x:Int)=24.95*x*0.6;


	def cost(x:Int)=Price(x)+shipping(x);
	println(cost(60));
}