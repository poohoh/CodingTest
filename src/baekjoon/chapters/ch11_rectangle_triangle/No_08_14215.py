lst = map(int, input().split())
a, b, c = sorted(lst)

while a + b <= c:
    c -= 1
    if c <= 0:
        break

print(a + b + c)
