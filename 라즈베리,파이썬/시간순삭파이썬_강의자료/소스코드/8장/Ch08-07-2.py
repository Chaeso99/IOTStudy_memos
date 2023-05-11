#CH08-07. 함수를 좀 더 이해시켜 줄 예제

##################################################################
##함수사용

import turtle 
t = turtle.Turtle()
t.shape("turtle")

def square(length) :  # length는 한 변의 길이
	for i in range(4 ):
		t.forward(length)
		t.left(90)

square(100)	# square() 함수를 호출한다. 
t.up( )		# 펜을 든다. 
t.goto(-200, 0)	# (-200, 0)으로 이동한다. 
t.down()		# 펜을 내린다. 
square(100)	# square() 함수를 호출한다. 
