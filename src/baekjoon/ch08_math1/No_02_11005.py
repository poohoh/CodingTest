# 큰 수부터 시작해서 큰 수보다 작으면 패스, 크면 해당 수만큼 빼고 한 자리 낮추는 것을 반복

exponent = 0

N, B = map(int, input().split())

while B ** exponent < 1000000000:
    exponent += 1

result = ""

for exp in range(exponent, -1, -1):
    # 남은 수가 자릿수보다 클 때
    if B ** exp <= N:
        # 해당 자릿수의 수 찾기
        num = N // (B ** exp)
        N = N % (B ** exp)
        if num > 9:
            result += chr(num - 10 + ord('A'))
        else:
            result += str(num)
    # 남은 수가 자릿수보다 작을 때 (나눌 수 없을 때)
    else:
        result += '0'

print(result.lstrip('0'))