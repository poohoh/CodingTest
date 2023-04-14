grades = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']
scores = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0]

total = 0  # 학점 총합
result = 0  # 학점 * 과목평점 총합

for _ in range(20):
    name, point, grade = input().split()
    point = float(point)
    if grade != 'P':
        total += point
        result += point * scores[grades.index(grade)]

print('%.6f' % (result / total))