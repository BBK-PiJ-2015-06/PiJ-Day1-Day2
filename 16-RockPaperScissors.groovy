int scorePlayer1 = 0
int scorePlayer2 = 0
int scoreDiff = 0
String p1 = "0"
String p2 = "0"
while (scoreDiff < 3 && scoreDiff > -3) {
	print "Player 1 choose rock, paper or scissors: "
	String s = System.console().readLine()
	if (s == "scissors" || s == "paper" || s == "rock") {
		p1 = s.substring(0,1)
	} else {
		p1 = "a"
	}
	print "Player 2 choose rock, paper or scissors: "
	s = System.console().readLine()
	if (s == "scissors" || s == "paper" || s == "rock") {
		p2 = s.substring(0,1)
	} else {
		p2 = "b"
	}
	String output = p1 + p2
	if (p1 == p2) {
		println "Draw, no score"
	} else if (output == "pr" || output == "sp" || output == "rs") {
		scorePlayer1 = scorePlayer1 + 1		
	} else if (output == "rp" || output == "ps" || output == "sr") {
		scorePlayer2 = scorePlayer2 + 1
	} else {
		println "Invalid input"
		println "Repeat round"
	}
	println " "
	println "Score: " + scorePlayer1 + "  -  " + scorePlayer2
	println " "
	scoreDiff = scorePlayer1 - scorePlayer2
}
println "FINAL SCORE"
println " "
println "             Player 1: " + scorePlayer1
println "             Player 2: " + scorePlayer2
println " "
if (scorePlayer1 > scorePlayer2) {
	println "Player 1 wins!"
} else {
	println "Player 2 wins!"
}