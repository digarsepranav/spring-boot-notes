This example is for the SpringContainer:

WaterBottle class: 
A simple Java class with one instance variable, capacity, which is initialized through its constructor. It is just a normal Java object and has no Spring-specific code.

AppConfig class:
Marked as a configuration class using @Configuration. It contains a method annotated with @Bean that creates and returns a WaterBottle object with a capacity of 500 mL. Spring manages this object as a bean.

Main class: 
Creates the Spring IoC container by loading the configuration class. During initialization, Spring finds the @Bean method, creates the WaterBottle object, and stores it in the container.

Bean names: 
Calling getBeanDefinitionNames() prints the names of all beans managed by Spring, including:

Internal Spring infrastructure beans
The configuration class bean (appConfig)
The WaterBottle bean

Key observation: 
By default, the bean's name is the same as the @Bean method name. If the method is named waterBottle(), the bean's identifier in the Spring container is waterBottle.