#CH08-07. 함수를 좀 더 이해시켜 줄 예제

##################################################################
##반복문사용

import turtle
t = turtle.Turtle()
t.shape("turtle")

for i in range(4 ):
    t.forward(100)
    t.left(90)
t.up()		# 펜을 든다. 
t.goto(-200, 0)	# (-200, 0)으로 이동한다. 
t.down()		# 펜을 내린다. 

for i in range(4 ):
    t.forward(100)
    t.left(90)
