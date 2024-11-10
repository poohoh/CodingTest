import sys
input = sys.stdin.readline

N, M = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

result = 0
added = [False] * (N+1)
for i in range(1, N+1):
    if added[i] == True:
        continue

    stack  = [i]
    added[i] = True
    while stack:
        cur = stack.pop()
        for element in graph[cur]:
            if not added[element]:
                stack.append(element)
                added[element] = True
    
    result += 1

print(result)