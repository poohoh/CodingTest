import sys
from heapq import heappop, heappush, heapify

T = int(sys.stdin.readline())

for _ in range(T):
    k = int(sys.stdin.readline())
    visited = [False] * k
    min_heap, max_heap = [], []

    for i in range(k):
        char, n = sys.stdin.readline().split()
        n = int(n)

        if char == 'D':
            if n == 1:
                while max_heap and not visited[max_heap[0][1]]:
                    heappop(max_heap)
                if max_heap:
                    visited[max_heap[0][1]] = False
                    heappop(max_heap)
            else:
                while min_heap and not visited[min_heap[0][1]]:
                    heappop(min_heap)
                if min_heap:
                    visited[min_heap[0][1]] = False
                    heappop(min_heap)

        else:
            heappush(min_heap, (n, i))
            heappush(max_heap, (-n, i))
            visited[i] = True

    while max_heap and not visited[max_heap[0][1]]:
        heappop(max_heap)
    while min_heap and not visited[min_heap[0][1]]:
        heappop(min_heap)

    if min_heap and max_heap:
        print((-1)*heappop(max_heap)[0], heappop(min_heap)[0])
    else:
        print('EMPTY')
