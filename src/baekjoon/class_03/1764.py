import sys

N, M = map(int, sys.stdin.readline().split())

hear = []
see = []
result = []

for _ in range(N):
    hear.append(sys.stdin.readline().strip())

for _ in range(M):
    see.append(sys.stdin.readline().strip())

s1 = set(hear)
s2 = set(see)

result = sorted(list(s1&s2))

print(len(result))
for person in result:
    sys.stdout.write(person + '\n')