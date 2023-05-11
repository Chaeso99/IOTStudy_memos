#CH05-Lab07 이차방정식 판별

a=float(input("a값 입력: "))
b=float(input("b값 입력: "))
c=float(input("c값 입력: "))

D = b*b - 4*a*c

if D > 0 :
    print("방정식의 근은 서로 다른 두 실근입니다.")
elif D == 0 :
    print("방정식은 서로 같은 두 실근(중근)입니다.")
else :
    print("방정식은 서로 다른 두 허근입니다.")
