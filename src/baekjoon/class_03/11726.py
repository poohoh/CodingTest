import sys

N = int(sys.stdin.readline().strip())

count = [0] * 1001

count[1] = 1
count[2] = 2

# count[n] = count[n-1] + count[n-2]
for i in range(3, N+1):
    count[i] = count[i-1] + count[i-2]

print(count[N] % 10007)