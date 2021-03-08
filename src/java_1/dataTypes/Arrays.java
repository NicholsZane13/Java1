package java_1.dataTypes;

import java.util.*;

public class Arrays {

    String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};
    int[] bits = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

    public static void main(String[] args) {
        Arrays array = new Arrays();
        printNums();
        greet("Marcelo");
        bitsToBinaries(new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0});
    }

    static int[] printNums() {
//        print all the numbers in the nums array to the console.  The nums array is defined on this class.
        int[] numbers = {10,23,3,4,5,2,1};
        System.out.println(java.util.Arrays.toString(numbers));
        return numbers;
    };

    static String greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array, Greet the person with every greeting in the greetings array declared in this class.
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
        String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
        Random random = new Random();
        int select = random.nextInt(greetings.length);
        String welcome = greetings[select] + " " + name;
        System.out.println(welcome);
        return welcome;
    };

    static boolean[] bitsToBinaries() {
//        convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]

    };

    String[] keepColors() {
//        In this class is an array called "colors".  Remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        return null;
    }

}







