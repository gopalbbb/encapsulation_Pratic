package student;

public class Main {
    public static void main(String[] args) {
        Student Sdnt = new Student();
        Sdnt.setId(1);
        Sdnt.setName("Rahul");
        Sdnt.setLastName("paudel");


        System.out.println(Sdnt.getId());
        System.out.println(Sdnt.getName());
        System.out.println(Sdnt.getLastName());
    }

}
