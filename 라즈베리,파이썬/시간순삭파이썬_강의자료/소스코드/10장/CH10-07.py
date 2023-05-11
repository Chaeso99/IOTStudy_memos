#CH10-07. CSV 파일을 사용해보기

##################################################################
##split( ) 함수를 이용하여 문자열을 분리

import csv
f = open('d:\\input.csv','r')
data = csv.reader(f)

for line in data :
    print(line)

f.close( )
