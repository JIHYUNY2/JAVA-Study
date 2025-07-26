public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001
        student1.name = "지윤";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "현식";
        student2.age = 18;
        student2.grade = 93;

        Student[] students = new Student[] { student1, student2 };

        System.out.println(student1);
        System.out.println(student2);

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }

        // iter --> for문 단축키
        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

    }

}
