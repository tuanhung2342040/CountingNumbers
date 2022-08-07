import random
import math
'''
Bubble Pots
Thanh Tuan Hung Nguyen(Jay)
100384022
Feb 28 2022
'''
def get_bubbles():
    """
    get the number of bubbles within the pot
    the minimum is 0 and the maximum is 100
    """
    while True:
        try:
            num = int(input('How many bubbles do you want to have within the pot? '))
        except ValueError:
            print('This is an invalid input')
            continue
        if num <= 0 or num > 100:
            print('This is an invalid input')
            continue
        else:
            break
    return num
def get_number_of_generation():
    """
    get the number of generations will be simulated
    the minimum is 1 and the maximum is 30
    """
    while True:
        try:
            num = int(input('How many generations will it be? '))
        except ValueError:
            print('This is an invalid input')
            continue
        if num <= 0 or num > 30:
            print('This is an invalid input')
            continue
        else:
            break
    return num
def create_bubbles(size):
    """
    create an empty pot
    """
    bubbles = [0] * size
    return bubbles
def random_number():
    """
    get random numbers from 0 to 9
    """
    random_num = random.randint(0, 9)
    return random_num
def produce_bubbles(bubbles):
    """
    get the size of each bubble within the pot by the random method
    """
    for i in range(len(bubbles)):
        bubbles[i] = random_number()
def print_pot(bubbles):
    """
    print the bubbles within the pot
    """
    for i in range (len(bubbles)):
        if bubbles[i] == 0:
            print('.', end="" )
        elif bubbles[i] == 1:
            print(':', end="" )
        elif bubbles[i] == 2:
            print(';' , end="" )
        elif bubbles[i] == 3:
            print('!', end="" )
        elif bubbles[i] == 4:
            print('+', end="" )
        elif bubbles[i] == 5:
            print('*', end="" )
        elif bubbles[i] == 6:
            print('#', end="" )
        elif bubbles[i] == 7:
            print('&', end="" )
        elif bubbles[i] == 8:
            print('@', end="" )
        else:
            print('$', end="" )
     
        
def produce_next_generation(bubbles):
    """
    Produces the next generation based on the current generation
    """
    next_generation = create_bubbles(len(bubbles))
    for i in range(len(bubbles)):
        if bubbles[i] == 1 :
            next_generation[i] = bubbles[i]
        elif bubbles[i] == 3 or bubbles[i] == 4 :
            next_generation[i] = bubbles[i] + 1
        elif bubbles[i] == 0 or bubbles[i] == 2:
            next_generation[i] = bubbles[i] + 2
        elif  bubbles[i] == 7 or bubbles[i] == 8 or bubbles[i] == 9:
            next_generation[i] = bubbles[i]//2
            if next_generation[i - 1] == 7 or next_generation[i - 1] == 8 or next_generation[i - 1] == 9:
               next_generation[i - 1] = next_generation[i]
            next_generation[i - 1] = next_generation[i-1] + bubbles[i]//2
        else:
            next_generation[i] = 0
        if bubbles[len(next_generation) - 1] == 1 :
            next_generation[len(next_generation) - 1] = bubbles[len(next_generation) - 1] + 1
    return next_generation

def simulate_evolution():
    """
    simulates the required number of generations on the world
    """
    number_of_bubbles = get_bubbles()
    bubbles = create_bubbles(number_of_bubbles)
    produce_bubbles(bubbles)
    number_generations = get_number_of_generation()
    for i in range(number_generations):
        #print_pot(bubbles)
        print(bubbles)
        print()
        next_generation = produce_next_generation(bubbles)
        bubbles = next_generation
simulate_evolution()
print('End the program.')




