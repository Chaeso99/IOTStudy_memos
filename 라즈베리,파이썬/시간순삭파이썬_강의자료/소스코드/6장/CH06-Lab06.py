#CH06-Lab06 몬드리안 터틀

import turtle, random

t = turtle.Turtle( )
t.pensize(3)

for i in range(20) :		# 20개의 도형을 만듭니다.
    r = random.random( )      # 0.0에서 1.0 사이의 난수 값 생성
    g = random.random( )
    b = random.random( )

    x = random.randint(-300,300)      # -300에서 300 사이의 난수 값 생성
    y = random.randint(-300,300)
    length = random.randint(10,300)

    t.penup()
    t.goto(x,y)
    t.pendown()
    t.color(r, g, b)
    t.begin_fill( )
    for j in range(4) :      # 사각형을 그린다. 
        t.forward(length)
        t.right(90)
    t.end_fill( )
