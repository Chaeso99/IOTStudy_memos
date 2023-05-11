#CH09-05 딕셔너리를 좀 더 이해시켜 줄 예제

##################################################################
##딕셔너리를 이용하여 영한사전 프로그램을 작성.

english_dict = { }
english_dict['one'] = '하나'
english_dict['two'] = '둘'
english_dict['three'] = '셋'

word = input("단어를 입력하시오: ");
print (english_dict[word])
