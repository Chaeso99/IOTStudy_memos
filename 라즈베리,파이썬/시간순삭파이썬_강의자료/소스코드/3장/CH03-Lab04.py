#CH03-Lab04 두 점 사이의 거리 확인하기

import turtle
t = turtle.Turtle()
t.shape("turtle")

t.goto(0,0)		# 터틀을 (0, 0)으로 이동
t.setheading(45)		# 터틀을 시계 반대방향으로 45°가 되도록 회전
t.forward(141.4)		# 터틀을 앞으로 141.4 만큼 이동

t.up()			# 터틀의 펜을 들어 선이 그려지지 않게 함
t.goto(0,0)		# 터틀을 (0, 0)으로 이동
t.down()			# 터틀이 이동할 때 펜을 내려 선이 그려지게 함
t.setheading(0)		# 터틀의 머리 방향이 0° 방향이 되게 함
t.forward(100)		# 터틀을 100만큼 앞으로 이동
t.setheading(90)		# 터틀의 머리 방향이 시계 반대방향으로 90° 방향이 되게함
t.forward(100)		# 터틀을 100만큼 앞으로 이동
