# OpenDiabetes Example Plugin Project
This sample project describes how to implement your own plugin for OpenDiabetes, checkout MyImporter.java first.
All necessary steps how to write a plugin are described there in the comments.

---
## Importing and Building with IDEs
This sample project can be imported and is tested with the NetBeans, Eclipse and Intellij IDEs. Follow these instruction to import and use them:

### Eclipse
Use `File > Open Projects from File System...` to import the sources. Then right-click the `build.xml` and select `Run As > Ant Build...`. In the popped-up menu check the `package` target to execute and choose a name for the configuration. Afterwards you can build the plugin by simply clicking the `Run As` icon in the menu bar at the top.

### Intellij
Use `File > Open...` to import the sources. Then mark the `BaseLibs` and `libs` folders as `Resources Root` and add the jars inside as libraries to the project. Also mark `src` as `Sources Root`. Then right-click the `build.xml` and add it as an Ant build file. You can then open the belonging pane under `View > Tools Windows > Ant Build`. Finally you have to set the project's SKD under `File > Project Structure... > Project` The targets can be executed by simply double clicking them.

### Netbeans
Use `File > New Project` to open the import dialogue. Then select `Java Free-Form Project` and advance. Select the folder where you clone the repository to, the build script should be detected automatically. In the next step select the `package` target in the `Build Project` menu and advance. In the fourth step select JDK 1.8. In step five add the jars from `BaseLibs` and `libs` to the classpath. Finally create the `out` folder as target destination for the output and finish the setup. You can then build the plugin by simply clicking the `Build Project` item in the menu bar at the top.
