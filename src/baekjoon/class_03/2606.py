import sys
from collections import deque


def traverse(start):
    global count

    queue = deque()
    queue.append(start)
    visited[start] = True

    while queue:
        now = queue.popleft()
        count += 1

        for edge in edges[now]:
            if not visited[edge]:
                queue.append(edge)
                visited[edge] = True


N = int(sys.stdin.readline())

edge_num = int(sys.stdin.readline())

edges = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)

for _ in range(edge_num):
    edge1, edge2 = map(int, sys.stdin.readline().split())

    edges[edge1].append(edge2)
    edges[edge2].append(edge1)

count = -1
traverse(1)

print(count)