n, b = input().split()
b = int(b)

result = 0
for i, char in enumerate(reversed(n)):

    if char.isdigit():
        num = int(char)
    elif char.isalpha():
        num = int(ord(char) - ord('A')) + 10

    result += num * (b ** i)

print(result)
