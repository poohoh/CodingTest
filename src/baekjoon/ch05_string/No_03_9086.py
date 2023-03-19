# 개수 입력
num = int(input())

# 단어 리스트 입력
words = []
for i in range(3):
    words.append(input())

# 단어 첫 글자와 마지막 글자 출력
for word in words:
    result = str(word[0]) + str(word[-1])
    print(result)