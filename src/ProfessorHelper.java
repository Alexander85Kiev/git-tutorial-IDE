public class ProfessorHelper {

    public boolean areNumbersFatal(int first, int second){
        return (first*5 + 3)==second;
    }
        public boolean areNumbersCool(int number1, int number2){
            return number1==number2;
        }

        //Test output
        public static void main(String[] args) {
            ProfessorHelper helper = new ProfessorHelper();
            System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
            System.out.println(helper.areNumbersFatal(1,9));
        }
    }
