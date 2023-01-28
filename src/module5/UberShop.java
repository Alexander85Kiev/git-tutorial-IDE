package module5;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(i + " " + "jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 100) {
                System.out.println(prices[i] / 2f);
            } else {
                System.out.println(prices[i] * 1.5f);

            }
        }
    }

    public int[] getMinPriceCount(int[] prices){
        if(prices.length==0){
            return new int[0];
        }
        return prices;
    }
   public int[] findMinMaxPrices(int[] prices) {
       Arrays.sort(prices);
       if(prices.length == 0) return    new int[]{};
       else if(prices[0]==prices[prices.length-1]) return new int[]{prices[0]};
       else return new int[]{prices[0], prices[prices.length-1]};
   }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        //    float[] prices = new float[] {100f, 23.5f, 400f};
        //  shop.printPrices(prices);

        float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}

