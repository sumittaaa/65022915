import java.util.ArrayList;

class Mai{
    public static void main(String[] args) {
        
        Project project1 = new Project("Web A", "Developing a web application");
        Project project2 = new Project("Mobile app A", "Developing a mobile app");

        
        Employee employee1 = new Employee("Tom", 20, "UX/UI", "0001");
        employee1.addProject(project1);
        employee1.addProject(project2);

        
        employee1.showDetails();

       
        Project project3 = new Project("Web A", "Developing a web application");

        Employee employee2 = new Employee("Tim", 22, "Fontend", "0002");
        employee2.addProject(project3);

        employee2.showDetails();
        
    }
}

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}
interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}
class Employee implements Person, Job {
    String Name;
    int Age;
    String Position;
    String EmpID;
    ArrayList<Project> myProjects;

    public Employee(String name, int age, String position, String empID) {
        this.Name = name;
        this.Age = age;
        this.Position = position;
        this.EmpID = empID;
        this.myProjects = new ArrayList<>();
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public void showDetails() {
        System.out.println("******************************************");
        System.out.println("Name : " + getName());
        System.out.println("Position : " + getPosition());
        System.out.println("EmpID : " + getEmpID());
        System.out.println("Project");

        for (Project project : myProjects) {
            System.out.println("         " + project.getProject());
        }

        
    }


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    } 
    public int getAge() {
        return Age;
    }   
    public void setAge(int age) {
        this.Age = age;
    }    
    public String getPosition() {
        return Position;
    }  
    public void setPosition(String position) {
        this.Position = position;
    }
    public String getEmpID() {
        return EmpID;
    }
    public void setEmpID(String empID) {
        this.EmpID = empID;
    }
}
class Project {
    String projectName;
    String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProject() {
        return projectName + " : " + description;
    }
}