list=[2, 9, 19, 20, 23, 24, 34, 40, 41, 66, 90, 99]
def binary_search(search_item):
    first = 0
    last = len(list)-1
    found = False
    binary_comparisons = 0
    while first <= last and (not found):
        middle = (first + last)//2
        if(search_item == list[middle]):
            found = True
        elif search_item < list[middle]:
            last = middle - 1
        else:
            first = middle + 1
        binary_comparisons+=1
    print('The number of comparisons is: ' + str(binary_comparisons))
    return found
binary_search(14)