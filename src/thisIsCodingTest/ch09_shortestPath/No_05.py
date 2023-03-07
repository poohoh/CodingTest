import heapq

# 무한 정의
INF = int(1e9)

# 노드 개수, 간선 개수, 시작 노드 입력
n, m, start = map(int, input().split())

# 그래프 초기화
graph = [[] for _ in range(n + 1)]

# 최단 거리 리스트 초기화
distance = [INF] * (n + 1)

# 모든 간선 입력
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))

# 다익스트라 알고리즘
def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    # 큐가 비어 있지 않은 경우
    while q:
        # 최단 거리가 가장 짧은 노드 꺼내기
        dist, now = heapq.heappop(q)
        # 이미 방문한 노드인 경우
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]

            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


# 다익스트라 알고리즘 수행
dijkstra(start)

# 도달할 수 있는 노드 개수
count = 0

# 도달할 수 있는 노드 중에서 가장 먼 노드의 최단 거리
max_distance = 0

for d in distance:
    if d != INF:
        count += 1
        max_distance = max(max_distance, d)

# 시작 노드는 제외하므로 count-1 출력
print(count - 1, max_distance)
