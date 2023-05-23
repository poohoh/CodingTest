import sys

N = int(sys.stdin.readline())

P = sorted(map(int, sys.stdin.readline().split()))

result = 0
prev_sum = 0
for i in range(N):
    curr_value = prev_sum + P[i]
    result += curr_value
    prev_sum = curr_value

print(result)