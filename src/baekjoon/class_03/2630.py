import sys


def is_same(N, x, y):
    global lst

    num = lst[x][y]
    for r in range(N):
        for c in range(N):
            if lst[x + r][y + c] != num:
                return False  # 다른 것이 있으면 False

    return True  # 모두 같으면 True


def divide_and_conquer(N, x, y):
    global lst, blue, white

    num = lst[x][y]
    if is_same(N, x, y):
        if num:
            blue += 1
        else:
            white += 1
        return
    else:
        half = N // 2
        drow = [x, x + half, x, x + half]
        dcol = [y, y, y + half, y + half]

        for i in range(4):
            divide_and_conquer(half, drow[i], dcol[i])


N = int(sys.stdin.readline())

lst = []
white = 0
blue = 0
for _ in range(N):
    for _ in range(N):
        lst.append(list(map(int, sys.stdin.readline().split())))

divide_and_conquer(N, 0, 0)

print(white)
print(blue)
