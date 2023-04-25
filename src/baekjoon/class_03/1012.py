import sys

sys.setrecursionlimit(10000)

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def traverse(x, y, field, traversed):
    # 이미 방문한 곳이거나 배추가 없는 곳이면 패스
    if traversed[x][y] == 1 or field[x][y] == 0:
        return

    traversed[x][y] = 1  # 방문 표시

    for i in range(4):
        new_x = x + dx[i]
        new_y = y + dy[i]

        # 맵 범위를 벗어나지 않으면 순회
        if new_x < M and new_x >= 0 and new_y < N and new_y >= 0:
            traverse(new_x, new_y, field, traversed)


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
                traverse(i, j, field, traversed)
                count += 1

    print(count)