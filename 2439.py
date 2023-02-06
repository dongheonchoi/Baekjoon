a = int(input())

b = 0

e= 1

d = ""


while b < a:
    c = e
    e+=1
    for num in range(a): 
        if c<a:
            d+=" "
            c+=1
        else:
            d+="*"
            c+=1

    b+=1
    print(d)
    d = ""

