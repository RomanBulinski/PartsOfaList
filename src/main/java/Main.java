
public class Main {

    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][];
        int counter = 0;
        while (counter < arr.length - 1) {
            String[] temp = new String[2];
            temp[0] = "";
            temp[1] = "";
            for (int i = 0; i <= counter; i++) {
                temp[0] = (temp[0] + arr[i] + " ");
            }
            for (int j = counter + 1; j < arr.length; j++) {
                temp[1] = temp[1] + arr[j] + " ";
            }
            temp[0] = temp[0].substring(0, temp[0].length() - 1);
            temp[1] = temp[1].substring(0, temp[1].length() - 1);

            result[counter] = temp;
            counter++;
        }
        return result;
    }
}
