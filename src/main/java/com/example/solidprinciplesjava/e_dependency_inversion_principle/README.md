* The PrintJsonAreaCalculator class does not have the dependency inversion principle
because that depend on concretions and not abstraction.

* For fix this, we should create another interface IAreaCalculator, and injected 
the IAreaCalculator in PrintJsonAreaCalculator for PrintJsonAreaCalculator no depend on concretions.For fix this, we should create another interface IAreaCalculator, and injected 

* Components should depend on abstraction, not on concretions.
