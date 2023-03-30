while True:
    lst = map(int, input().split())
    a, b, c = sorted(lst)

    if a == 0 and b == 0 and c == 0:
        break

    if c >= (a + b):  # 삼각형이 만들어지지 않는 경우
        print("Invalid")
    elif a == b and b == c and c == a:  # 세 변의 길이가 모두 같은 경우
        print("Equilateral")
    elif a == b or b == c or c == a:  # 두 변의 길이만 같은 경우
        print("Isosceles")
    else:  # 세 변의 길이가 모두 다른 경우
        print("Scalene")