int i = 2
int count = 0
while (count < 1000) {
	boolean prime = true
	int countdiv = 2;
	while (countdiv < i) {
		int j = i % countdiv
		if (j == 0) {
			prime = false
		} 
		countdiv = countdiv + 1
	} 
	if (prime) {
		println i
		count = count + 1
	} 
	i = i + 1
}

//assuming 0 & 1 are regarded as non prime