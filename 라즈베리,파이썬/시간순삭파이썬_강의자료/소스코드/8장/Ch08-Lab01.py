#CH08-Lab01 BMI 계산기

def BMI(height, weight) :
    result = weight / (height*height)
    return result

def result_print(result) :		#매개변수 result는 result_print( )에서 지역변수입니다.
    if result < 18.5 :
        print("당신은 저체중입니다.")
    elif result < 23 :
        print("당신은 정상입니다.")
    elif result < 25 :
        print("당신은 과체중입니다.")
    elif result < 30 :
        print("당신은 경도비만입니다.")
    else :
        print("당신은 고도비만입니다.")

h = float(input("키를 m단위로 입력하세요: "))
w = float(input("몸무게를 kg단위로 입력하세요: "))

result = BMI(h, w)
result_print(result)
