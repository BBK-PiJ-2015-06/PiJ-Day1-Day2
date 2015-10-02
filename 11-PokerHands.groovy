int numClubs = 0
int numDiamonds = 0
int numHearts = 0
int numSpades = 0
int rank1 = 0
int rank2 = 0
int rank3 = 0
int rank4 = 0
int rank5 = 0
int count = 1

// following code reads rank and suite of each card from user. 
// rank of each card stored in ascending order using varaibles rank1, rank2, rank3, rank4 & rank5.
// running tally kept of suites using numClubs, numHearts, numDiamonds & numSpades.
// boolean wrongInput used to ensure rank and suite input is correct.

boolean wrongInput = false
while (count<=5 && !wrongInput) {
	print "Please type the rank for card " + count + " (lower case): "
	String s = System.console().readLine()
	int i = 0
	if (s == "ace") {
		i = 1
	} else if (s == "jack") {
		i = 11
	} else if (s == "queen") {
		i = 12
	} else if (s == "king") {
		i = 13					
	} else {
		char c1 = s.substring(0,1)
		if (c1 == '1' && s.length() >= 2) {
			char c2 = s.substring(1,2)
			if (c2 == '0') {
				i = Integer.parseInt(s)
			} else {
				i = 14 
			}
		} else if (c1 == '2' || c1 == '3' || c1 == '4' || c1 == '5' || c1 == '6' || c1 == '7' || c1 == '8' || c1 == '9') {
			i = Integer.parseInt(s)
		} else {
			i = 14
		}  
	}
	if (i < 1 || i > 13) {
		println "This is not a valid rank."
		wrongInput = true					
	} else {
		if (i >= rank5) {
			rank1 = rank2
			rank2 = rank3
			rank3 = rank4
			rank4 = rank5
			rank5 = i
		} else if (i >= rank4) {
			rank1 = rank2
			rank2 = rank3
			rank3 = rank4
			rank4 = i
		} else if (i >= rank3) {
			rank1 = rank2
			rank2 = rank3
			rank3 = i
		} else if (i >= rank2) {
			rank1 = rank2
			rank2 = i
		} else {
			rank1 = i			
		}
		print "Please type the suite for card " + count + " (lower case): "		
		s = System.console().readLine()
		if (s == "clubs") {
			numClubs = numClubs + 1
		} else if (s == "diamonds") {
			numDiamonds = numDiamonds + 1
		} else if (s == "hearts") {
			numHearts = numHearts + 1
		} else if (s == "spades") {
			numSpades = numSpades + 1
		} else {
			println "This is not a valid suite."
			wrongInput = true			
		}
		count = count + 1
	}
}

// booleans used below to test whether StraightFlush, Flush, Poker...etc has been acheived,
// based on previously stored information about the order of ranks and number of each suite. 

if (count > 5) {
	boolean StraightFlush = false
	boolean Flush = false
	boolean Straight = false
	boolean Poker = false
	boolean FullHouse = false
	boolean ThreeofaKind = false
	boolean TwoPairs = false
	boolean Pair = false
	if (numClubs == 5 || numDiamonds == 5 || numHearts == 5 || numSpades == 5) {
		if ((rank5 - rank4) == 1 && (rank4 - rank3) == 1 && (rank3 - rank2) == 1 && (rank2 - rank1) == 1) {
			StraightFlush = true
		} else {
			Flush = true
		}
	} else if ((rank5 - rank4) == 1 && (rank4 - rank3) == 1 && (rank3 - rank2) == 1 && (rank2 - rank1) == 1) {
		Straight = true
	}
	if (rank1 == rank2 && rank2 == rank3 && rank3 == rank4) {
		Poker = true
	}
	if (rank2 == rank3 && rank3 == rank4 && rank4 == rank5) {
		Poker = true
	}
	if (rank5 - rank3 == 0 && rank2 == rank1) {
		FullHouse = true
	}
	if (rank5 == rank4 && rank3 - rank1 == 0) {
		FullHouse = true
	}
	if (rank5 - rank3 == 0 || rank4 - rank2 == 0 || rank3 - rank1 == 0) {
		ThreeofaKind = true
	}
	if (rank1 == rank2 && rank3 == rank4) {
		TwoPairs = true
	}
	if (rank1 == rank2 && rank4 == rank5) {
		TwoPairs = true
	}
	if (rank2 == rank3 && rank4 == rank5) {
		TwoPairs = true
	}
	if (rank1 == rank2 || rank2 == rank3 || rank3 == rank4 || rank4 == rank5) {
		Pair = true
	}
	if (StraightFlush) {
		println "You have a Straight Flush!"
	} else if (Poker) {
		println "You have a Poker!"
	} else if (FullHouse) {
		println "You have a Full House!"
	} else if (Flush) {
		println "You have a Flush!"
	} else if (ThreeofaKind) {
		println "You have a Three of a Kind"
	} else if (TwoPairs) {
		println "You have two Pairs"
	} else if (Pair) {
		println "You have a Pair"
	} else {
		println "You have nothing"
	}
} else {
	println "Start again."
}
