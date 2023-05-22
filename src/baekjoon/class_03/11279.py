import sys
from heapq import heappush, heappop

N = int(sys.stdin.readline())

heap = []
for _ in range(N):
    x = int(sys.stdin.readline())

    if x != 0:
        heappush(heap, (-1) * x)
    else:
        if heap:
            print((-1) * heappop(heap))
        else:
            print(0)