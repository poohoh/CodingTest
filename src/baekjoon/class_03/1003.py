import sys


def fibo(N, count):
    if N == 0:
        count[0] += 1
    elif N == 1:
        count[1] += 1
    else:
        fibo(N - 1, count)
        fibo(N - 2, count)


T = int(sys.stdin.readline())

for _ in range(T):
    count = [0, 0]
    N = int(sys.stdin.readline())

    fibo(N, count)

    print(count[0], count[1])
