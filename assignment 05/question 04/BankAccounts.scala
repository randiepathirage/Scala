
object BankAccounts extends App {
	val acc1 = new Account("986769296V", 231, 50985)
	val acc2 = new Account("654212345V", 567, 60000)	
	val acc3 = new Account("956843422V", 777, -3400)
	val acc4 = new Account("654312907V", 675, 4500)
	val acc5 = new Account("985434308V", 111, -4230)
 
	var i:List[Account]=List(acc1, acc2, acc3, acc4, acc5)

  
	val negativeBal=i.filter(_.balance<0)

	//Total of all account balances
	val bal=i.map(x=>x.balance).reduce(_+_)

	println("..........Accounts with negative balances...........")
	println(negativeBal)

	print("\nTotal balance of all bank accounts:")
	println(bal)

	i.map(x=>if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
	println("\n..........Accounts after adding interest...........")
	println(i)
}

class Account(id: String, n: Int, i: Double) {
	val nic: String = id
	val accNo: Int = n
	var balance: Double = i

def transfer(toAcc: Account, cash: Double): Unit = {
    this.balance = this.balance - cash
    toAcc.balance = toAcc.balance + cash
  }

override def toString = "[ " + nic + " : " + accNo + " : " + balance + " ]"
}

