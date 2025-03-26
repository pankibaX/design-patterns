#### Factory Method Pattern

  - Details
       - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets
  a class defer instantiation to subclasses.
      - Creator relies on its subclasses to define the factory method so that it returns an instance of the appropriate
  ConcreteProduct.
  - Implementation
  	  - Product (Vehicle) :- Defines the interface of objects the factory method creates.
  	  - ConcreteProduct (MotorCycle, Car) :- Implements the product interface.
  	  - Creator (VehicleFactory) :- Declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.
  	  - ConcreteCreator (CarFactory, MotorCycleFactory) :- Overrides the factory method to return an instance of a
  ConcreteProduct
  - When to use
      - When we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.
  - Where it used
      - Spring Framework
