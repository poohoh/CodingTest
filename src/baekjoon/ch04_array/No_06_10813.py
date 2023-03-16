n, m = map(int, input().split())

basket = [0 for _ in range(n + 1)]

for i in range(1, n + 1):
    basket[i] = i

for i in range(m):
    a, b = map(int, input().split())
    basket[a], basket[b] = basket[b], basket[a]

for i in range(1, n+1):
    print(basket[i], end=" ")
