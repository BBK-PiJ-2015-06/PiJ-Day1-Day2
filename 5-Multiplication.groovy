print "Please type in a number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please type in another number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int num2store = 0
if (num2 < 0) {
	num2store = num2
	num2 = num1
	num1 = num2store	//swaps the values of num1 and num2
}			
if (num1 < 0 && num2 < 0) {
	num1 = num1 - num1 - num1
	num2 = num2 - num2 - num2	//finds absolute values of num1 and num2
}			
int total = 0
int count = 0
while (count < num2) {
	total = total + num1
	count = count + 1
}
println "The product of these two numbers is: " + total