#CH06-Lab07 모든 약수 구하기

n = int(input("자연수 입력: "))

for m in range(1, n+1):
    if n % m == 0 :
        print(m, end=" ")
