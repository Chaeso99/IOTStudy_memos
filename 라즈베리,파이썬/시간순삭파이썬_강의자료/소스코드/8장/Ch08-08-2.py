#CH02-08. 지역 변수와 전역 변수

##################################################################
##원의 면적을 계산-전역변수

result = 0
def calculate_area( ):
    global result
    result = 3.14 * r **2

r = float(input("원의 반지름: "))
calculate_area( )
print(result)
