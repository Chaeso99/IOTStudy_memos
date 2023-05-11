#CH03-Lab05 그리니치 표준시-세계 시간의 기준점

import time

fseconds = time.time() 
total_sec = int(fseconds)		#전체 초를 구합니다.
total_min = total_sec // 60     #전체 분을 구합니다.
minute = total_min % 60	#현재 분을 계산합니다.
total_hour = total_min // 60    #전체 시를 구합니다.
hour = total_hour % 24 + 9	#현재 시를 계산 한 후 한국 시간을 계산합니다.
print("현재 한국 시간: " + str(hour) + "시"+ str(minute) + "분")
