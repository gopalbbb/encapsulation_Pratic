package student;

public class Student {
   private String name;
 private int id;
 private String lastName;

    public Student(String name, int id, String lastName) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
    }

    public Student() {

    }

    public String getName() {
        System.out.println("user can access the value");
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        System.out.println("Id is private");
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
