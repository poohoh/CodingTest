import sys

n, k = map(int, sys.stdin.readline().split())

divisors = []

for i in range(1, n + 1):
    if n % i == 0:
        divisors.append(i)

if k > len(divisors):
    print("0")
else:
    print(divisors[k - 1])
