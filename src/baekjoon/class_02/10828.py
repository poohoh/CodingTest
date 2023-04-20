import sys

N = int(sys.stdin.readline().rstrip())

stack = []
for _ in range(N):
    lst = list(sys.stdin.readline().rstrip().split())
    if lst[0] == 'push':
        stack.append(int(lst[1]))
    elif lst[0] == 'pop':
        if stack:
            print(stack[-1])
            stack.pop(-1)
        else:
            print(-1)
    elif lst[0] == 'size':
        print(len(stack))
    elif lst[0] == 'empty':
        if not stack:
            print(1)
        else:
            print(0)
    else:
        if stack:
            print(stack[-1])
        else:
            print(-1)