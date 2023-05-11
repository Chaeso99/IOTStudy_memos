#CH05-Lab02 정수의 종류를 판별하는 스마트 터틀


import turtle
t = turtle.Turtle()
t.shape("turtle")

t.penup()		# 펜을 올려서 그림이 그려지지 않게 합니다. 
t.goto(100, 100)		# 터틀을 (100, 100)으로 이동시킵니다.
t.write("입력된 정수는 양의 정수입니다.")
t.goto(100, 0)
t.write("입력된 정수는 0입니다.")
t.goto(100, -100)
t.write("입력된 정수는 음의 정수입니다.")

t.goto(0, 0)			# (0, 0) 위치로 터틀을 이동시킵니다.
t.pendown()			# 펜을 내려서 그림이 그려지게 합니다. down( )도 있습니다.
s = turtle.textinput("", "숫자를 입력하시오: ")
n = int(s)

if n > 0 :
    t.goto(100, 100)
if n == 0 :
    t.goto(100, 0)
if n < 0 :
    t.goto(100, -100)
