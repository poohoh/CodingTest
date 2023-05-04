import sys

N, K = map(int, sys.stdin.readline().split())

# 카운트 횟수
# N 이하의 수들로 가는 가장 빠른 방법은 1씩 감소하는 것
# N번째는 0회
count = [(N - i) for i in range(N)] + [0] + [100001] * (100000 - N)

for i in range(2):
    for idx in range(1, 100000):
        ncnt = count[idx] + 1

        if idx * 2 < 100001 and ncnt < count[idx * 2]:
            count[idx * 2] = ncnt

        if ncnt < count[idx - 1]:
            count[idx - 1] = ncnt

        if ncnt < count[idx + 1]:
            count[idx + 1] = ncnt

if count[1] > count[0] + 1:
    count[1] = count[0] + 1

if count[99999] > count[100000] + 1:
    count[99999] = count[100000] + 1

print(count[K])