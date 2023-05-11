#CH10-04. 파일에서 한 줄씩 읽어오기


##################################################################
##파일의 크기가 커서 줄을 일일이 셀 수 없는 경우 1

infile = open("d:\\phones.txt", "r")
line = infile.readline( ).rstrip( )
while line != "":
    print(line)
    line = infile.readline( ).rstrip( )
    
infile.close( )
