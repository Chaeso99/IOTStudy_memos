import turtle
t = turtle.Turtle( )

color_list = ["yellow", "blue", "red", "orange", "green"]
t.pendown( )
t.width(5)
for i in color_list:
    t.color(i)
    for j in range(5):
        t.right(72)
        t.forward(100)

    t.left(72)  
