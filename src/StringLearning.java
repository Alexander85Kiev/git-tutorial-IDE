public class StringLearning {


    public static void main(String[] args) {
        System.out.println("AAA".equals("AAAAA"));
        String input = "AaAAaAAA";
        System.out.println(input.length());
        System.out.println(input.toLowerCase());
        System.out.println("Hello " + "how are you");
        System.out.println(String.join(" ", "aaa","cccc","bbbbbbb"));
        System.out.println("aaaaa".concat("BBBBB"));
        System.out.println("Java".contains("a"));
        System.out.println("I learn Java".charAt(5));
        System.out.println("I learn Java".startsWith("I "));
        System.out.println("I learn Java".endsWith("va"));


        System.out.println("I am C++ dev".replace("C++","Java"));
        System.out.println("   Java  !  ".trim());
        System.out.println("I am C++ dev".substring(5));
        System.out.println("I am C++ dev".substring(5,9));

    }


}
