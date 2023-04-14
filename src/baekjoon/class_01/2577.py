a = int(input())
b = int(input())
c = int(input())

count = [0 for _ in range(10)]
num = a * b * c

lst = list(map(int, str(num)))

for i in range(len(lst)):
    count[lst[i]] += 1

for i in range(len(count)):
    print(count[i])
