def palindrome(word):
    for i in range(len(word)//2):
        if word[i] != word[len(word) - 1 - i]:
            return 0
    return 1

word = input()

print(palindrome(word))