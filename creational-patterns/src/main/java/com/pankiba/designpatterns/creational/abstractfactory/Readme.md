#### Abstract Factory Pattern

  - Details
      - Abstract Factory pattern adds another layer of abstraction for Factory pattern. If we compare Abstract Factory with
        Factory, it is pretty obvious that a new layer of abstraction is added. Abstract Factory is a super-factory which
        creates other factories. We can call it "Factory of factories".
      - Abstract Factory offers the interface for creating a family of related objects, without explicitly specifying their  
        classes.
      - AbstractFactory defers creation of product objects to its ConcreteFactory subclass
  - Implementation
  	  - AbstractFactory (VehicleFactory) :- declares an interface for operations that create abstract product objects.
      - ConcreteFactory (HondaFactory, ToyotaFactory) :- implements the operations to create concrete product objects.
      - AbstractProduct (Car, MotorCycle) :- declares an interface for a type of product object.
      - ConcreteProduct (HondaCar, HondaMotorCycle, ToyotaCar, ToyotaMotorCycle) :- defines a product object to be
        created by the corresponding concrete factory. Implements the AbstractProduct interface
  - When to use
      - The problems solved by abstract factory are similar to those solved by the factory method pattern, but with greater abstraction in the types of objects that need to be created. Therefore, in the case of abstract factory, it is required to work with several families of products related to each other rather than in a set of products.
  - Where it used
      - Spring Framework bean creation
