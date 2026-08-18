package ref;

public class VarChange2 {

    static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA = " + dataA.value); // 10
        System.out.println("dataB = " + dataB.value); // 10

        dataA.value = 20;
        System.out.println("dataA = " + dataA.value); // 20
        System.out.println("dataB = " + dataB.value); // 20

        dataB.value = 30;
        System.out.println("dataA = " + dataA.value); // 30
        System.out.println("dataB = " + dataB.value); // 30

    }
}
