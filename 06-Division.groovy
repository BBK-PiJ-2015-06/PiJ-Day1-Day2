print "Please type in a positive number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please type in another positive number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int num1store = num1
int quotient = 0
int rem = num1
boolean finished = false
while (!finished) {
	if ((num1 - num2) >= 0) {
		quotient = quotient + 1
		rem = rem - num2
		num1 = num1 - num2
	} else {
		finished = true
	}
}			 
println num1store + " divided by " + num2 + " is " + quotient + " remainder " + rem
