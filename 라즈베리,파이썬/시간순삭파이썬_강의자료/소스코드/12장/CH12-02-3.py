#CH12-06. 대푯값을 구해봅시다.

##################################################################
##6, 7, 7, 8, 8, 10, 9, 3, 5, 2, 7, 2, 6의 최빈값을 구하는 프로그램

data = [6, 7, 7, 8, 8, 10, 9, 3, 5, 2, 7, 2, 6]
frequency = { }

for i in data:
    frequency[i] = data.count(i)

max_frequency = 0

for i in frequency:
    print(i,'의 횟수: ', frequency[i])
    if(frequency[i] > max_frequency) :
        max_frequency = frequency[i]
        max_frequency_num = i

print('최빈수=', max_frequency_num)
