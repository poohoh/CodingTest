from collections import deque
import sys
input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())

graph = {}
# 각 노드에 대해 연결된 리스트를 빈 리스트로 초기화
for i in range(N):
    graph[i+1] = []

# 각 라인에서 연결된 노드 추가
for _ in range(N-1):
    i, j = map(int, input().split())
    graph[i].append(j)
    graph[j].append(i)

# 부모 노드 리스트
parents = [0] * (N+1)

d = deque()
d.append(1)

while d:
    parent = d.popleft()

    for child in graph[parent]:
        if parents[child] == 0 and child != 1:
            parents[child] = parent
            d.append(child)

for i in range(2, N+1):
    print("%d\n" % parents[i])