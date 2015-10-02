print "Please type in a number: "
String str = System.console().readLine()
int i = Integer.parseInt(str)
print "And another: "
str = System.console().readLine()
int j = Integer.parseInt(str)
print "And another: "
str = System.console().readLine()
int k = Integer.parseInt(str)
int order1 = 0
int order2 = 0
int order3 = 0
if (i <= j && j <= k) {
	order1 = i
	order2 = j
	order3 = k
} else if (j <= i && i <= k) {
	order1 = j
	order2 = i
	order3 = k
} else if (j <= k && k <= i) {
	order1 = j
	order2 = k
	order3 = i
} else if (k <= j && j <= i) {
	order1 = k
	order2 = j
	order3 = i
} else if (k <= i && i <= j) {
	order1 = k
	order2 = i
	order3 = j
} else {
	order1 = i
	order2 = k
	order3 = j
}
println "In ascending order, these numbers are: " + order1 + ", " + order2 + ", " + order3
