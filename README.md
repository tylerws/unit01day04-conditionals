# Conditionals

1. `ThreeEqual.java`

Write a program that takes three integer command line arguments. If they are all equal, your program should print "equal". If they're not, print "not equal". If inappropriate arguments are provided, print usage information.

2. `Quadratic.java`

Write a more robust version of your quadratic equation solver, which takes three integer arguments `a`, `b`, and `c`, and prints the solutions to the quadratic equation ax^2 + bx + c = 0. It should print appropriate error messages if necessary arguments are not provided, should tell the user if the equation has no solutions. If `a` is zero, the equation can be solved using simple algebra, but the quadratic formula would cause a division by zero. Gracefully handle this case too.

A few test cases are shown in the table below:

`a` | `b` | `c` | Expected Output
---|---|---|---|
1 | 0 | -4 | 2.0, -2.0
1 | 0 | 4 | no solutions
0 | 2 | 7 | -3.5
1 | 2 | 1 | -1.0, -1.0

3. `RollLoadedDie.java`

Take no command line arguments, and print a die roll of a loaded (rigged) die. There is a 1/8 probability of rolling any number between 1 and 5 (inclusive). The 6 is more likely, with a 3/8 probability that it appear when the die is rolled