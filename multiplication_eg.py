
from operator import mul


def multiplication_egyptienne(a,b):
    s =0
    while a != 0:
        if a % 2 ==1:
            s+=b
        a = a // 2
        b += b
    print(s)
    return s

a = int(input())
b = int(input())

multiplication_egyptienne(a,b)
