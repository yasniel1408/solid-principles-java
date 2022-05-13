
* The class AreaCalculator does not have the open closed principle
because there are two ways to calculate the area and if I add another shape
we need to add in this function sum how calculate the area for another shape.

* To solve the problem, we need to send the responsibility of calculating the 
area of the area of the AreaCalculate class to each figure, and create 
an interface for each figure to implement it. (polimorfismo)

* Classes should be open for extensions, closed for modification.
In other words, you should not have to rewrite an existing class
for implementing new features.
