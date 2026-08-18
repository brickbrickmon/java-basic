package class1;

public class ClassStart5 {

    static void main(String[] args) {

        Student student1;  // 타입을 받을 수 있는 변수 선언
        student1 = new Student();  // Student 인스턴스(객체) 생성하고 'x001'이라는 참조값(메모리주소)이 반환됨. 참조값이 없다면 NULL
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 점수: " +students[i].grade);
        }
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 점수: " + s.grade);
        }


    }
}
