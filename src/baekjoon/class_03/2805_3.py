import sys
input = sys.stdin.readline

N, M = map(int, input().split())
trees = list(map(int, input().split()))

start = 0
end = max(trees)
height = 0

while start <= end:
    height = (start + end) // 2
    sum_len = 0
    
    for t in trees:
        if t > height:
            sum_len += t - height

    if sum_len >= M:
        start = height + 1
    else:
        end = height - 1

print(end)