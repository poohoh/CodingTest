import sys

N, M = map(int, sys.stdin.readline().split())

sets = [{i} for i in range(1, N + 1)]
for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())

    merged = set()
    to_remove = []
    for s in sets:
        if u in s or v in s:
            merged |= s
            to_remove.append(s)  # sets.remove(s)를 하면 인덱스가 넘겨질 수 있음. (in 연산자가 인덱스를 순차적으로 올리는 듯)

    for r in to_remove:
        sets.remove(r)

    sets.append(merged)

print(len(sets))
