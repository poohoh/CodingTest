a = int(input())
b = int(input())
c = int(input())

count = [0] * 10
num = a * b * c

for digit in str(num):
    count[int(digit)] += 1

for i in count:
    print(i)
