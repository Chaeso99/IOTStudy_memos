#CH09-04. 딕셔너리 수정과 삭제

##################################################################
##del, pop( )은 딕셔너리의 지정 항목을 삭제

phone_book = {'홍길동':'010-1234-5678',
	      '강감찬':'010-1111-2222',
	      '이순신':'010-3333-4444'}
del phone_book["홍길동"] 
print(phone_book)

print(phone_book.pop('이순신'))
print(phone_book)
