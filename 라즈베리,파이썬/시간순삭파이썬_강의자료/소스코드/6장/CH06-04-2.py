#CH06-04. 횟수 제어 반복을 좀 더 이해시켜 줄 예제

##팩토리얼 계산 프로그램
n = int(input("정수를 입력하시오: "))
fact = 1

for a in range(1, n + 1):		
    fact = fact * a

print(n, "!은", fact, "이다.")
