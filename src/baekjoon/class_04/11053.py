import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int, input().split()))
count = [1] * N

for num_idx, num in enumerate(lst):
    max_num = num
    for idx in range(num_idx + 1, N):
        if lst[idx] > max_num:
            max_num = lst[idx]
            count[num_idx] += 1

print(max(count))