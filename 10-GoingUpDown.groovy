print "Please enter a positive integer (end with -1): "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
boolean consecutive = true
boolean finished = false
while (!finished) {
	print "And other: "
	str = System.console().readLine()
	int num2 = Integer.parseInt(str)
	if (num2 == -1) {
		finished = true
		break;
	} else if ((num2 - num1) != 1 && (num2 - num1) != -1) {
		consecutive = false
	}
	num1 = num2 
}
if (consecutive) {
	println "Yes"
} else {
	println "No"
}