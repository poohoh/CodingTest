import sys


# DFS 방식
def dfs(n):
    global count

    for i in range(1, 4):
        num = n
        if num >= i:
            num -= i

            if num == 0:
                count += 1
            else:
                dfs(num)


T = int(sys.stdin.readline())

for _ in range(T):
    count = 0
    n = int(sys.stdin.readline())

    dfs(n)

    print(count)
