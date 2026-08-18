package class1;

public class ClassStart4 {

    static void main(String[] args) {

        /************************************************V
            자바의 대입은 항상 변수에 들어 있는 값을 복사한다.
         ************************************************/

        Student student1;  // 타입을 받을 수 있는 변수 선언
        student1 = new Student();  // Student 인스턴스(객체) 생성하고 'x001'이라는 참조값(메모리주소)이 반환됨. 참조값이 없다면 NULL
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 점수: " +students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 점수: " +students[1].grade);


    }
}
