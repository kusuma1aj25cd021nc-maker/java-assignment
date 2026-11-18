import java.util.Scanner;

class Student {
    int USN;
    String Name, Branch;
    long Phone;

    Student(int usn, String name, String branch, long phone) {
        USN = usn;
        Name = name;
        Branch = branch;
        Phone = phone;
    }

    void display() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
        System.out.println("Branch: " + Branch);
        System.out.println("Phone: " + Phone);
        System.out.println("--------------------");
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));

            System.out.print("USN: ");
            int usn = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Branch: ");
            String branch = sc.nextLine();

            System.out.print("Phone: ");
            long phone = sc.nextLong();
            sc.nextLine();

            s[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}
