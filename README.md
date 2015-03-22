# tdd-by-exemple

My exercises folowing the Kent Beck 's book.

step by step branches
We will begin creating a concrete class Dollar, after another class Franc, we will create a parent Money, and 
we will remove the original classes.

Remember TDD algorithm

1. Quickly add a test
2. Run all tests and see the new one fail
3. Make a little change
4. Run all tests and see them all succeed
5. Refactor to remove duplication

##Section I: Money Example 

###Money Example

####branch name: money-step1

####branch name: money-step1-refactor

###Degenerate Objects

####branch name: money-step2

###Equality for All
Keys:
* One of the constraints on Value Objects is that the values of the instance variables of the object never change once they have been set in the constructor. ( Discuss this on Evans DDD book "Special Cases: When to Allow Mutability" ).

```
    public Dollar times(int multiplier){
      return new Dollar(amount * multiplier);
    }
```

We are returning a new Dollar object.

####branch name :money-step3

####branch name :money-step3-refactor
Adding jacoco code coverage

###Privacy
Making attributes private ... and adding checkstyle.
####branch name :money-step4

###Franc-ly Speaking

####branch name :money-step5

###Equality for All, Redux

####branch name :money-step6

###Apples and Oranges

###Makin’ Objects

###Times We’re Livin’ In


###The Root of all Evil
####branch name:money-step7

### Addition, Finally
### Make It
####branch name:money-step8

###Change
####branch name:money-step9: TODO

###Mixed Currencies
####branch name:money-step10: TODO

###Abstraction, Finally
####branch name:money-step11: TODO


