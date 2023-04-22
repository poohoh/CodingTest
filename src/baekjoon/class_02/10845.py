import sys

N = int(sys.stdin.readline())

queue = []
for _ in range(N):
    lst = sys.stdin.readline().split()

    if lst[0] == 'push':
        queue.append(lst[1])
    elif lst[0] == 'pop':
        if len(queue) != 0:
            print(queue[0])
            queue.pop(0)
        else:
            print(-1)
    elif lst[0] == 'size':
        print(len(queue))
    elif lst[0] == 'empty':
        if len(queue) == 0:
            print(1)
        else:
            print(0)
    elif lst[0] == 'front':
        if len(queue) != 0:
            print(queue[0])
        else:
            print(-1)
    else:
        if len(queue) != 0:
            print(queue[-1])
        else:
            print(-1)
