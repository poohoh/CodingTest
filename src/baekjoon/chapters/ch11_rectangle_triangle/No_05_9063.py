xs = []
ys = []

n = int(input())
for _ in range(n):
    x, y = map(int, input().split())
    xs.append(x)
    ys.append(y)

width = max(xs) - min(xs)
height = max(ys) - min(ys)
area = width * height

print(area)
