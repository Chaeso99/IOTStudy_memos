#CH08-06. 함수의 값 반환하기

##################################################################
##함수를 호출 하여 수행하게 했어도, 그 반환 값을 사용하지 않을 수도 있습니다.

def calculate_area (radius):		# 함수의 정의
    area = 3.14 * radius**2
    return area

calculate_area(5.0)			# 함수의 호출

