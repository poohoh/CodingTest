import sys
input = sys.stdin.readline

N, M = map(int, input().split())
trees = list(map(int, input().split()))

max_len = max(trees)
height = 0
for h in range(max_len-1, -1, -1):
    cut = [max(t-h, 0) for t in trees]
    sum_len = sum(cut)
    
    if sum_len >= M:
        print(h)
        break