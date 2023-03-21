def rotate(basket, start, end, mid):
    temp = []
    # 중간까지 원소들을 따로 담기
    for i in range(start, mid):
        temp.append(basket[i])
    # 중간 이후의 데이터 옮기기
    for i in range(mid, end + 1):
        basket[i - mid + start] = basket[i]
    # 담아놓았던 데이터 옮기기
    for i in range(mid - start):
        basket[end - (mid - start) + 1 + i] = temp[i]


N, M = map(int, input().split())

basket = [i for i in range(N + 1)]

for i in range(M):
    i, j, k = map(int, input().split())
    rotate(basket, i, j, k)

for i in range(1, N + 1):
    print(basket[i], end=" ")
