# n과 m 입력
n, m = map(int, input().split())

# 바구니 초기화
basket = [i for i in range(n + 1)]

# m번 바구니의 순서 역순으로
for _ in range(m):
    # a부터 b까지 역순으로
    a, b = map(int, input().split())

    # 구간 내 역순
    mid = (b - a) // 2
    for i in range(mid + 1):
        basket[a + i], basket[b - i] = basket[b - i], basket[a + i]

# 출력
for i in range(1, n + 1):
    print(basket[i], end=" ")
