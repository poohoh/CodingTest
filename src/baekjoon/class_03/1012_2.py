import sys
from collections import deque

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def bfs(x, y, field, traversed):

    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        # 이미 방문한 곳이면 패스
        if traversed[x][y] == 1:
            continue

        traversed[x][y] = 1  # 방문 표시

        for i in range(4):
            new_x = x + dx[i]
            new_y = y + dy[i]

            # 맵 범위를 벗어나지 않으면 순회
            if new_x >= M or new_x < 0 or new_y >= N or new_y < 0:
                continue

            # 다음 좌표가 방문하지 않았고 배추가 있는 곳이면 큐에 삽입
            if traversed[new_x][new_y] == 0 and field[new_x][new_y] == 1:
                queue.append((new_x, new_y))

    return


T = int(sys.stdin.readline())

for _ in range(T):
    M, N, K = map(int, sys.stdin.readline().split())

    field = [[0] * N for _ in range(M)]
    traversed = [[0] * N for _ in range(M)]  # 방문했는지

    for _ in range(K):
        x, y = map(int, sys.stdin.readline().split())
        field[x][y] = 1  # 배추

    count = 0
    for i in range(M):
        for j in range(N):
            if field[i][j] == 1 and traversed[i][j] == 0:
                bfs(i, j, field, traversed)
                count += 1

    print(count)
