#CH12-18. 우리나라 인구 분석#2

##################################################################
##CSV 파일 처리

import csv
data = csv.reader(open('age.csv', 'r'),delimiter=",")
next(data)

for row in data:
	print(row)

