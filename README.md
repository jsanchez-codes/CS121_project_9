# CS121_project_9
(lab) The Java Guesser

## instance variables

```
Scanner input based on system.in
```
## static void main()

```
create an instance of the class
```
## constructor (acts like main)

```
Make boolean keepGoing
set response to empty string
while keepGoing
    call menu() put result in response
    if response equals 0
        set keepGoing to false
    if response equals 1
        call humanGuesser()
    if response equals 2
        call computerGuesser()
    if response is anythinbg else
        tell user invalid input. type a number 0-2
```
## String menu()

```
takes no parameters
print out menu
    0) Quit
    1) Human Guesser
    2) Computer Guesser
ask for user input
return input as a string
```
## void humanGuesser()

```
create int correct random between 1 and 100
create int guess, initialize to 0
create int turns, initialize to 0
(for testing) print out correct answer
create boolean keepGoing, initialize to true
while keepGoing is true:
    increment the number of turns
    get guess from input as a string
    convert to int, put in guess
    if guess if less than correct
        print "Too low"
    if guess is greater than correct
        print "Too high"
    if guess is equal to correct
        print "Correct"
        set keepGoing to false to exit loop

    if turns is less than 7
        player wins: print a win statement
    if turns is greater than 7
        player loses: print a lose statement
    if turns is equal to 7
        it's a tie: print a draw statement
```
## int getMean(int lower, int upper)

```
utility function
used in computer guesser
given ints for lower and upper bound, finds the integer mean of these values
create int mean
add lower + upper
divide the result by 2
cast that result into an int
return the result
```
## void computerGuesser()

```
create int lower, set to 1
create int upper, set to 100
create int guess, use getMean to find mean of lower and upper
create int turns, set to 0
creat boolean keepGoing, set to true
while keepGoing is true:
    increment the number of turns
    ask the user for "(H)igh, (L)ow, or (C)orrect" store in response
    if response is "H":
        copy guess to upper
    if response is "L":
        copy guess to lower
        get a new guess with the getMean method
    if response is "C":
        set keepGoing to false to exit loop
    if guess is anything else
        tell user invalid input. type H, L, or C
```

