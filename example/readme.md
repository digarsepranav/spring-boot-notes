1. Goal of the Program

This program demonstrates how the Spring IoC (Inversion of Control) Container creates objects (beans), manages their lifecycle, and automatically injects dependencies using Constructor Injection.

Instead of writing:

Database db = new MySqlDatabase();
UserService service = new UserService(db);

Spring does it automatically.

2. Project Structure
   com.beans.example
   │
   ├── Database.java
   ├── MySqlDatabase.java
   ├── UserService.java
   └── ExampleApplication.java
3. Database Interface
   public interface Database {
   void save(String user);
   }
   Purpose

Defines a contract.

Any database implementation must provide:

save(String user)
Concept
Interface
Abstraction
Loose Coupling
Dependency Inversion Principle (SOLID)

Instead of depending on

MySqlDatabase

we depend on

Database

This makes changing implementations easy.

4. MySqlDatabase
   @Component
   public class MySqlDatabase implements Database {
   Purpose

Concrete implementation of Database.

@Component

Marks the class as a Spring Bean.

During startup Spring performs

Component Scan

and finds

@Component

Then creates

MySqlDatabase Object

Stores it inside

Spring IoC Container

Only one object is created by default.

Scope

Singleton
Bean

A bean is simply

An object created and managed by Spring.

Without Spring

new MySqlDatabase();

With Spring

@Component

Spring creates it.

5. UserService
   @Service
   public class UserService

@Service is a specialization of

@Component

Used for business logic classes.

Internally

@Service

behaves exactly like

@Component

but improves readability.

6. Constructor Injection
   private final Database database;

public UserService(Database database){
this.database = database;
}

This constructor asks Spring

"Give me any object implementing Database."

Spring looks inside its container.

Finds

MySqlDatabase

Injects it automatically.

No

new

required.

7. Why Interface instead of Class?

Instead of

MySqlDatabase database;

we write

Database database;

Benefits

Can switch implementation easily.

Today

MySqlDatabase

Tomorrow

PostgreSQLDatabase

No changes inside

UserService

Only configuration changes.

8. Dependency Injection (DI)

Dependency

Database

Dependent class

UserService

Spring injects dependency automatically.

Three types exist

Constructor Injection
UserService(Database database)

Recommended.

Setter Injection
setDatabase(Database database)

Optional dependency.

Field Injection
@Autowired
Database database;

Easy but not recommended.

9. Inversion of Control (IoC)

Without Spring

Developer creates objects.

new MySqlDatabase()

With Spring

Container creates objects.

Control shifts from developer

↓

to

Spring Container.

Hence

Inversion of Control
10. Spring Container

Created here

SpringApplication.run(...)

Responsibilities

Creates beans
Injects dependencies
Manages lifecycle
Performs component scan
11. Component Scan

Performed because of

@SpringBootApplication

Internally contains

@ComponentScan

Spring scans

com.beans.example

and all subpackages.

Looks for

@Component
@Service
@Repository
@Controller
@RestController
@Configuration

Registers all as beans.

12. @SpringBootApplication

Combination of

@Configuration
@EnableAutoConfiguration
@ComponentScan

It

Starts Spring
Performs component scanning
Enables auto configuration
13. CommandLineRunner
    implements CommandLineRunner

Runs after Spring finishes starting.

@Override
public void run(String... args){
userService.saveUser("Pranav");
}

Useful for

Testing
Initial data
Startup tasks
14. Flow of Execution
    main()
    │
    ▼
    SpringApplication.run()
    │
    ▼
    Create IoC Container
    │
    ▼
    Component Scan
    │
    ▼
    Find @Component
    │
    ▼
    Create MySqlDatabase Bean
    │
    ▼
    Find @Service
    │
    ▼
    Create UserService Bean
    │
    ▼
    Constructor requires Database
    │
    ▼
    Inject MySqlDatabase
    │
    ▼
    Application Started
    │
    ▼
    run()
    │
    ▼
    userService.saveUser()
    │
    ▼
    database.save()
    │
    ▼
    Output Printed
15. Bean Lifecycle (Simplified)
    @Component Found
    │
    ▼
    Object Created
    │
    ▼
    Dependencies Injected
    │
    ▼
    Ready to Use
    │
    ▼
    Application Running
    │
    ▼
    Application Stops
    │
    ▼
    Bean Destroyed
16. Why final?
    private final Database database;

Means

Dependency cannot change.
Guarantees initialization through the constructor.
Promotes immutability.
Recommended for constructor injection.
17. Why No new Keyword?

You never write

new MySqlDatabase()

because Spring creates and manages the object.

This is the core idea of IoC and DI.

18. What Happens if Two Implementations Exist?

Example

@Component
class MySqlDatabase implements Database
@Component
class PostgreSQLDatabase implements Database

Spring now finds two beans of type Database and throws:

NoUniqueBeanDefinitionException

Resolve it using:

@Primary
@Qualifier
19. SOLID Principles Used
    S — Single Responsibility: UserService handles business logic; MySqlDatabase handles persistence.
    D — Dependency Inversion: Depend on the Database interface, not a concrete class.
20. Key Interview Points
    Bean: Object managed by Spring.
    IoC: Spring controls object creation instead of your code.
    DI: Spring supplies required dependencies automatically.
    Component Scan: Finds classes annotated with Spring stereotypes.
    Constructor Injection: Preferred injection method; supports immutability and testability.
    @Component: Generic bean.
    @Service: Business logic bean.
    @SpringBootApplication: Starts the application, enables auto-configuration, and scans components.
    CommandLineRunner: Executes code after the application context is fully initialized.