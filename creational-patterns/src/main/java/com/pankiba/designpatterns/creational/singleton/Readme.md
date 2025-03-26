#### Singleton Pattern

  -  Details
      - it is used to encapsulate the creation of an object in order to maintain control over it. This not
      only ensures that only one is created, but also allows lazy instantiation; that is, the instantiation of the object
      can be delayed until it is actually needed. This is especially beneficial if the constructor needs to perform a
      costly operation, such as accessing a remote database
  - Implementation
      - While implementing singleton pattern we need to consider following 4 steps
          - Provide a default Private constructor
          - Create a Method for getting the reference to the Singleton Object
          - Make the Access method synchronised to prevent Thread Problems
          - Override the Object clone method to prevent cloning
          - Singleton is serialised and then de-serialised more than once, there will be multiple objects and not a singleton. For this implement readResolve method in order to avoid having 2 different objects.
  - When to use
  - Where it used
