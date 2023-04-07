n, b = input().split()
b = int(b)

result = 0
lst = list(n)
for i in range(len(lst)):
    idx = len(lst) - i - 1

    if lst[idx].isdigit():
        num = int(lst[idx])
    elif lst[idx].isalpha():
        num = int(ord(lst[idx]) - ord('A')) + 10

    result += num * (b ** i)

print(result)
