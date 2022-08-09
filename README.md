# JPMS App

Purpose of this repository is demonstrate the working of modular java application, here the abbreviation JPMS stands for Java Platform Module System and was introduced in Java 9.0.

## Project Structure
This contains three modules as below:
- JPMSApp Module: contains a single package and main class for the application. This module as all the below three modules as its dependencies.
- JPMSServer Module: is an interface.
- JPMSServerOne: implements JPMSServer interface and requires JPMSServer module as its dependency. This module also contains some internal packages which are not exposed to the outside world namely, the internal package which contains the Filter class - used internally.
- JPMSServerTwo: implements JPMSServer interface and requires JPMSServer module as its dependency. This module also contains some internal packages which are not exposed to the outside world namely, the internal package which contains the Filter class - used internally.

## Goals Of JPMS: 
### Source: <a href="https://www.oracle.com/in/corporate/features/understanding-java-9-modules.html">Oracle</a>

- Reliable configuration—Modularity provides mechanisms for explicitly declaring dependencies between modules in a manner that’s recognized both at compile time and execution time. The system can walk through these dependencies to determine the subset of all modules required to support your app.
- Strong encapsulation—The packages in a module are accessible to other modules only if the module explicitly exports them. Even then, another module cannot use those packages unless it explicitly states that it requires the other module’s capabilities. This improves platform security because fewer classes are accessible to potential attackers. You may find that considering modularity helps you come up with cleaner, more logical designs.
- Scalable Java platform—Previously, the Java platform was a monolith consisting of a massive number of packages, making it challenging to develop, maintain and evolve. It couldn’t be easily subsetted. The platform is now modularized into 95 modules (this number might change as Java evolves). You can create custom runtimes consisting of only modules you need for your apps or the devices you’re targeting. For example, if a device does not support GUIs, you could create a runtime that does not include the GUI modules, significantly reducing the runtime’s size.
- Greater platform integrity—Before Java 9, it was possible to use many classes in the platform that were not meant for use by an app’s classes. With strong encapsulation, these internal APIs are truly encapsulated and hidden from apps using the platform. This can make migrating legacy code to modularized Java 9 problematic if your code depends on internal APIs.
- Improved performance—The JVM uses various optimization techniques to improve application performance. JSR 376 indicates that these techniques are more effective when it’s known in advance that required types are located only in specific modules.
