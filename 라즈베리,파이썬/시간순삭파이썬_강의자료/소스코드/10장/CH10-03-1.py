#CH10-03.파일에서 전체 데이터 읽기

##################################################################
##한 번에 파일의 모든 줄을 읽는 함수는 파일 객체의 read( )

infile = open("d:\\phones.txt", "r")
lines = infile.read( ) 
print(lines)
infile.close( )
