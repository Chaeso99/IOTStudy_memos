#CH06-Lab08 최대 공약수 구하기

n = int(input("정수1 입력: "))
m = int(input("정수2 입력: "))

if n < m :
        n, m = m, n

while m > 0 :
        r = n % m
        n, m = m, r
        
if n != 1 :
        print("두 수의 최대공약수:", n)
else:
        print("두 수는 서로소이다")
