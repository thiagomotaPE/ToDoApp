/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TodoApp;

import controller.ProjectController;
import model.Project;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("projeto teste");
        project.setDescription("ddddddddddd");
        projectController.save(project);
    }
}

