int i = 2
while (i <= 1000) {
	boolean prime = true
	int count = 2;
	while (count < i) {
		int j = i % count
		if (j == 0) {
			prime = false
		} 
		count = count + 1
	} 
	if (prime) {
		println i
	} 
	i = i + 1
}

//assuming 0 & 1 are regarded as non prime