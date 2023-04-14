import sys


def is_ascending(nums):
    for i in range(1, 8):
        if nums[i] < nums[i - 1]:
            return False
    return True


def is_descending(nums):
    for i in range(1, 8):
        if nums[i] > nums[i - 1]:
            return False
    return True


nums = list(map(int, input().split()))

if is_ascending(nums):
    print('ascending')
elif is_descending(nums):
    print('descending')
else:
    print('mixed')
