#CH12-10. 토끼와 거북이의 경주 - 전체코드.

import turtle
import random

screen = turtle.Screen( )
image1 = "D:\\rabbit.gif"
image2 = "D:\\turtle.gif"
screen.addshape(image1)
screen.addshape(image2)

t1 = turtle.Turtle( )	# 토끼
t2 = turtle.Turtle( ) 	# 거북이

t1.shape(image1)	# t1거북이의 모양은 거북이 형태로 지정
t1.pensize(5)		# t1거북이의 펜의 굵기를 5로 지정


t2.shape(image2)
t2.pensize(5)

t1.penup( )
t1.goto(-300, 0)

t2.penup( )
t2.goto(-300, -100)

t1.pendown( )	#달리기 경주 준비
t2.pendown( )

for i in range(10): 			# 본격적인 경주가 이루어지는 부분입니다.
	d1 = random.randint(1, 60)
	t1.forward(d1) 		
	d2 = random.randint(1, 60)
	t2.forward(d2)	
