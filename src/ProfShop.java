public class ProfShop {

    public boolean isPriceOk(int price){
        return price!=1000;
    }

    public float calculateRegularDiscountPrice(float price){
        return (float) (price*0.9);
    }
    public boolean isDiscount50(int price){
        return (price * 4)==1000;
    }

    public boolean isPriceHappy(int price, int year, int day){
        return price == (year * day);
    }



    public static void main(String[] args) {
        ProfShop profShop = new ProfShop();
        System.out.println(profShop.isPriceOk(1000));
        System.out.println(profShop.calculateRegularDiscountPrice(100));
        System.out.println(profShop.isDiscount50(251));
        System.out.println(profShop.isPriceHappy(2000, 2000,2));
    }
}




