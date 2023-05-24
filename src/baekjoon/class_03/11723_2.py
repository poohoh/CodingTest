import sys

N = int(sys.stdin.readline())

s = set()
for _ in range(N):
    cmd = sys.stdin.readline().strip().split()

    if cmd[0] == 'all' or cmd[0] == 'empty':
        cmd = cmd[0]
    else:
        x = int(cmd[1])
        cmd = cmd[0]

    if cmd == 'add':
        s.add(x)
    elif cmd == 'remove':
        s.discard(x)
    elif cmd == 'check':
        if x in s:
            print(1)
        else:
            print(0)
    elif cmd == 'toggle':
        if x in s:
            s.discard(x)
        else:
            s.add(x)
    elif cmd == 'all':
        s = set([i for i in range(1, 21)])
    else:
        s = set()