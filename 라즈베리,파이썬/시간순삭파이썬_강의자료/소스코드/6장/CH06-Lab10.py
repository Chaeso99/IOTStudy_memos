#CH06-Lab10 숫자 맞추기 게임

import random

tries = 1		# 게임 시도 횟수를 저장합니다.
guess = 0		# 사용자가 입력한 수를 저장합니다.
answer = random.randint(1, 100)	# 1~100 사이의 임의의 수를 저장합니다.


print("1부터 100 사이의 숫자를 맞추시오")
guess = int(input("숫자를 입력하시오: "))

while guess != answer:
   tries = tries + 1
   if guess < answer:
       print("낮음!")
   elif guess > answer:
       print("높음!")
       
   guess = int(input("숫자를 입력하시오: "))

if guess == answer:
    print("축하합니다. 시도횟수=", tries)