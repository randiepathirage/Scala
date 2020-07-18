import io.StdIn._
object ceasarCipher extends App{

	var alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	
	//encryption function
	val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

	//decryption function
	val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>
	s.map(algo(_,key,a))
	
	//take input to the function
	var s=readLine("enter message:")
	print("Shift by:")
	var key=readInt()

	print("The Encrypted message:")
	val cipherText=cipher(E,s,key,alphabet)
	println(cipherText)

	print("The Decrypted message:")
	val plainText=cipher(D,cipherText,key,alphabet)
	println(plainText)

}