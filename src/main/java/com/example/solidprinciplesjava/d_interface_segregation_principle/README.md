
* The classes Circle, Rectangle and Square does not have the interface segregation principle
because that not have volumen.

* To solve the problem, we need to create two interfaces IShape and IThreeDimensionalShape,
and in the case of Cube will implement Shape and IThreeDimensionalShape.

* Interface should not force classes to implement what they can't do. 
Large interface should be divided small ones.