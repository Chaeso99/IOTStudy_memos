#CH12-18. 우리나라 인구 분석#2

##################################################################
##여성 평균 연령이 가장 높은 지역과 그 지역 평균연령을 출력

import csv
data = csv.reader(open('age.csv','r'),delimiter=",")
 
next(data)
next(data)
 
woman = {'age':0, 'loc':''}
 
for row in data :
    row[2] = float(row[2])
    if woman['age'] < row[2]:
        woman['age'] = row[2]
        woman['loc'] = row[0]
         
print('여성 평균 연령이 가장 높은 지역은', woman['loc'],'이고 평균 연령은',woman['age'],'입니다.')
