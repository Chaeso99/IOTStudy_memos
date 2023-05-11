#CH11-04 [tkinter]-윈도우와 버튼을 만들어 봅시다.

##################################################################
##tkinter를 사용하여 간단히 빈 윈도우 창 띄우기

##from tkinter import *
##
##window=Tk( )
##
### 이 부분에 화면을 구성할 요소들을 작성합니다.
##
##window.mainloop( )

##################################################################
##윈도우에 버튼을 추가
from tkinter import *

window=Tk( )

button = Button(window, text = "클릭하세요!")
button.pack( )

window.mainloop( )
