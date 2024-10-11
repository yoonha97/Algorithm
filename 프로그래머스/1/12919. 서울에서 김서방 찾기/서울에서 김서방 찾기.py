def solution(seoul):
    answer = ''
    index = 0
    for i in seoul:
        if(i == "Kim"):
            answer = f'김서방은 {index}에 있다'
            break
        index += 1
    return answer