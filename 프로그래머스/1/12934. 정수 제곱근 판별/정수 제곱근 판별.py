import math

def solution(n):
    answer = 0
    sqrt = math.sqrt(n)
    if(sqrt == int(sqrt)):
        answer = (sqrt + 1) ** 2
    else:
        answer = -1
    return answer