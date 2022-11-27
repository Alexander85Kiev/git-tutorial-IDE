public class MarsEarthHelper {

    public int convertAppleCount(float count) {
        int contIn;
       return contIn = (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        int sum = garden1Count + garden2Count;
        return (byte) sum;
    }

    public float calculateTotalAppleWeight(double treeAge) {

        float weight = (float) (treeAge * 9.18);
        return weight;
    }

        public static void main(String[] args) {

            MarsEarthHelper helper = new MarsEarthHelper();

            //Should be 10
            System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        }
    }

