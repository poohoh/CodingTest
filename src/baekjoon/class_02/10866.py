import sys

N = int(sys.stdin.readline())

deque = []
for _ in range(N):
    lst = sys.stdin.readline().split()

    if lst[0] == 'push_front':
        deque = [lst[1]] + deque
    elif lst[0] == 'push_back':
        deque.append(lst[1])
    elif lst[0] == 'pop_front':
        if len(deque) != 0:
            print(deque[0])
            deque.pop(0)
            # if len(deque) > 1:
            #    deque = deque[1:]
            # else:
            #    deque = []
        else:
            print(-1)
    elif lst[0] == 'pop_back':
        if len(deque) != 0:
            print(deque[-1])
            deque.pop(-1)
        else:
            print(-1)
    elif lst[0] == 'size':
        print(len(deque))
    elif lst[0] == 'empty':
        if len(deque) == 0:
            print(1)
        else:
            print(0)
    elif lst[0] == 'front':
        if len(deque) != 0:
            print(deque[0])
        else:
            print(-1)
    else:
        if len(deque) != 0:
            print(deque[-1])
        else:
            print(-1)
