a, b = map(int, input().split())

gcd = 0  # 최대공약수
lsm = 0  # 최소공배수

for i in range(min(a, b), 0, -1):
    if a % i == b % i == 0:
        gcd = i
        break

for i in range(max(a, b), a * b + 1):
    if i % a == i % b == 0:
        lsm = i
        break

print(gcd)
print(lsm)