public class Homework {

    public static void main(String[] args) {

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        System.out.println("Общий вес 2-х боксеров = " + (weightBoxer1 + weightBoxer2));
        System.out.println("Разница между весами боксеров = " + (-weightBoxer1 + weightBoxer2));

        var weightDifference1 = -weightBoxer1 + weightBoxer2;
        var weightDifference2 =  weightBoxer2 % weightBoxer1;

    }

}
