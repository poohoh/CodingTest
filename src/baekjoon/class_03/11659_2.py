import sys

N, M = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

prefix_sum = [0] * (N + 1)

for idx in range(1, N+1):
    prefix_sum[idx] = prefix_sum[idx-1] + nums[idx-1]

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())

    result = prefix_sum[j] - prefix_sum[i-1]
    print(result)