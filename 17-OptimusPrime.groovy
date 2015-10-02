print "Please type in a positive integer to find the closest prime number: "
String s = System.console().readLine()
int i = Integer.parseInt(s)
boolean prime = false
if (i <=1) {
	println "Closest prime number(s) is: 2"
} else {
	int count = 2
	prime = true
	while (count < i) {
		int j = i % count
		count = count + 1
		if (j == 0) {
			prime = false
		}
	}
	if (prime) {
		println i + " is a prime number."
	} else {
		int increase = i
		int decrease = i
		boolean incPrime = false
		boolean decPrime = false
		while (!incPrime && !decPrime) {
			increase = increase + 1
			decrease = decrease - 1
			count = 2
			incPrime = true
			while (count < increase) {
				int j = increase % count
				count = count + 1
				if (j == 0) {
					incPrime = false
				}
			}
			count = 2
			decPrime = true
			while (count < decrease) {
				j = decrease % count
				count = count + 1
				if (j == 0) {
					decPrime = false
				}
			}
		}
		print "Closest prime number(s) is: "
		if (incPrime && decPrime) {
			println increase + " and " + decrease
		} else if (incPrime && !decPrime) {
			println increase
		} else {
			println decrease
		}
	}
}	