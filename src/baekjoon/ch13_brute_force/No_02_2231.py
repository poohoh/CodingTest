n = int(input())

for m in range(1, n + 1):
    nums = list(map(int, str(m)))
    sum_value = sum(nums) + m

    if sum_value == n:
        print(m)
        break
    if m == n:
        print(0)
