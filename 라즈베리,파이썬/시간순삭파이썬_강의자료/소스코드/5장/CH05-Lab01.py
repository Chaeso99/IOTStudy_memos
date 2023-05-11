#CH05-Lab01 직각삼각형 판별하기


a = int(input("변a의 길이: "))
b = int(input("변b의 길이: "))
c = int(input("변c의 길이: "))

if c * c == a * a + b * b:			
    print("직각삼각형입니다.")
else:
    print("직각삼각형이 아닙니다.")
