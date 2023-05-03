import sys

N, M = map(int, sys.stdin.readline().split())

pokemons = []
pokemons_dict = {}
for i in range(N):
    pokemon = sys.stdin.readline().strip()
    pokemons.append(pokemon)
    pokemons_dict[pokemon] = i + 1

for _ in range(M):
    question = sys.stdin.readline().strip()
    if question.isdigit():
        index = int(question)
        print(pokemons[index - 1])
    else:
        print(pokemons_dict[question])