#CH08-Lab08 재귀호

def fact(n):
  if n == 1:
    return 1
  else:
    return n * fact(n-1)

n = int(input("정수를 입력하시오: "))
f = fact(n)
print(n, "!은", f, "이다.")
