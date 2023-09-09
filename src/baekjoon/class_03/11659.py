import sys

N, M = map(int, sys.stdin.readline().split())

nums = list(map(int, sys.stdin.readline().split()))
for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())

    sum = 0
    for idx in range(i-1, j):
        sum += nums[idx]
    
    print(sum)