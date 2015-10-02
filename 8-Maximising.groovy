print "Please enter a positive integer (finish with -1): "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
if (num1 < 0) {
	println "Positive numbers please!"
} else {
	int output = num1
	boolean finished = false
	while (!finished) {
		print "And another: "
		str = System.console().readLine()
		int num2 = Integer.parseInt(str)
		if (num2 <-1) {
			println "Positive numbers please!"
			break;
		} else if (num2 > num1) {
			output = num2
			num1 = num2
		} else if (num2 == -1) {
			finished = true
        	}	
	}		
	println "Largest number in series: " + output
}
