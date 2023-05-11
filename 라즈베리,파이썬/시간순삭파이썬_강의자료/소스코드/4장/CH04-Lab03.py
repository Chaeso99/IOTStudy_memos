#CH04-Lab03 거북이와 인사 해봐요.

import turtle
t = turtle.Turtle()
t.shape("turtle")

s = turtle.textinput("", "이름을 입력하시오: ")
t.write("안녕하세요?" + s +"씨, 터틀 인사드립니다.");

#사각형 그리기    
t.left(90)
t.forward(100)
t.left(90)
t.forward(100)
t.left(90)
t.forward(100)
t.left(90)
t.forward(100)
