package module3Arrays;

import hardCases1.Sounds;

import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[10];
        return result;
    }
    public void fixNames(String[] names, String[] toReplace){
        names [0] = toReplace [0];
        names [2] = toReplace [1];
    }
    public String firstAndLastTogether(String[] names){
        return names [0] + " "+"AND"+" "+ names [names.length-1]+" " + "TOGETHER" ;
    }

    public void changeElectResult(String[] results){
           boolean arrayMoreThenOne = results.length >1;
           if (arrayMoreThenOne) {
               String a = results[0];
               String b = results[results.length - 1];
               results[0] = b;
               results[results.length - 1] = a;
                  Arrays.toString(results);
           }else
            {
Arrays.toString(results);
        }
    }



    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int [] data = {age1,age2,age3,age4};
        return data;
    }

    public String[] makeCopy(String[] names){
        String [] copy = Arrays.copyOf(names,names.length);
        System.out.println("Copied!");
        return copy;
    }
    public void printKeyboard(){
        char arraKey[][] = createKeyboard();
        System.out.println(Arrays.toString(arraKey[0]));
        System.out.println(Arrays.toString(arraKey[1]));
        System.out.println(Arrays.toString(arraKey[2]));
        System.out.println(Arrays.toString(arraKey[3]));
    }
    public char[][] createKeyboard(){
        return new char[][]{
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };
    }
    public String[] changeElectResultAgain(String[] results){
        String [] copyArray = Arrays.copyOfRange(results,results.length-3, results.length);
        return copyArray;
    }

    public static void main(String[] args) {
    //    String[] arr = new HarekCity().createEmptyNameArray();
      //  System.out.println(Arrays.toString(arr));

        //int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        //System.out.println(Arrays.toString(ageArray));

       // String[] names = new String[] {"mixa", "ukio", "barek", "krou", "fiha"};
       // String[] toReplace = new String[] {"lopr", "boki"};
        //new HarekCity().fixNames(names, toReplace);
        //System.out.println(Arrays.toString(names));

     //   String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
       // System.out.println(new HarekCity().firstAndLastTogether(names));
       // String[] results = new String[]{"miho"};
        //new HarekCity().changeElectResult(results);
        //System.out.println(Arrays.toString(results));
      //  String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
      //  String[] changedResults = new HarekCity().changeElectResultAgain(results);
      //  System.out.println(Arrays.toString(changedResults));
      //
      //  char[][] keyboard = new HarekCity().createKeyboard();
      //  for (int i = 0; i < keyboard.length; i++) {
      //      System.out.println(Arrays.toString(keyboard[i]));
      //  }

       // new HarekCity().printKeyboard();

        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
    }


