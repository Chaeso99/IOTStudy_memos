#CH07-Lab05 습도구하기

temp_list = [0, 10, 20, 30]
vapor_list = [4.8, 9.4, 17.3, 30.4]

vapor = float(input("현재 수증기량 입력: "))
temp = int(input("현재 온도 입력: "))

if temp in temp_list :
    humidity = ( vapor / vapor_list[temp_list.index(temp)] ) * 100
    print("현재 습도는" , humidity , "% 입니다.")

print("프로그램을 종료합니다.")
