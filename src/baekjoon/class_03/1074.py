import sys

num = 0


def dfs(array, x, y, exp):
    global num

    if exp < 0:
        return

    diff = 2 ** exp

    dx = [0, 0, diff, diff]
    dy = [0, diff, 0, diff]

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        # 1씩만 이동하는 경우
        if diff == 1:
            array[nx][ny] = num
            num += 1
        else:
            dfs(array, nx, ny, exp // 2)


N, r, c = map(int, sys.stdin.readline().split())

array = [[0] * (2 ** N) for _ in range(2 ** N)]

dfs(array, 0, 0, N - 1)

print(array[r][c])
