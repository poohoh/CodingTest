INF = int(1e9)  # 무한을 의미하는 INF 값을 10억으로 설정

# 노드의 개수, 간선의 개수 입력
n, m = map(int, input().split())

# 2차원 리스트(그래프)를 만들고, 모든 값을 무한으로 초기화
graph = [[INF] * (n + 1) for _ in range(n + 1)]

# 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
for a in range(n + 1):
    for b in range(n + 1):
        if a == b:
            graph[a][b] = 0

# 각 간선에 대한 정보를 입력 받아, 그 값으로 초기화
for _ in range(m):
    # A와 B가 서로에게 가는 비용 1
    a, b = map(int, input().split())
    graph[a][b] = 1
    graph[b][a] = 1

# 거쳐 갈 노드 X와 최종 목적지 K 입력
x, k = map(int, input().split())

# 플로이드 워셜 알고리즘 수행
for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

# 수행 결과 출력
distance = graph[1][k] + graph[k][x]

# 도달할 수 없으면 -1, 있으면 최단 거리 출력
if distance >= INF:
    print("-1")
else:
    print(distance)
