while True:
    n = int(input())
    if n == -1:
        break

    sum = 0
    divisors = []
    for i in range(1, n//2+1):
        if n%i==0:
            sum += i
            divisors.append(i)

    if sum == n:
        result = str(n) + " = "
        for i in range(len(divisors) - 1):
            result += str(divisors[i]) + " + "
        result += str(divisors[-1])

        print(result)
    else:
        print(str(n) + " is NOT perfect.")