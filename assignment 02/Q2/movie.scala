object movie extends App{
	def attendees(p:Int)= 120+(15-p)/5*20;
	def revenue(p:Int)= attendees(p)*p;
	
	def cost(attendees:Int)=500+attendees*3;
	def profit(p:Int)= revenue(p)-cost(attendees(p));

	print(profit(5), profit(10), profit(15), profit(20));
	print(profit(25), profit(30), profit(35), profit(40))  
}

//price of Rs 15.00 per ticket, 120 people attend a performance
//Decreasing the price by  5 Rupees increases attendance by 20 
//increasing the price by  5 Rupees decreases attendance by 20
//Every performance costs the owner Rs.500
//Each attendee costs another 3 Rupees