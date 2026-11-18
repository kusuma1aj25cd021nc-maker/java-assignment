class Student1 {
    int id;
    String name;
    int age;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println();
    }
}

class StudentDemo1 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.id = 101;
        s1.name = "Kusuma";
        s1.age = 20;

        s2.id = 102;
        s2.name = "Pavithra";
        s2.age = 21;

        s1.display();
        s2.display();
    }
}
