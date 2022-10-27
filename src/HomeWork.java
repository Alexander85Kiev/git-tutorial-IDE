class MathUtils {
    public int sum(int a, int b) {
        return (a + b);
    }

    public float twice(float a){
        MathUtils math = new MathUtils();
        return a/0.5f;
    }
    public int twicedSum(int a, int b){
        MathUtils math = new MathUtils();
        return math.sum(a,b)*2;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        //Should be 5
        System.out.println("math.sum(3, 2) = " + math.sum(3,2) );
        System.out.println("math.twice(4) = " + math.twice(4));
        System.out.println("math.twicedSum(2,3) = " + math.twicedSum(2,3));
    }
}

