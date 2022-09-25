'''
stack = []
# append() function to push
# element in the stack
stack.append('a')
stack.append('b')
stack.append('c')
 
print('Initial stack')
print(stack)
 
# pop() function to pop
# element from stack in
# LIFO order
print('\nElements popped from stack:')
print(stack.pop())
print(stack.pop())
print(stack.pop())
 
print('\nStack after elements are popped:')
print(stack)
#program 2
myStack = []
sum = 0
for index in range(10, 0, -2): 
    myStack.append(index)
print(myStack)
while not len(myStack) == 0:
    item = myStack.pop()
    sum += item
print("The sum of the number is: " + str(sum))

'''
#program 3: Write a program that will count and output the number
# of items in a stack(leaving the original unchanged)

#Queue Program 1



