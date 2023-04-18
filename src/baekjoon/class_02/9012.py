n = int(input())

for _ in range(n):
    lst = list(input())
    count1 = count2 = 0
    result = 'YES'
    for parenthesis in lst:
        if parenthesis == '(':
            count1 += 1
        elif parenthesis == ')':
            count2 += 1

        if count2 > count1:
            result = 'NO'
            break
    if count1 != count2:
        result = 'NO'
    print(result)