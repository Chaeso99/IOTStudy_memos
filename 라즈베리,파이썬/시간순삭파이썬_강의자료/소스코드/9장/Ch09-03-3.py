#CH09-03. 딕셔너리 탐색하기

#딕셔너리 출력 정리
phone_book = {'홍길동':'010-1234-5678',
	      '강감찬':'010-1111-2222',
	      '이순신':'010-3333-4444'}

for key in sorted(phone_book.keys( )) :
    print(key, phone_book[key])
