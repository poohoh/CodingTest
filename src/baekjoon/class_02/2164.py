N = int(input())

lst = [(i+1) for i in range(N)]

length = len(lst)
while length > 1:
    if length % 2 == 1: # 원소 개수가 홀수개
        for i in range(length-1, -1, -2):
            lst.pop(i)
            lst.append(lst[0])
        lst.pop(0)
    else:   # 원소 개수가 짝수개
        for i in range(length-2, -1, -2):
            lst.pop(i)
    length = len(lst)

print(lst[0])