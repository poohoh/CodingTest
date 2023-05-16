import sys
from collections import deque


# bfs 방식으로 각 칸의 최소 날짜 계산
def bfs():
    global field, M, N
    queue = deque()

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    for x in range(N):
        for y in range(M):
            if field[x][y] == 1:
                queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            # 범위 내에서 방문하지 않았으면 날짜를 1 증가시키면서 queue에 삽입
            if 0 <= nx < N and 0 <= ny < M and field[nx][ny] == 0:
                field[nx][ny] = field[x][y] + 1
                queue.append((nx, ny))


# 최소 날짜 구하기
def calculate_min():
    global field, M, N

    bfs()

    max_day = 0

    for x in range(N):
        for y in range(M):
            if field[x][y] == 0:
                return -1

            if max_day < field[x][y]:
                max_day = field[x][y]

    return max_day - 1  # 필드 배열의 초기값이 1이기 때문


M, N = map(int, sys.stdin.readline().split())
field = []

# 맵 생성
for _ in range(N):
    field.append(list(map(int, sys.stdin.readline().split())))

print(calculate_min())