object salary extends App{

	def normal(h:Int)=150*h;
	def ot(t:Int)=75*t;
	def income(h:Int,t:Int)=normal(h)+ot(t);

	def tax(income:Int)=income*.1;

	def salary(h:Int,t:Int)=income(h,t)-tax(income(h,t));

print(salary(40,20));
}