king_table = []

for i in range(4):
    king = input("조선시대 왕 순서 구절을 입력하시오: ")
    king_table.append(king)

print(king_table)

count = 1

for i in king_table :
    for j in i :
        if j == '연' :
            print('연산군')
        elif j == '광':
            print('광해군')
        elif count in [1, 7, 14, 16, 21, 22, 23] :
            print(j+'조')
        else :
            print(j+'종')
        count = count + 1
