import sys
from collections import deque


def bfs():
    queue = deque()
    queue.append(N)
    while queue:
        x = queue.popleft()
        if x == K:
            print(count[x])
            break

        dx = [x - 1, x + 1, 2 * x]

        for nx in dx:
            if 0 <= nx <= 100000 and not count[nx]:
                count[nx] = count[x] + 1
                queue.append(nx)


N, K = map(int, sys.stdin.readline().split())

count = [0] * (100001)

bfs()