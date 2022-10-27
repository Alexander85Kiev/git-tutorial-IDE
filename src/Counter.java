public class Counter {

    //Return the same number
    public long current(long a){
        return a;
    }

    //Return longer number plus 1
    public long next(long a){
        return ++a;
    }

    //Return previous number
    public long prev(long a){
        return --a;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("current =" + counter.current(5));
        System.out.println("next =" + counter.next(5));
        System.out.println("current =" + counter.prev(5));
    }


}
