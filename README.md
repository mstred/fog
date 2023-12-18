fog
===

Hello, this is [@mstred][1] and [fog][4] is my first move into Github as a open source contributor.

About
-----

Although it's still under construction, this project is meant to be a plain example and template for creating new Java enterprise-driven apps.

fog is a fork from [appfog/af-java-spring][2] project. I really loved the idea behind [@appfog][3] building bootstrap projects to help with starting up their cloud nodes, and so I'm here to help spreading the source.
The difference between [fog][4] and [af-java-spring][2] is in the project strucure and technologies that give life to the application.

Composition
-----------

For the library kit, it's set up in a Maven pom.xml file with the following core dependencies:

* JavaServer Faces (with the addition of Primefaces tool set)

* Java Persistence API (for Object-Relational database mapping, powered by Hibernate Implementation)

* Spring Framework (Mainly for DI/IoC container features, but also to help with ORM features via Entity Manager injections and transaction management)


  [1]: http://github.com/mstred
  [2]: http://github.com/appfog/af-java-spring
  [3]: http://console.appfog.com
  [4]: http://github.com/mstred/fog
