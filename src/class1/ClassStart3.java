package class1;

public class ClassStart3 {

    static void main(String[] args) {
        /*
         * 객체 vs 인스턴스
         * student1과 student2는 서로 다른 객체이다.
         * 인스턴스는 주로 객체가 어떤 클래스에 속해있는지 강조할 때 사용한다.
         *
         * 둘다 클래스에서 나온 실체들이라 비슷하게 사용되지만 인스턴스는 객체보다 좀 더 관계에 맞춘 단어이다.
         * 'student1은 Student의 인스턴스이다.'
         *
         * */

        Student student1;  // 타입을 받을 수 있는 변수 선언
        student1 = new Student();  // Student 인스턴스(객체) 생성하고 'x001'이라는 참조값(메모리주소)이 반환됨.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 점수: " +student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 점수: " +student2.grade);


    }
}
