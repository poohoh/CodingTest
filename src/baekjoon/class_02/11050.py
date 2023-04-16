#분모 계산
# nPr
def p(a, b):
    result = 1
    for i in range(a, a - b, -1):
        result *= i

    return result


# 분자 계산
def factorial(n):
    result = 1
    for i in range(n, 0, -1):
        result *= i

    return result


a, b = map(int, input().split())

result = p(a, b) // factorial(b)

print(result)
