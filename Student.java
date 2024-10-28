public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student S = new Student();
        System.out.println("Student name is: " + S.getName());
        System.out.println("Student age is: " + S.getAge());

        Student S2 = new Student("Maomao", 20);
        System.out.println("Student name is: " + S2.getName());
        System.out.println("Student age is: " + S2.getAge());
    }
}
