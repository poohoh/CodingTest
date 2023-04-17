N = int(input())

lst = [(i + 1) for i in range(N)]

while len(lst) > 1:
    new_lst = []
    for i in range(1, len(lst), 2):
        new_lst.append(lst[i])

    if len(lst) % 2 != 0:  # 리스트가 홀수인 경우
        new_lst.append(new_lst[0])
        new_lst.pop(0)
    lst = new_lst

print(lst[0])
