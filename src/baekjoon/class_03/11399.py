import sys

N = int(sys.stdin.readline())

P = sorted(map(int, sys.stdin.readline().split()))

sum = [P[0]]
for i in range(1, N):
    sum.append(sum[i-1] + P[i])  # 이전까지의 합 + i번째 P값

result = 0
for s in sum:
    result += s

print(result)