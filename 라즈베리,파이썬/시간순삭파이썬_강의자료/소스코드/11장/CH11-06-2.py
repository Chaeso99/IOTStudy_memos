#CH11-06. [tkinter]버튼 이벤트 처리 #1


##################################################################
##버튼을 클릭하여 섭씨의 엔트리에 ‘100’이 보여지는 이벤트 처리
from tkinter import *

def process( ):
    e2.insert(0, "100")

window  = Tk( )

l1 = Label(window , text="화씨")
l2 = Label(window, text="섭씨")
l1.grid(row=0, column=0)
l2.grid(row=1, column=0)

e1 = Entry(window)
e2 = Entry(window)
e1.grid(row=0, column=1)
e2.grid(row=1, column=1)

b1 = Button(window, text="화씨->섭씨", command=process)
b2 = Button(window, text="섭씨->화씨")
b1.grid(row=2, column=0)
b2.grid(row=2, column=1)

window.mainloop( )
