#CH05-Lab08 사용자가 원하는 도형 그리기

import turtle
t = turtle.Turtle()
t.shape("turtle")

s = turtle.textinput("", "도형을 입력하시오: ")
if s == "직사각형" :
    s = turtle.textinput("","가로: ")
    w=int(s)
    s = turtle.textinput("","세로: ")
    h=int(s)
    t.forward(w)
    t.left(90)
    t.forward(h)
    t.left(90)
    t.forward(w)
    t.left(90)
    t.forward(h)

elif s == "정삼각형" :
    s = turtle.textinput("","한 변의 길이: ")
    w=int(s)
    t.forward(w)
    t.left(120)
    t.forward(w)
    t.left(120)
    t.forward(w)
    t.left(120)

elif s == "원" :
    s = turtle.textinput("","반지름의 길이: ")
    w=int(s)
    t.circle(w)
