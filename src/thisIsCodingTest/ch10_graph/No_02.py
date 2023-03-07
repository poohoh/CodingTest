def find_parent(parent, x):
    # 루트 노드가 아닌 경우
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]
