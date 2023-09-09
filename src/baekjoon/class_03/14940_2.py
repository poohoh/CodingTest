import sys
from collections import deque

def bfs(queue, field):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while queue:
        x, y = queue.popleft()

        for i in range(len(dx)):
            nx = x + dx[i]
            ny = y + dy[i]

            if (0 <= nx < n) and (0 <= ny < m) and not visit[nx][ny] and field[nx][ny] == 1:
                visit[nx][ny] = True
                queue.append((nx, ny))
                field[nx][ny] = field[x][y] + 1


n, m = map(int, sys.stdin.readline().split())
field = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
visit = [[False] * m for _ in range(n)]

queue = deque()

for i in range(n):
    for j in range(m):
        if field[i][j] == 2:
            visit[i][j] = True
            field[i][j] = 0
            queue.append((i, j))

bfs(queue, field)

for i in range(n):
    for j in range(m):
        if field[i][j] == 1 and not visit[i][j]:
            field[i][j] = -1

for i in range(n):
    result = ''
    for j in range(m):
        result += str(field[i][j]) + ' '
    sys.stdout.write(result + '\n')