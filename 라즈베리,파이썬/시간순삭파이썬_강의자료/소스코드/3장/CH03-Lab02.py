#CH03-Lab02 화씨 온도를 섭씨 온도로 변환하기

ftemp = int(input("화씨온도: "))		#화씨온도를 입력받음
ctemp = (ftemp-32)*5/9			#화씨온도를 섭씨온도로 계산
print("섭씨온도:", ctemp)			#계산된 섭씨온도 출력
