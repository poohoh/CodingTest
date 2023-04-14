nums = list(map(int, input().split()))

ascending = True
descending = True

for i in range(1, len(nums)):
    if nums[i] < nums[i-1]:
        ascending = False
    elif nums[i] > nums[i-1]:
        descending = False

if ascending:
    print('ascending')
elif descending:
    print('descending')
else:
    print('mixed')