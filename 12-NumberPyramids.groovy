print "Please type a number indicating the number of rows for the pyramid: "
String s = System.console().readLine()
int maxRows = Integer.parseInt(s)
int rowNum = 0
while (rowNum < maxRows) {
	rowNum = rowNum + 1
	int columnNum = 0
	while (columnNum < rowNum) {
		print rowNum
		columnNum = columnNum + 1
	}
	println " "
}
