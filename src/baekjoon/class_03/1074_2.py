import sys


def divide_and_conquer(n, x, y):
    if n == 1:
        return 2 * x + y

    half = 2 ** (n - 1)

    if x < half and y < half:
        return divide_and_conquer(n - 1, x, y)
    elif x < half and y >= half:
        return half * half + divide_and_conquer(n - 1, x, y - half)
    elif x >= half and y < half:
        return 2 * half * half + divide_and_conquer(n - 1, x - half, y)
    else:
        return 3 * half * half + divide_and_conquer(n - 1, x - half, y - half)


N, r, c = map(int, sys.stdin.readline().split())

print(divide_and_conquer(N, r, c))
