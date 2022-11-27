public class MoonVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return minAcid <= acidValue && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (1000 <= density && 5000 >= density) || (10000 <= density && 50000 >= density);
    }

    public boolean isTemperatureOk(boolean cold) {
        return cold != true;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {

        return isDensityOk(density) && isAcidOk(acidValue,maxAcid, minAcid) && isTemperatureOk(cold) ;
    }
}

