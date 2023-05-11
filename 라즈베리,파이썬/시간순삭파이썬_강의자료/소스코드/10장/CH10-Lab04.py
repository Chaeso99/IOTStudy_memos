#CH10-Lab04 행맨

import random

# 입력 파일 열기
infile = open("D:\\hangman.txt", "r")
lines = infile.readlines( )
word = random.choice(lines).rstrip( )
solution = list(word)   
result = list('_' * len(word))     # list()는 문자열을 받아서 리스트로 변환합니다. 
turns = 10

while turns > 0:
    guess = input("단어를 추측하세요: ")
    turns -= 1
    i = 0

    for c in word:
         if c == guess:
              result[i] = c
         i += 1

    print(result)

    if result == solution:
        print("성공입니다.")           
        break

    if turns <= 0 :
        print("실패하였습니다.")           
        break
infile.close( )
