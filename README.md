This is an example mod, demonstrating how to implement an item driver that allows placing items as cpus into computer cases and servers, and provide alternative architectures to the computer they are placed into.

To run it, after cloning the repository, set up your workspace with gradle as usual:
```
gradlew setupDecompWorkspace idea
```
I recommend enabling the Gradle plugin in IDEA. When opening the project in IDEA with it enabled, it will ask you whether you'd like to import the Gradle project. When you do so, it'll automatically set up the library dependency on the OC API for you.

The example item will allow running the Pseudolang architecture.

Feel free to submit pull requests to expand and/or clarify documentation!
