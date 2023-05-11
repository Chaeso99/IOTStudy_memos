#CH08-Lab03 n각형을 그리는 함수 작성하기

import turtle
t = turtle.Turtle()

# n-각형을 그리는 함수를 정의한다. 
def n_polygon(n, length):	
	for i in range(n):
		t.forward(length)
		t.left(360/n)		

for i in range(10):
    t.left(20)
    n_polygon(6, 100)
