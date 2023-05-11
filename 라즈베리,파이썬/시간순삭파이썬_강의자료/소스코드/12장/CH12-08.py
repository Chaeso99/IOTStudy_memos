from currency_converter import CurrencyConverter

cc = CurrencyConverter('http://www.ecb.europa.eu/stats/eurofxref/eurofxref.zip')

print("환율 계산기가 서비스 되는 통화는 다음과 같습니다.")
print(cc.currencies)

a = input("가지고 계시는 통화를 입력하세요 예)KRW, CNY : ")

a_money = input("금액을 자연수로 입력하세요: ")
a_money = int(a_money)

b = input("환전을 원하는 통화를 입력하세요 예)KRW, CNY : ")

a = str.upper(a)
b = str.upper(b)

print(a,a_money,'-->', b, round(cc.convert(a_money, a, b), 2), "입니다.")
