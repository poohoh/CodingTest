nums = list(map(int, input().split()))

result = 0
for i in range(len(nums)):
    result += nums[i] ** 2
result %= 10

print(result)