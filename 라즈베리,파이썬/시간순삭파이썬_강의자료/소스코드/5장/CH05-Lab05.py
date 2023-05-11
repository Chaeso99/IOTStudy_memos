#CH05-Lab05 찌릿찌릿 전기 회로


a = input("1번 전지가 있습니까? (Y/N) ")
b = input("2번 전지가 있습니까? (Y/N) ")

if a.upper() == 'Y' and b.upper() == 'Y':
    print("직렬연결 : 전구에 불이 켜집니다.")
else :
    print("직렬연결 : 전구에 불이 꺼집니다.")

if a.upper() == 'Y' or b.upper() == 'Y':
    print("병렬연결 : 전구에 불이 켜집니다.")
else :
    print("병렬연결 : 전구에 불이 꺼집니다.")    
