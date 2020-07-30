import scala.collection.immutable._  
import scala.math.BigDecimal

object Bank extends App {

    //account class
    class Account(id:String,n:Int,b:Double){
        val nic : String = id
        val accNo: Int = n
        var balance : Double = b

        override def toString = nic+ " : " + accNo + " : Rs " + BigDecimal(balance).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

        
        def transfer (acc : Account, transferAmount:Double){
            this.balance=this.balance-transferAmount
            acc.balance=acc.balance+transferAmount;
        }
    }

    var BankAccounts  : List[Account] = List(new Account("9867609296V",4381,12345.76),new Account("9866759296V",111,11111.11),new Account("9453159296V",5555,15555.55),
   new Account("9459869296V",32411,4321.44) )
   
    println("........Bank deatails before transaction...........")
    for ( element <- BankAccounts){
        println(element)
    }
    println("........Bank deatails after transaction...........")
    BankAccounts(0).transfer(BankAccounts(1),100000.20)
    BankAccounts(2).transfer(BankAccounts(3),25000.40)
     for ( element <- BankAccounts){
        println(element)
    }

}
