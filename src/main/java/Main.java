import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static String[][] partlist ( String[] arr ) {
        String[][] result = new String [arr.length-1][];
        int counter = 0;
        while( counter < arr.length-1 ){
            String[] temp = new String[2];
            temp[0]= "";
            temp[1]= "";
            for ( int i =0; i <= counter; i++ ){
                temp[0] = temp[0] + arr[i] + " ";
            }
            for ( int j =counter+1; j < arr.length; j++ ){
                temp[1] = temp[1] + arr[j] + " ";
            }
            result[counter] = temp;
            counter++;
        }
        return result;
    }


    public static void main(String[] args) {

        String[] a = {"az", "toto", "picaro", "zone", "kiwi"};


        Arrays.asList( partlist(a) ).stream()
                .forEach( n-> System.out.println(n[0] + " +  " + n[1] )  );





    }



}
