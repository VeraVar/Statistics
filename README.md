##JaCoCo Coverage Counters
JaCoCo uses a set of different counters to calculate coverage metrics. 

**Instructions**
Instruction coverage provides information about the amount of code that has been executed or missed.

**Branches**
JaCoCo also calculates branch coverage for all if and switch statements. This metric counts the total number of such branches in a method and determines the number of executed or missed branches. 

**Cyclomatic Complexity**
The complexity value can serve as an indication for the number of unit test cases to fully cover a certain piece of software.
Based on the coverage status of each branch JaCoCo also calculates covered and missed complexity for each method. Missed complexity again is an indication for the number of test cases missing to fully cover a module.

**Lines**
A source line is considered executed when at least one instruction that is assigned to this line has been executed.
JaCoCo calculates line coverage for classes and source file based on the actual source lines covered.