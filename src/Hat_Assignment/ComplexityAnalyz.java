package Hat_Assignment;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public class ComplexityAnalyz {

    ComplexityAnalyz(){

    }

    public static void main(String[] args){
        HatIml<String> hatA = new HatIml<>();
        HatIml<Integer> hatB = new HatIml<>();
        HatIml<Double> hatC = new HatIml<>();

        hatA.give("Hello");
        hatA.give("world");
        hatA.give("1");
        hatA.give("2");
        hatA.give("3");

        hatB.give(1);
        hatB.give(2);
        hatB.give(3);
        hatB.give(4);
        hatB.give(5);

        hatC.give(1.00);
        hatC.give(1.50);
        hatC.give(2.00);
        hatC.give(2.50);
        hatC.give(3.00);

        System.out.println(hatA);
        System.out.println(hatB);
        System.out.println(hatC);

        System.out.println();

        System.out.println("Hat-A Removing: " + hatA.take());
        System.out.println("Hat-B Removing: " + hatB.take());
        System.out.println("Hat-C Removing: " + hatC.take());

        System.out.println();

        System.out.println(hatA);
        System.out.println(hatB);
        System.out.println(hatC);
    }


}
