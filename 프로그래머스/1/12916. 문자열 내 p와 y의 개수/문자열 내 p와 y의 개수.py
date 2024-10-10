def solution(s):
    answer = True
    p_cnt = 0
    y_cnt = 0
    
    for i in str(s):
        if(i == 'p' or i == 'P'):
            p_cnt += 1
        if(i == 'y' or i == 'Y'):
            y_cnt += 1
    
    if(p_cnt != y_cnt):
        answer = False

    return answer