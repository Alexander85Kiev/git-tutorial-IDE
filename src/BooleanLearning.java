public class BooleanLearning {




        public static boolean weatherIsFine(){
            return false;
        }

        public static boolean hasUmbrella(){
            return false;
        }

    public static void main(String[] args) {
        System.out.println(weatherIsFine() || hasUmbrella());
    }

    // || OR - логічне АБО
    // Ми пыдемо гуляти якщо:
    // а - буде гарна погода
    // АБО
    // б - в нас е парасолька

    // a = true,b = false      |    true
    // a = true, b = true      |    true
    // a = false, b = true     |    true
    // a = false, b = false    |    false

    // true - коли хоч один із операндів повертає true

     //&& - Логічне  I  I
    //  a - Ми отримаємо сертифікат GOIt якщо будемо ходити на всі лекції
    // I
    //  b -   виконаємо всі дзю

    // a = true,b = false      |    false
    // a = true, b = true      |    true
    // a = false, b = true     |    false
    // a = false, b = false    |    false

    // false - коли хоч один із операндів повертає false


    // ^ XOR - виключаєче АБО

    // a = true,b = false      |   true
    // a = true, b = true      |   false
    // a = false, b = true     |   true
    // a = false, b = false    |   false

    // ! - заперечення

    // !true => false
    // !false => true




}
