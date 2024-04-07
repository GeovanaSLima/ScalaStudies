# Functional Programming in Scala Specialization

Specialization course offered by _École Polytechnique Fédérale de Lausanne_ on Coursera, with the objective of learning to write elegant functional code in Scala. The Specialization is divided into 5 courses and the details for each one can be found on the course description [here](https://www.coursera.org/specializations/scala).


# Summary

---

1. [Functional Programming Principles in Scala](#functional-programming-principles-in-scala)
   * [Functions & Evaluation](#functions--evaluation)
   * Higher Order Functions
   * Data and Abstraction
   * Types and Pattern Matching
   * Lists
   * Collections


<br>

# Functional Programming Principles in Scala

---

## Functions & Evaluation

### Elements of Programming

Every non-trivial programming languages provides primitive expressions that represents the simplest elements of the language.

* For example: numbers or strings

From this primitive expressions, it provides ways to combine expressions (e.g.: adding two numbers) and ways to abstract these expressions.

* Abstracting - introduce a name for an expression, and it can later be used by its name

#### Evaluation Strategies

Evaluation is the process of reducing an expression or variable into a value.

In Scala, we have, mainly, two types of evaluation methods, **call-by-name** and **call-by-value**:

__Call-by-Value__
* The argument expression is evaluated *before* the function is applied and the result is passed as the parameter
* The expression is evaluated only once and the result is reused every time the parameter is accessed within the function

__Call-by-Name__
* The argument expression is evaluated everytime it is accessed
* If a function argument is unused, it will not be evaluated

<br>

``` scala
def example = 2           // evaluated when called
val example = 2           // evaluated immediately
lazy val example = 2      // evaluated once when needed

def square(x: Double)     // call by value
def square(x: => Double)  // call by name
```

