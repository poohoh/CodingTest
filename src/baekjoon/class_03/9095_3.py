import sys

T = int(sys.stdin.readline())

# 다이나믹 프로그래밍 방식
for _ in range(T):
    n = int(sys.stdin.readline())

    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(1, n + 1):
        for j in range(1, 4):
            if i - j >= 0:
                dp[i] += dp[i - j]
    print(dp[n])
