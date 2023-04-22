import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N = int(sys.stdin.readline())

    count = [(1, 0), (0, 1)] + [(0, 0)] * (N - 1)

    for i in range(2, N + 1):
        count[i] = (count[i - 1][0] + count[i - 2][0], count[i - 1][1] + count[i - 2][1])

    print(count[N][0], count[N][1])
