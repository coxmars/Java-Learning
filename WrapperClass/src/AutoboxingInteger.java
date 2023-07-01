public class AutoboxingInteger {
    public static void main(String[] args) {


        Integer [] numbersInteger = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int sum = 0;

        // This is the direct way using i.intValue()
        for (Integer i: numbersInteger) {
            if (i.intValue() % 2 == 0) { // Could be i.intValue() or simply i
                sum += i.intValue();
            }
        }
        System.out.println("sum = " + sum);

        // This is the indirect way using just i
        for (Integer i: numbersInteger) {
            if (i % 2 == 0) { // Could be i.intValue() or simply i
                sum += i;
            }
        }
        System.out.println("sum = " + sum);


    }
}
