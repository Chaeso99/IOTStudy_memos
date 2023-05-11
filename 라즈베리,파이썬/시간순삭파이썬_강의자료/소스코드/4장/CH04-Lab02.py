#CH04-Lab02 간단한 챗봇(ChatBot) 프로그램

print("안녕하세요")
name = input('이름이 뭐예요? ')
print("만나서 반갑습니다. " + name + "님")
print(name + "님 이름의 길이는 다음과 같군요:", end=' ')
print(len(name))
age = int(input("나이가 어떻게 되요? "))         
print("내년이면 "+ str(age+1)+ "세가 되시는 군요")
