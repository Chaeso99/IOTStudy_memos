#CH02-08. 지역 변수와 전역 변수

##################################################################
##원의 면적을 계산

def calculate_area( ):
    result = 3.14 * r **2
    return result

r = float(input("원의 반지름: "))
area = calculate_area( )
print(area)
