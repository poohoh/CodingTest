import sys

def rank(lst, x, y):
    rank = 1
    for i in lst:
        nx, ny = i

        if nx > x and ny > y:
            rank += 1

    return rank


N = int(sys.stdin.readline())

lst = []
for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())

    lst.append((x, y))

for i in lst:
    x, y = i
    print(rank(lst, x, y), end=' ')