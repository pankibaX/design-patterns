#### Factory Pattern

  - Details
      - Encapsulates the details of object creation in a single class which is known as a "Factory" class.
      - Creates objects without exposing the instantiation logic to the client.
      - Refers to the newly created object through a common interface
  - Implementation
  	  - Using Switch/Case
          - The problem here is that, once we add a new concrete product, we need to modify the factory class. Its not very flexible and its violation of Open Close principle
  	  - Using Class registration
          - With this implementation we don't need to modify factory class on addition of newly product/vehicles.
  - When to use
      - When we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.
      - When there is a need to decouple a client from a particular product that it uses. Factory Pattern relieves a client of responsibility for creating and configuring instances of a product.
  - Where it used
      - ValueOf method in Java Wrapper class and String class
