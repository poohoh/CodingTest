import sys

N, K = map(int, sys.stdin.readline().split())

lst = [i for i in range(1, N + 1)]

result = []
idx = 0
for _ in range(N):
    # pop을 하면서 하나의 숫자가 줄어들게 되므로 K - 1을 더해야 함.
    idx = (idx + K - 1) % (len(lst))
    result.append(lst[idx])
    lst.pop(idx)
print('<', end='')
for i in range(N - 1):
    print(result[i], end=', ')
print(result[-1], end='')
print('>')
