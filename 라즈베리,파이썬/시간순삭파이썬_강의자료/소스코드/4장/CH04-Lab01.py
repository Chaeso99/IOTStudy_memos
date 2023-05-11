#CH04-Lab01 소금물의 농도는?

print("소금물의 농도를 구하는 프로그램입니다")
salt = int(input("소금의 양은 몇 g입니까? "))
water = int(input("물의 양은 몇 g입니까? "))
density = salt / (salt+water) * 100
print("소금물의 농도: " + str(density) + "%")
