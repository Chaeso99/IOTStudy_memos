#내가 원하는 원 그리기

import turtle
t = turtle.Turtle()
t.shape("turtle")

radius = int(input("원의 반지름을 입력하시오: "))
color = input("원의 색깔을 입력하시오: ")
t.color(color)
t.begin_fill()
t.circle(radius)
t.end_fill()
