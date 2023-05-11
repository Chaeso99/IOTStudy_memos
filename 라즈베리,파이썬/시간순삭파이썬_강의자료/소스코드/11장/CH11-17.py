#CH11-17. [Matplotlib]그래프 그리기 기초

##################################################################
##(1, 1), (2, 2), (3, 3)을 선으로 잇는 간단한 그래프


from matplotlib import pyplot as plt

x = [1, 2, 3] 
y = [1, 2, 3] 

plt.plot(x, y, marker='o') 
plt.title("My Plot") 
plt.xlabel("X") 
plt.ylabel("Y") 
plt.legend(['test'])
plt.show( )
