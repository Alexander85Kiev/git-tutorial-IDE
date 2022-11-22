public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Bobo";
        StringBuilder nameBuilder= new StringBuilder(name);

        System.out.println("nameBuilder.append(\"!\") = " + nameBuilder.append("!"));
    }
}
