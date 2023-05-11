#CH12-18. 우리나라 인구 분석#2

##################################################################
##여성 평균 연령 정보만 추출

import csv
data = csv.reader(open('age.csv','r'), delimiter=",")
 
for row in data:
    print(row[0], row[2])
