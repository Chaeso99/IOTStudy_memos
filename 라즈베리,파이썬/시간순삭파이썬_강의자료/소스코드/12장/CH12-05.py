#CH12-13. 터틀 아스테로이드 게임

import turtle
import random 

player = turtle.Turtle( )
player.color("blue")
player.shape("turtle")
player.penup( )
player.speed(0)
screen = player.getscreen( )

asteroids = [ ]				# 공백 리스트를 생성합니다. 
for i in range(10):			# 10개의 터틀을 생성합니다. 
    a1 = turtle.Turtle( )
    a1.color("red")
    a1.shape("circle")
    a1.penup( )
    a1.speed(0)
    a1.goto(random.randint(-300, 300), random.randint(-300, 300))
    asteroids.append(a1)		# 생성된 터틀을 리스트에 추가합니다.

def turnleft( ):
    player.left(30)	# 왼쪽으로 30도 회전합니다.
	
def turnright( ):
    player.right(30)	# 오른쪽으로 30도 회전합니다.

def turnup( ):
    player.forward(20)
	
screen.onkeypress(turnleft, "Left")
screen.onkeypress(turnright, "Right")
screen.onkeypress(turnup)
screen.listen( )

def play( ):
    player.forward(2)			# 2픽셀 전진
        
    for a in asteroids:			
        a.right(random.randint(-180, 180))
        a.forward(2)

        if player.distance(a) < 20 :
            player.write("clear")
            a.ht( )
                
    screen.ontimer(play, 10)		# 10ms가 지나면 play( )를 다시 호출
    
screen.ontimer(play, 10)
