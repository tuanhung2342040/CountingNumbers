# 2b)
'''num = 4
def descendingOder(num):
    for i in range (1, num+1):
        for j in range(1, num + 2-i):
            print(j, end="")
        print()
def ascendingOrder(num):
    for i in range (num):#1, num + 1
        for j in range(1, i + 2):#1, i + 1 
            print(j, end="")
        print()
descendingOder(num)
ascendingOrder(num)'''
def square_root(original):
    guess = 1
    difference = 1
    while difference > 0.0001:
        guess = (guess + original/guess)/2
        difference = abs(original-guess**2)
    return guess
num = 2
a = square_root(num)
print('The square root of ' + str(num) + ' is ' + str(a))

