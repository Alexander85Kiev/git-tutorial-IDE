public class StringFormatTest {

    public static void main(String[] args) {
        String name = "Bobert";
        int age = 25;
        String friendName = "Bobo";
        int weight = 100;
        System.out.println("Father name is " +  name + " he is " + age + ", his son is " + friendName + ".His weight is "+ weight);

        System.out.println(String.format("Father is % he is %d, his son is %d,",name,age,friendName)
        );
    }
}
