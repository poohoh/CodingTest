import sys
input = sys.stdin.readline

N, M = map(int, input().split())
trees = list(map(int, input().split()))

start = 0
end = max(trees)
height = end // 2

while True:
    # sum of cut over height is larger than M
    if sum([max(t-height, 0) for t in trees]) >= M:
        # sum of cut over (height+1) is smaller than M
        if sum([max(t-(height+1), 0) for t in trees]) < M:
            break
        else:
            start = height
            height = round((end+height) / 2)
    else:
        end = height
        height = round((start+height) / 2)

print(height)