# Applying Spring DI to Non Spring Applications

## Inversion of Control (IoC)

- Inversion of Control is a principle in software engineering by which the 
  control of objects or portions of a program is transferred to a container or 
  framework. It's most often used in the context of object-oriented programming.

- By contrast with traditional programming, in which our custom code makes 
  calls to a library, IoC enables a framework to take control of the flow of a 
  program and make calls to our custom code. To enable this, frameworks use 
  abstractions with additional behavior built in. If we want to add our own 
  behavior, we need to extend the classes of the framework or plugin our own 
  classes.

- The advantages of this architecture are:
    - decoupling the execution of a task from its implementation
    - making it easier to switch between different implementations
    - greater modularity of a program
    - greater ease in testing a program by isolating a component or mocking its 
    dependencies and allowing components to communicate through contracts

- Inversion of Control can be achieved through various mechanisms such as: 
    - Strategy design pattern
    - Service Locator pattern
    - Factory pattern
    - Dependency Injection (DI)


## Dependency Injection

- Dependency injection is a pattern through which to implement IoC, where the 
  control being inverted is the setting of object's dependencies 

- The act of connecting objects with other objects, or “injecting” objects 
  into other objects, is done by an assembler rather than by the objects 
  themselves 

## The Spring IoC Container

1.  An IoC container is a common characteristic of frameworks that implement IoC

2.  In the Spring framework, the IoC container is represented by the interface 
    ```ApplicationContext```
    - The Spring container is responsible for instantiating, configuring and 
      assembling objects known as beans, as well as managing their lifecycle

3.  The Spring framework provides several implementations of the 
    ```ApplicationContext``` interface 
    
    a. ```ClassPathXmlApplicationContext``` for standalone applications
    
    b. ```FileSystemXmlApplicationContext``` for standalone applications
    
    c. ```WebApplicationContext``` for web applications
    
    d. ```AnnotationConfigApplicationContext``` for standalone applications
    
      - Accepting component classes as input 
      - In particular @Configuration-annotated classes, but also plain 
        @Component types and JSR-330 compliant classes using javax.inject 
        annotations 
      - Allows for registering classes one by one using register(Class...) 
        as well as for classpath scanning using scan(String...) 
      - In case of multiple @Configuration classes, @Bean methods defined in 
        later classes will override those defined in earlier classes
      - This can be leveraged to deliberately override certain bean definitions 
        via an extra @Configuration class 
      
## Spring Autowiring

0.  Wiring allows the Spring container to automatically resolve dependencies 
    between collaborating beans by inspecting the beans that have been defined
    
1.  Spring declares the dependency injection configurations in a special 
    configuration class
    - This class must be annotated by the ```@Configuration``` annotation
    - The Spring container uses this class as a source of bean definitions
    - Classes managed by Spring are called Spring beans

2.  Spring uses the ```@Autowired``` annotation to wire the dependencies automatically
    - We can use @Autowired on member variables, setter methods, and constructors

3.  Spring also supports ```@Inject```. ```@Inject``` is part of the Java CDI (Contexts and 
    Dependency Injection) that defines a standard for dependency injection

4.  Can also annotated a class with ```@Component``` to register them as beans
    - It's the ```@ComponentScan``` annotation that will tell Spring where to 
      search for annotated components

 