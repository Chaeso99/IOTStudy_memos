#CH10-03.파일에서 전체 데이터 읽기


##################################################################
##한 번에 파일의 모든 줄을 읽는 프로그램

infile = open("d:\\phones.txt", "r")
lines = infile.readlines( ) 
print(lines)
infile.close( )
