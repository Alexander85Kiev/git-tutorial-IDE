public class MarsCalculator {

    //Return sum of all numbers
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    //Return number a - (b+c)
    public int sub(int a, int b, int c){
        return a - (b + c);
    }

    //Return multiplication
    public int multiply(int a, int b, int c){
        MarsCalculator marsCalculator = new MarsCalculator();
        return marsCalculator.sum(a,b,c) * marsCalculator.sub(a,b,c);
    }

    //Return divide
    public float divide(int a, int b, int c){
        MarsCalculator marsCalculator = new MarsCalculator();
        return marsCalculator.sum(a,b,c)/10f;
    }

    public static void main(String[] args) {
        MarsCalculator marsCalculator = new MarsCalculator();
        System.out.println("Method sum =" + marsCalculator.sum(1,2,3));
        System.out.println("Method sub =" + marsCalculator.sub(1,2,3));
        System.out.println("Method multipy =" + marsCalculator.multiply(1,2,3));
        System.out.println("Method divide =" + marsCalculator.divide(1,2,3));

    }



}
