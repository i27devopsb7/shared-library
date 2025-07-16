// defining my methods and later these are called by our application pipelines.

// Define a package 
package com.i27academy.builds;

// Define a Calculator class
class Calculator {
    // Define a variable to hold the jenkins content
    def jenkins

    Calculator(jenkins) {
        this.jenkins = jenkins 
    }

    // create a method to perform addition of 2 numbers 
    def add(firstNumber, secondNumber) {
        // logic to add numbers
        return firstNumber + secondNumber
    }

    // add(2,3)
    // add(10,20)
}




// methods 