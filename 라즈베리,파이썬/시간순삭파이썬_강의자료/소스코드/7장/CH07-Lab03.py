#CH07-Lab03 스파이럴(spiral) 그리기

import turtle

t = turtle.Turtle()

# 거북이의 속도는 0으로 설정하면 최대가 됩니다.
t.speed(0)

#거북이가 그리는 선의 두께는 width()를 호출합니다.
t.width(3)

length = 10	# 초기 선의 길이는 10으로 합니다.

# 색상은 리스트에 저장했다가 하나씩 꺼내서 변경하도록 합니다.
colors = ["red", "purple", "blue", "green", "yellow", "orange" ]

# while 반복문이다. 선의 길이가 500보다 작으면 반복.  
while length < 500:	
    t.forward(length)			# length만큼 전진합니다. 
    t.pencolor(colors[length%6])	# 선의 색상을 변경합니다.
    t.right (89)			# 89도 오른쪽으로 회전합니다.
    length += 5			# 선의 길이를 5만큼 증가합니다.
