#CH10-04. 파일에서 한 줄씩 읽어오기

##################################################################
##파일에서 한 번에 하나의 줄만 읽어 오기

infile = open("d:\\phones.txt","r")

line1 = infile.readline( )
print(line1)

line2 = infile.readline( )
print(line2)

infile.close( )
