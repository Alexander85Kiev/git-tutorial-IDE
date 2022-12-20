package module3Arrays;

public class NumberTranslator {

    public int translate(String romanNumber) {
        int digit;
        switch (romanNumber.toUpperCase().trim()) {
            case "I":
                digit = 1;

            case "II":
                digit = 2;
                break;
            case "III":
                digit = 3;
                break;
            case "IV":
                digit = 4;
                break;
            case "V":
                digit = 5;
                break;
            case "VI":
                digit = 6;
                break;
            case "VII":
                digit = 7;
                break;
            case "VIII":
                digit = 8;
                break;
            case "VIV":
                digit = 9;
                break;
            case "X":
                digit = 10;
                break;
            case "XI":
                digit = 11;
                break;
            case "XII":
                digit = 12;
                break;
            default:
                digit = -1;
                break;
        }
        return digit;
    }
}
