#CH08-05. 함수에 여러 개의 인수 전달하기

##################################################################
##2개의 정수 start에서 end까지의 합을 계산하는 함수 get_sum( )을 작성

def get_sum(start, end):
    sum = 0
    for i in range(start, end+1):
   	    sum += i
    print("sum=",sum)

get_sum(1, 10)   # 1과 10이 get_sum( )의 인수가 됩니다. 
get_sum(1, 20)   # 1과 20이 get_sum( )의 인수가 됩니다


