#CH07-Lab04 오륜기 그리기

import turtle
t = turtle.Turtle( )
positions = [[0, 0, "green"], [-120, 0, "yellow"], [60, 60, "red"], [-60, 60, "black"], [-180, 60, "blue"]]
t.pensize(5)
for x, y, c in positions:
    t.penup( )
    t.goto(x, y)
    t.pendown()
    t.color(c, c)
    t.circle(60)
