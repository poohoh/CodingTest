# 특정 원소가 속한 집합 찾기
def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]


# 두 원소가 속한 집합 합치기
def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


# 노드 개수, 간선 개수 입력
v, e = map(int, input().split())
parent = [0] * (v + 1)

# 모든 간선 담을 리스트와 최종 비용 변수
edges = []
result = 0

# 부모 테이블 초기화
for i in range(1, v + 1):
    parent[i] = i

# 모든 간선 입력
for _ in range(e):
    a, b, cost = map(int, input().split())

    # 비용순으로 정렬하기 위해 첫 번째 원소 비용으로 설정
    edges.append((cost, a, b))

# 간선 비용순으로 정렬
edges.sort()

# 사이클이 발생하지 않을 때에만 집합에 포함
for edge in edges:
    cost, a, b = edge
    if parent[a] != parent[b]:
        union_parent(parent, a, b)
        result += cost

print(result)
