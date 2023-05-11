#CH12-17 틱텍토 게임 #3

from turtle import *

bgcolor("black")
pencolor("white")
setup(600,600)
hideturtle( )
speed(10)
up( )
pensize(10)

#가로선 그리기
goto(-300,100)
down( )
forward(600)
up( )
goto(-300, -100)
down( )
forward(600)
up( )

#세로선
goto(-100,300)
setheading(-90)
down( )
forward(600)
up( )
goto(100,300)
down( )
forward(600)
up( )

pencolor("green")

# X표시를 그린다.
def cross(x, y):
    up( )
    goto(x+20, y-20)
    setheading(-45)
    down( )
    forward(226)
    up( )
    goto(x+180,y-20)
    setheading(-135)
    down( )
    forward(226)
    up( )

# 원표시를 그린다.
def nought(x, y):
    up( )
    goto(x+100, y-180)
    setheading(0)
    down( )
    circle(80)
    up( )

pieces = ["", "", "","", "", "", "", "", ""]
nextTurn = "X"

def drawPieces(pieces) :
    x = -300
    y = 300


    for piece in pieces:
        
        if piece == "X":
            cross(x, y)
        elif piece == "O":
            nought(x, y)

        x = x + 200
        if x > 100:
            x = -300
            y = y - 200

def clicked(x, y):
    global nextTurn, pieces
    column = (x + 300) // 200
    row = -(y - 300) // 200
    square = column + row * 3
    square = int(square)
    
    pieces[square] = nextTurn
    
    if nextTurn == "X":
        nextTurn = "O"
    else:
        nextTurn = "X"

    drawPieces(pieces)
            
onscreenclick(clicked)
mainloop( )
