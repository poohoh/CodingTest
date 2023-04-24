import sys

N = int(sys.stdin.readline())

origin_lst = list(map(int, sys.stdin.readline().split()))  # 입력 리스트
sorted_lst = sorted(set(origin_lst))  # 중복을 제거하고 입력이 정렬된 리스트
counts = {num: idx for idx, num in enumerate(sorted_lst)}  # 각 원소에 대해서 압축된 개수

# 출력
for i in origin_lst:
    sys.stdout.write(str(counts[i]) + ' ')
