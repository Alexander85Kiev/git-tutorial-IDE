import java.util.Arrays;

public class Module3Array {

    public static void main(String[] args) {
        int[] sourceArray = new int[4];
        sourceArray[0] = 1;
        sourceArray[1] = 34;
        sourceArray[2] = 83;
//        System.out.println("sourceArray = " + sourceArray);
//        System.out.println("Arrays.toString(sourceArray) = " + Arrays.toString(sourceArray));
//        System.out.println("sourceArray[1] = " + sourceArray[1]);
//  sourceArray[1] = 578;
//        System.out.println("sourceArray[1] = " + sourceArray[1]);
//
//        String[] names = {
//                "Anna", "Bobo", "John"
//        };
//        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
//        int arrayLenght = sourceArray.length;
//        int arrayStringLenght = names.length;
//
//        System.out.println(arrayLenght + " " + arrayStringLenght);

        int[] targetArray = new int[4];
       targetArray = Arrays.copyOf(sourceArray, sourceArray.length);


        sourceArray[0] = 223;
        System.out.println("sourceArray = " + Arrays.toString(sourceArray));
        System.out.println("targetArray = " + Arrays.toString(targetArray));

        int [][] multiArray = new int [3][2];

        multiArray[0][0] = 5;
        multiArray[0][1] = 5;
        multiArray[1][0] = 5;
        multiArray[1][1] = 5;
        multiArray[2][0] = 5;
        multiArray[2][1] = 5;

        String[][] multiArrayNames = {
                {"aaaa", "bbbb", "ccccc"},
                {"ddd", "fff", "hhh"}
        };
        System.out.println("multiArrayNames[1][1] = " + multiArrayNames[1][1]);
        System.out.println("multiArrayNames = " + multiArrayNames);;


    }
}
