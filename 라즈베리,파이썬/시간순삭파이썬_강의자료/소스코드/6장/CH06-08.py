#CH06-08. 무한 반복

##################################################################
##무한 반복을 이용한 신호등 프로그램

sign = True

while sign:
    light = input('신호등 색상을 입력하시오: ')
    if light == 'blue':
        sign = False

print('전진!!')
