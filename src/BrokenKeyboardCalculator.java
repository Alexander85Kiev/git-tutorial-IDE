public class BrokenKeyboardCalculator {

    //Return sum
    public int add(int a, int b){
        return a+=b;
    }

    //Return difference
    public int sub(int a, int b){
        return a-=b;
    }

    //Return multiply
    public int multiply(int a, int b){
        return a*=b;
    }

    //Return divide
    public int divide(int a, int b){
        return a/=b;
    }



    public static void main(String[] args) {
        BrokenKeyboardCalculator calc = new BrokenKeyboardCalculator();
        System.out.println(calc.add(5,3));
        System.out.println(calc.sub(8,7));
        System.out.println(calc.multiply(1,100));
        System.out.println(calc.divide(8,4));
    }
}
