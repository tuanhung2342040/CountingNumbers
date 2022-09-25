'''
Searching and sorting
Thanh Tuan Hung Nguyen
100384022
Mar 10 2022
'''
# 
numbers = [4, 10, 3, 19, 20, 1, 2, 77, 50, 45]
def selection_sort():
    for i in range(len(numbers) - 1):
        smallest = i
        for j in range(i+1, len(numbers)):
            if numbers[j] < numbers[smallest]:
                smallest = j
        temp = numbers[i]
        numbers[i] = numbers[smallest]
        numbers[smallest] = temp
        print(numbers)
'''def bubble_sort():
    for i in range(len(numbers)):
        for j in range(len(numbers) - 1):
            if numbers[j] > numbers[j + 1]:
                temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
                print(numbers)
                ''' 
print('The list before sorting: ' )
print(numbers)
print('The list after sorting: ')
selection_sort()

    
 
