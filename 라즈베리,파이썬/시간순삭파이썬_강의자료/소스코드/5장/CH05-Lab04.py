#CH05-Lab04 동전 던지기 게임


import turtle			# 터틀 그래픽 모듈을 불러옴
import random 			# 난수 모듈을 불러옴

screen = turtle.Screen()
image1 = "d:\\front.gif"
image2 = "d:\\back.gif"

screen.addshape(image1)
screen.addshape(image2)

t1 = turtle.Turtle()		# 터틀 생성
coin = random.randint(0, 1)	# 동전의 앞, 뒤 정보 만들기

if coin == 0 :
    t1.shape(image1)
    t1.stamp()
else : 
    t1.shape(image2)
    t1.stamp()	
