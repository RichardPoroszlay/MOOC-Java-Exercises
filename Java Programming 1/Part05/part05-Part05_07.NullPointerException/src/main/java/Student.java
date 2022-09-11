public class Student {
    private String name;
    private String sex;
    private int age;
    private int id;
    
    public Student(String name) {
        this.name = name;
        this.sex = "Unknown";
        this.age = 0;
        this.id = 0;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = "Unknown";
        this.id = 0;
    }
    
    public Student(String name, String sex, int age, int id) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", " + this.sex + ", " + this.age + ", " + this.id;
    }
}
