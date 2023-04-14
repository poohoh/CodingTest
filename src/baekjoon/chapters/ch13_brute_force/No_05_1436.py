n = int(input())

results = []
count = 0
num = 666
while count < n:
    if '666' in str(num):
        count += 1
        results.append(num)
    num += 1

print(results[-1])
