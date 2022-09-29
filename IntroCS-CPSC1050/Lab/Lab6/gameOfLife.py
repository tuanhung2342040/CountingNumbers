'''
Framework for the Game of Life
Thanh Tuan Hung Nguyen
Feb 28 2022

create world
populate world
determine next generation
print world
'''
def create_world(size):
    """
        Creates an empty of the appropriate size
    """

    world = [0] * size
    return world
def populate_world(world):
    """
    Populates the world with a certain number of lifeforms
    """
    world[1] = 1
    world[5] = 1
    world[6] = 1

def print_world(world):
    """
    Prints the world in a nice format
    """
    print(world)
def produce_next_generation(world):
    """
    Produces the next generation based on the current generation
    """
    next_generation = create_world(len(world))
    for i in range(len(world)):
        if  world[i] == 0:
            next_generation[i] = 1
        else:
            next_generation[i] = 0
    return next_generation

def simulate_evolution(number_generations):
    """
    simulates the required number of generations on the world
    """
    old_generation = create_world(8)
    populate_world(old_generation)
    generation = 1
    while generation <= number_generations:
        next_generation = produce_next_generation(old_generation)
        print_world(old_generation)
        old_generation = next_generation
        generation += 1

simulate_evolution(10)
print('End of simulation')