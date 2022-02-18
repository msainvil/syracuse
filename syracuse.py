def syracuse(u):
    iter =0
    while(u!=1):
        iter +=1
        if u%2==0: 
            u = u//2
            
        else:
            u = 3*u+1
        print(u)
    print(iter," : iterations")    
    return u

number =int(input())
syracuse(number)
