n = 0
while n < 20:
    n+=1
    if n%2 == 0:
        continue
    else:
        print(n)
       
    

while True:
        try:
            num = float(input("Enter: "))
        except ValueError:
            print("This is an invalid input. Try again!")
        else:
            break
        
for i in range(0, 7):
    for j in range(1, 7-i):#decreasing
        print(" ", end="")
    for j in range(0, 2* i + 1):#increasing
        print("0", end="")
    print()

for i in range(0, 7):
    for j in range(1, i+1):
        print(" ", end="")
    for j in range(0, 7-i):
        print("0", end="")
    for j in range(1, 7-i):
        print("0", end="")
    print()
        