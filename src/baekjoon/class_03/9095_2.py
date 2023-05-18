import sys
from collections import deque


# BFS 방식
def bfs(start, end):
    count = 0
    queue = deque()
    queue.append(start)

    while queue:
        start = queue.popleft()

        for i in range(1, 4):
            nstart = start + i
            if nstart < end:
                queue.append(nstart)
            elif nstart == end:
                count += 1
    return count


T = int(sys.stdin.readline())

for _ in range(T):
    n = int(sys.stdin.readline())

    start, end = 0, n
    count = bfs(start, end)

    print(count)
