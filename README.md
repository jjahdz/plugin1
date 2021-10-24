# Spigot Plugin Template

### What is it? ###
This template is essential for Spigot plugin development. All of the tedious Maven project creation is no longer needed. All that is needed is the ability to use this template.

### Installing ###
1. In the "Code" tab of the repository there is a green "Use this template: button. Click that button.
2. It will then redirect you to a new repository creation screen. Enter the name of your plugin. The description and public/private view are up to you.
3. An that's it the project has been setup and ready to clone.
4. Clone the project to your computer.

### Configuring pom.xml ###
1. Open the pom.xml file in your project folder.
2. In the "groupId" tag change the "com.company" to your desired package name.
3. In the "artifactId" tag change the "my-plugin" to your plugin's name. No capitals.
4. (Recommended) In the "properties" section change the "1.8" to your desired java version.
5. (Optional) In the "version" tag change the "0.0.1-SNAPSHOT" to your desired plugin version.
6. In the "name" tag change the "MyPlugin" to the name of your plugin. Use capital letters for the start of each word.
7. Down in the "dependencies" section, change the "version" tag from the "org.spigotmc" section to your desired version.
   - Spigot versions can be found [here](https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/spigotmc/spigot-api/)

### Importing your project ###
- Eclipse: 
  1. Navigate the "File -> Import -> Maven -> Existing Maven Projects" and click "Next".
  2. In the pop-up window select "Browse" and naviagate to your Github (Default location is in "Documents") folder and select the root of your project.
  3. Make sure that the "pom.xml" file is checked.
  4. Click "Finish"
- InteliJ
  1. In the "Welcome" screen, click on "Import Project".
  2. Select the root directory of your project in the Github folder and click "OK".
  3. In the "Import Project" window, select "Maven" then click "Next".
  4. Make sure that your project is selected. If so click "Next".
  5. In the "Please select project SDK" make sure that the correct JDC is selected. If so, click "Next".
  6. Click "Finish".

### Updating plugin dependencies from pom.xml ###
- Eclipse:
  1. In your "Project Explorer", navigate to the pom.xml file in your desired project.
  2. Right click on the pom.xml and naviate to "Maven -> Update Project".
- InteliJ
  1. After you update the pom.xml click on the "m" with an infinite arrow loop to update the project.
   
### Building plugin to a .jar file ###  
- Eclipse
  1. Right click on the project root folder and navigate to "Run As -> Maven Install".
  2. Navigate the the "target" folder in your project folder. There you will see two .jar files. You will use the one that contains "jar-with-dependencies".
- InteliJ (Coming Soon)
  
 
