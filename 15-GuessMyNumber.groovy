println "Try to guess my number! (between 0 and 1000)"
int numberToGuess = Math.abs(1000 * Math.random())
print "Tell me a number: "
String s = System.console().readLine()
int userGuess = Integer.parseInt(s)
int count = 1
	while (userGuess != numberToGuess) {
		if (userGuess < numberToGuess) {
			println "No! My number is higher."
		} else {
			println "No! My number is lower."
		}
		count = count + 1
		print "Tell me a number: "
		s = System.console().readLine()
		userGuess = Integer.parseInt(s)
	}
println "CORRECT"
println "You neededed " + count + " guesses."
