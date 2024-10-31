N = int(input())
sizes = list(map(int, input().split()))
T, P = map(int, input().split())

# T
t_sum = 0
for size in sizes:
    num_t = size // T
    rest = 1 if size % T else 0
    t_sum += num_t + rest

# P
p_quotient = N // P
p_remainder = N % P

# print
print(t_sum)
print(p_quotient, p_remainder)