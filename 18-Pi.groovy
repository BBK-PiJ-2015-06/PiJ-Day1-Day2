print "Please enter a positive integer: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
int k = 0
double approx = 0
double output = 0
while (k <= n) {
	if (k % 2 == 0) {
		approx = 4*(1/(2*k + 1))
	} else {
		approx = -4*(1/(2*k + 1))
	}
	k = k + 1
	output = output + approx
}
println output