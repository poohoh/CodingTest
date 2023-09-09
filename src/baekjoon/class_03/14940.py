import sys

sys.setrecursionlimit(1000000)

def dfs(field, i, j):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    for idx in range(4):
        nx = i + dx[idx]
        ny = j + dy[idx]

        if not (0 <= nx < n and 0 <= ny < m):
            continue

        if field[nx][ny] > field[i][j] + 1:
            field[nx][ny] = field[i][j] + 1
            dfs(field, nx, ny)

n, m = map(int, sys.stdin.readline().split())

field =[]
for _ in range(n):
    field.append(list(map(int, sys.stdin.readline().split())))


MAX_VALUE = 100000
for i in range(n):
    for j in range(m):
        if field[i][j] == 1:
            field[i][j] = MAX_VALUE
        elif field[i][j] == 2:
            field[i][j] = 0
            start_i, start_j = i, j

dfs(field, start_i, start_j)

# 도달할 수 없는 땅
for i in range(n):
    for j in range(m):
        if field[i][j] == MAX_VALUE:
            field[i][j] = -1

# 결과 출력
for i in range(n):
    result = ''
    for j in range(m):
        result += str(field[i][j]) + ' '
    sys.stdout.write(result + '\n')