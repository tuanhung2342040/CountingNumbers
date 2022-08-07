animals = ['Ant', 'Cat', 'Chicken', 'Cow', 'Deer', 'Dog', 'Fish', 'Goat', 'Horse', 'Rat', 'Snake']
linear_comparisons = 0
def sequential_search(search_item):
    index = 0
    found = False
    linear_comparisons = 0
    while index < len(animals) and (not found):
        if animals[index] == search_item:
            found = True
        else:
            index += 1
        linear_comparisons += 1
    print('The number of comparisons is: ' + str(linear_comparisons))
    return found
def binary_search(search_item):
    first = 0
    last = len(animals)-1
    found = False
    binary_comparisons = 0
    while first <= last and (not found):
        middle = (first + last)//2
        if(search_item == animals[middle]):
            found = True
        elif search_item < animals[middle]:
            last = middle - 1
        else:
            first = middle + 1
        binary_comparisons+=1
    print('The number of comparisons is: ' + str(binary_comparisons))
    return found
def get_input():
    while True:
        try:
            animals = input('')
        except ValueError:
            print('This is an invalid input')
            continue
        else:
            break
    return animals
print('What animals are you looking for? ')
item = get_input()
found_item = sequential_search(item)
print(found_item)
found_item2 = binary_search(item)
print(found_item2)
#Sorting
unsorted_animals=['Chicken', 'Fish', 'Cat', 'Goat', 'Deer', 'Rat', 'Horse', 'Ant', 'Snake', 'Cow', 'Dog']
#Stack
#Program 0
values = []
values.append(25)
values.append(3)
value = values.pop()
print(2 * value)

#Program1
fruit = []
fruit.append('apple')
fruit.append('pear')
fruit.append('banana')
item = fruit.pop()
item = fruit.pop()
print('The item is: ' + item)
if len(fruit) != 0:
    item = fruit.pop()
    print('Still one more: ' + item)
#Program 2
nums =[]
sum = 0
for index in range(10, 0, -2):
    nums.append(index)
while not len(nums) == 0:
    number = nums.pop()
    sum += number
print('The sum of the number is: ' + str(sum))
#Program 3: 
items = []
items.append(1)
items.append(2)
items.append(3)
items2 = []
while not len(items) == 0:
    a = items.pop()
    items2.append(a)
print(items2)
print('The items in the stack are: ')
count = 0
while not len(items2) == 0:
    temp = items2.pop()
    print(temp)
    count+=1
print('There are '  + str(count) +' numbers in the stack')
items.append(1)
items.append(2)
items.append(3)
print(items)
#Queues
#program 0
q = []
q.append(25)
q.append(3)
print(q)
while len(q) != 0:
    b = q.pop(0)
    print(b)
list=[2, 9, 19, 20, 23, 34, 40, 41, 66, 90, 99]
binary_search(69)