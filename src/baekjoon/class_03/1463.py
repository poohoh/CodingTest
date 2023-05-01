import sys

N = int(sys.stdin.readline())

count = [1000000] * (N + 1)
count[N] = 0

for i in range(N, 0, -1):
    next_cnt = count[i] + 1

    # 3으로 나누어 떨어지는 수
    if i % 3 == 0:
        if next_cnt < count[i // 3]:
            count[i // 3] = next_cnt

    # 2로 나누어 떨어지는 수
    if i % 2 == 0:
        if next_cnt < count[i // 2]:
            count[i // 2] = next_cnt

    if next_cnt < count[i - 1]:
        count[i - 1] = next_cnt

print(count[1])