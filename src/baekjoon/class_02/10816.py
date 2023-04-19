N = int(input())
nums = {}
input_nums = list(map(int, input().split()))
for num in input_nums:
    count = nums.get(num)
    if count:
        nums.pop(num)
        nums[num] = count + 1
    else:
        nums[num] = 1

M = int(input())
targets = list(map(int, input().split()))

for target in targets:
    value = nums.get(target)
    if value:
        print(value, end=' ')
    else:
        print(0, end=' ')