import sys
print = sys.stdout.write

N, M = map(int, input().split())

def recursive_print(count, start, end, nums: list):
    # last num
    if count <= 0:
        for num in nums:
            print(str(num) + ' ')
        print('\n')
        
        # pop last num
        return
    
    for i in range(start, end+1):
        # append current num
        nums.append(i)
        
        recursive_print(count-1, i+1, end+1, nums)

        # pop current num
        nums.pop()

recursive_print(M, 1, N-M+1, [])