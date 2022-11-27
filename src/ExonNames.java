import java.util.Locale;

public class ExonNames {
    //Test output
    public boolean areNamesEqual(String name1, String name2){
        return name2 == name1;
    }

    public String makeFullName(String firstName, String lastName){
        String fullName = (firstName.toLowerCase() + " " + lastName.toUpperCase());
        return fullName;
    }


    public boolean isNameLucky(String name){
        return name.contains("A") || name.contains("o");
    }

    public String getNameCode(String name){
        String code = (name.length()!=1)?(name.charAt(0) +""+ name.charAt(name.length()-1)):name;
        return code.toUpperCase();
    }

    public boolean isMoneyName (String name){
        boolean A = name.charAt(0) >= '0' && name.charAt(0) <= '9';
        boolean B = name.charAt(name.length()-1) >= '0' && name.charAt(name.length()-1)<= '9';
        return A && B;
    }
    public boolean isInvisibleName(String name){
        return !(name.isEmpty()) && name.isBlank();
    }

    public String makeNamePositive(String name){
        return name.replace("no","yes").replace("No","yes").replace("nO","yes");
    }

    public String makeNameClean(String name){
        return "CLEAN" + name.strip() + "CLEAN";
    }

    public String makeHalfOfName(String name){
        return name.substring(0,name.length()/2);
    }




    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);

        //Should be YesMont
        String positive = names.makeNamePositive("noMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);

        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurkkk\") = " + names.makeHalfOfName("Gurk"));
    }
    }

