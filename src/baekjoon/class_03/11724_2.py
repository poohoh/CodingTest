import sys
input = sys.stdin.readline

N, M = map(int, input().split())

# print(N)
# print(M)
graph = []

for _ in range(M):
    u, v = map(int, input().split())
    graph.append([u,v])

for i in range(1, N+1):
    # print(f'\n[iteration: {i}]')
    # print(f'graph:{graph}')
    remove_idx = []
    result = []
    
    # 각 연결에서 해당되는 노드가 있으면 해당 연결을 모두 하나로 묶기
    for idx, g in enumerate(graph):
        if i in g:
            result.extend(g)
            remove_idx.append(idx)

    for r in sorted(remove_idx, reverse=True):
        graph.pop(r)
        # print(f'pop: {r}')
    graph.append(result)
    # print(f'result: {result}\n\n')

print(len(graph))