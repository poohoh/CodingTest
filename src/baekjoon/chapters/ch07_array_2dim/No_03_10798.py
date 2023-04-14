words = []
result = ""

max_len = -1

for i in range(5):
    word = list(input())
    words.append(word)
    max_len = max(max_len, len(word))

for j in range(max_len):
    for i in range(5):
        if len(words[i]) - 1 < j:
            continue
        result += words[i][j]

print(result)
