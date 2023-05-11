#CH12-05. 이차함수의 그래프

##################################################################
##이차함수 그래프를 그리는 프로그램

from matplotlib import pyplot as plt
import numpy as np

x = np.arange(-2, 8)
y = - x**2 + 5*x +1

plt.plot(x, y, marker='o', linestyle='--', color='r')

plt.grid( )
plt.show( )
