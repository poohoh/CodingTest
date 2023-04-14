while True:
    a, b, c = map(int, input().split())
    lst = [a, b, c]
    lst.sort()

    if a == 0 and b == 0 and c == 0:
        break

    if lst[-1] >= (lst[0] + lst[1]):  # 삼각형이 만들어지지 않는 경우
        print("Invalid")
    elif a == b and b == c and c == a:  # 세 변의 길이가 모두 같은 경우
        print("Equilateral")
    elif a == b or b == c or c == a:  # 두 변의 길이만 같은 경우
        print("Isosceles")
    else:  # 세 변의 길이가 모두 다른 경우
        print("Scalene")