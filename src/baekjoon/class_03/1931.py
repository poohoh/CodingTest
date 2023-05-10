import sys

N = int(sys.stdin.readline())

meetings = []
for _ in range(N):
    lst = list(map(int,sys.stdin.readline().split()))
    meetings.append(lst)

meetings.sort(key = lambda x: x[0])
meetings.sort(key = lambda x: x[1])

result = []
for meeting in meetings:
    if result:
        if result[-1][1] <= meeting[0]:
            result.append(meeting)
    else:
        result.append(meeting)

print(len(result))