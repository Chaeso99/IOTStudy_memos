#CH03-Lab06 계산대 프로그램

money = int(input("투입한 돈: "))
price = int(input("물건가격: "))

change = money - price
print("거스름돈: ", change)
coin500s = change // 500	# 거스름돈을 500으로 나누었을 때의 몫 : 500원 동전의 개수
change = change % 500	# 거스름돈을 500으로 나누었을 때의 나머지  
				# 거스름돈을 500으로 거슬러주고 남은 돈을 다시 change에 저장. 
coin100s = change // 100	# 거스름돈을 100으로 나누었을 때의 몫 : 100원 동전의 개수

print("500원 동전의 개수:", coin500s)
print("100원 동전의 개수:", coin100s)
