package oop1;

public class ValueObjectMain {

    static void main(String[] args) {
        ValueData valueObj = new ValueData();

        valueObj.add();
        valueObj.add();

        System.out.println("최종 숫자=" + valueObj.value);
    }

}
