#CH07-09. 리스트와 반복문의 궁합


##################################################################
##반복문을 이용하여 효과적으로 리스트를 만들고 출력

heroes=[ ]

for i in range(5) :
    name = input("영웅들의 이름을 입력하시오: ")
    heroes.append(name)

for i in heroes :
    print(i, end=" ")

