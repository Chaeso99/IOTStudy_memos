#CH11-06. [tkinter]버튼 이벤트 처리 #1

##################################################################
##버튼을 클릭할때마다 파이썬 쉘에 “안녕하세요?” 텍스트가 출력


from tkinter import *

def process( ):
	print("안녕하세요?")

window = Tk( )

button = Button(window, text="클릭하세요!", command=process)
button.pack( )

window.mainloop( )
