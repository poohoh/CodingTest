def check(num):
    for i in range(len(num) // 2):
        if num[i] != num[len(num) - 1 - i]:
            print('no')
            return
    print('yes')


while True:
    num = input()
    if num == '0':
        break
    check(num)
