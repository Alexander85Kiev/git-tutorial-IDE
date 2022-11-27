package module8L2.enums;

import static module8L2.enums.Currency.*;

public class EnumTest {

    public static void main(String[] args) {
       // Currency someCurrency = USD;
        Currency someCurrency = OTHER;
        if (someCurrency == USD){
            System.out.println("It was a dollar");
        } else {
            System.out.println("It wasn't a dollar");
        }

        System.out.println(OTHER.ordinal());

        Currency[] currency = Currency.values();
        for (Currency currency1 : currency) {
            System.out.println(currency1);

        }

        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance);
        instance.setValue(3);
        System.out.println(instance);
    }
}
