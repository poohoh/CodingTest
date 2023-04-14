while True:
    n = int(input())
    if n == -1:
        break

    result = []
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            result.append(i)

    if sum(result) == n:
        print(n, " = ", " + ".join(str(i) for i in result), sep="")
    else:
        print(n, "is NOT perfect.")
