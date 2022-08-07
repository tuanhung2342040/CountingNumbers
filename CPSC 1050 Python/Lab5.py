import math
import random
'''
Name: Thanh Tuan Hung Nguyen(Jay)
Student Number: 100384022
'''
# Output the volume of a ball
def get_num():
    while True:
        try:
            num = float(input())
        except ValueError:
            print("This is an invalid input. Try again!")
            continue
        if num < 0:
            print("This is an invalid input. Try again!")
            continue
        else:
            break
    return num
def volume_a_ball():
    print("Please enter a radius you want...")
    radius = get_num()
    volume_of_a_ball = round(4/3*math.pi*int(radius)**3, 3)
    print('The volume of a ball with a radius ' + str(radius) + ' is ' + str(volume_of_a_ball) + ' m^3')
volume_a_ball()
print()
# Ask for a 4-digit positive number and then print out each digit at one time
def get_a_4digit_positive():
    while True:
        try:
            num = int(input("Please enter a positive 4-digit number: "))
        except ValueError:
            print("This is an invalid value. Please try again")
            continue
        if num < 1000 or num > 9999:
            print("This is an invalid value. Try again")
            continue
        else:
            break
    return num
def print_each_digit():
    number = get_a_4digit_positive()
    temp = number
    fourth_digit = temp%10
    temp= math.floor(temp/10)
    third_digit = temp%10
    temp= math.floor(temp/10)
    second_digit = temp%10
    temp= math.floor(temp/10)
    first_digit = temp
    print('The number ' + str(number) + ' after splitting them is: ')
    print(fourth_digit)
    print(third_digit)
    print(second_digit)
    print(first_digit)
print_each_digit()
print()
# How much to withdraw and then compute
def plurals_singular(num):
    if num > 1:
        return "notes"
    else:
        return "note"
def atm():
    bills = [20, 10, 5, 1] 
    print("How much money do you want to withdraw? ")
    withdraw = get_num()
    temp = int(withdraw)        
    twenty_dollar_bills = math.floor(temp/bills[0])
    temp = temp - twenty_dollar_bills * bills[0]
    ten_dollar_bills = math.floor(temp/bills[1])
    temp = temp - ten_dollar_bills * bills[1]
    five_dollar_bills = math.floor(temp/bills[2])
    temp = temp - five_dollar_bills * bills[2]
    one_dollar_bills = math.floor(temp/bills[3])
    print('You should take: ' + str(twenty_dollar_bills) + 'x$20' + str(plurals_singular(twenty_dollar_bills)),
                                str(ten_dollar_bills) + 'x$10' + str(plurals_singular(ten_dollar_bills)),
                                str(five_dollar_bills) + 'x$5' + str(plurals_singular(five_dollar_bills)),
                                str(one_dollar_bills) + 'x$1' + str(plurals_singular(one_dollar_bills)))
atm()
# MathQuiz
def math_quiz():
    start = 0
    end = 5
    number = start
    rightAnswer = 0
    for number in range(start, end):
        random_num1 = random.randint(1, 10) 
        random_num2 = random.randint(1, 10) 
        print("what is " + str(random_num1) + " times " + str(random_num2) + "?")
        answer = input("Your answer is: ")
        if int(answer) == random_num1*random_num2:
            rightAnswer+=1
    print("After the test, you got " + str(rightAnswer) + "/5 = " + str(rightAnswer/5*100) + "%" )
math_quiz()
