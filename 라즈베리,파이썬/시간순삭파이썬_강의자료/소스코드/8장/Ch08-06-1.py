#CH08-06. 함수의 값 반환하기

##################################################################
##원의 면적을 계산


def calculate_area (radius):	# 함수의 정의
    area = 3.14 * radius**2
    return area			# 함수 값의 반환

c_area = calculate_area(5.0)	# 함수의 호출
print(c_area)

area_sum = calculate_area(5.0) + calculate_area(10.0) 
				# 수식에 적용된 함수 호출
print(area_sum)

