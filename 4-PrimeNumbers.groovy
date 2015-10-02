print "Please type in a positive number to test whether it is prime: "
String str = System.console().readLine()
int i = Integer.parseInt(str)
if (i <= 1) {
	println "This is not a prime number"
} else {
	int count = 2
	boolean prime = true
	while (count < i) {
		int j = i % count
		count = count + 1
		if (j == 0 ) {
			prime = false
		}
	}
	if (prime) {
		println "This is a prime number"
	} else {
		println "This is not a prime number"
	}
}

//assuming 0 & 1 are regarded as non prime