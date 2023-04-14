n, m = map(int, input().split())

nums = list(map(int, input().split()))

result = 0
for i in range(n - 2):
    for j in range(i + 1, n - 1):
        for k in range(j + 1, n):
            sum_value = nums[i] + nums[j] + nums[k]
            if sum_value <= m:
                result = max(sum_value, result)

print(result)
