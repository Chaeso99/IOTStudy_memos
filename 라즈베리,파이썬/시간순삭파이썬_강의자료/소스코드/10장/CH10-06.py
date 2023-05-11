#CH10-06. 파일에서 단어 단위로 읽어오기

##################################################################
##‘proverbs.txt’ 파일에서 반복문과 split( )를 이용하여 단어를 분리하여 출력

infile = open("proverbs.txt", "r")
for line  in infile:
	line = line.rstrip( )
	word_list = line.split( )
	for word in word_list:
		print(word)
infile.close( ) 
