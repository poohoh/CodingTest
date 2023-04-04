n, m = map(int, input().split())

board = []
counts = []
for i in range(n):
    board.append(list(input()))

for a in range(n - 7):
    for b in range(m - 7):
        count1 = 0
        count2 = 0
        for i in range(a, a + 8):
            for j in range(b, b + 8):
                if (i + j) % 2 == 0:  # 행과 열이 모두 짝수 또는 홀수 (start와 같은 칸)
                    if board[i][j] != 'W':
                        count1 += 1
                    elif board[i][j] != 'B':
                        count2 += 1
                else:  # 행과 열이 하나가 짝수이면 나머지는 홀수 (start 옆 칸)
                    if board[i][j] != 'B':
                        count1 += 1
                    elif board[i][j] != 'W':
                        count2 += 1
        counts.append(min(count1, count2))

print(min(counts))
