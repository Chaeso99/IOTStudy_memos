#CH05-Lab03 주민등록번호 뒷자리 의미, 이런 뜻이?!


import random				# 난수 모듈을 불러옴

print("주민등록번호의 성별 정보 번호를 생성합니다.")
gender = random.randrange(4)
gender = gender + 1

print("생성번호: " + str(gender))	   	# 문자와 숫자 연결하여 출력할 때를 주의

if gender == 1 or gender == 3:	# gender가 1 또는 3이면 남성
	print("남성입니다")
else :					# gender가 2 또는 4이면 여성
	print("여성입니다")
print("프로그램을 종료합니다.")
