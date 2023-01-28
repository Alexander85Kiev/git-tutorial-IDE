package module5;

public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (0 > bigRocketCount || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (0 > smallRocketCount || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }


    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount = bigRocketCount - 1;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket(){
        if (smallRocketCount >0 ){
            smallRocketCount = smallRocketCount -1;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower(){
        return ((bigRocketCount * 100) + (smallRocketCount *50));
    }
}
