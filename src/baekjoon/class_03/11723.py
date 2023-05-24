import sys


### 리스트로 구현

def lst_check(lst, x):
    for e in lst:
        if e == x:
            print(1)
            return
    print(0)


def lst_add(lst, x):
    for e in lst:
        if e == x:
            return
    lst.append(x)


def lst_remove(lst, x):
    for e in lst:
        if e == x:
            lst.remove(e)
            return


def lst_toggle(lst, x):
    for e in lst:
        if e == x:
            lst.remove(e)
            return
    lst.append(x)


def lst_empty(lst):
    for _ in range(len(lst)):
        lst.pop()


def lst_all(lst):
    lst_empty(lst)
    for i in range(1, 21):
        lst.append(i)


N = int(sys.stdin.readline())

lst = []
for _ in range(N):
    command = sys.stdin.readline().strip().split()

    if command[0] == 'add':
        lst_add(lst, int(command[1]))
    elif command[0] == 'remove':
        lst_remove(lst, int(command[1]))
    elif command[0] == 'check':
        lst_check(lst, int(command[1]))
    elif command[0] == 'toggle':
        lst_toggle(lst, int(command[1]))
    elif command[0] == 'all':
        lst_all(lst)
    else:
        lst_empty(lst)