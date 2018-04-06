# OpenDiabetes Example Plugin Project
This sample project describes how to implement your own plugin for OpenDiabetes, checkout [MyImporter.java](https://github.com/Magnusgaertner/OpenDiabetesPluginTutorial/tree/master/src/de/opendiabetes/vault/plugin/importer/myPluginPkg/MyImporter.java) first.
All necessary steps how to write a plugin are described there in the comments.

---
## Importing and Building with IDEs
This sample project can be opened and is tested with [NetBeans](https://netbeans.org/).
This guide covers how to setup the project using it.



The repository is already set up as a NetBeans project, which makes it easy to get started:

1. Use `File > Open Project` to open the import dialogue.

2. Select the folder where you cloned the repository to and click `Open Project`.

Now you are all set to start and develop plugins or make changes to the base.
Current mappings of Ant targets and NetBeans' buttons are (button = target):
- `Build Project` = package (building the plugin)

Other targets can be executed by right-clicking the `build.xml` in the `Projects` pane under `Run Target`.

---
The internal build system that is used (Ant) makes it possible to integrate the project in almost any common IDE, so check out your IDEs documentation if you want to use a different one than NetBeans.
