package hw5;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        AppData appData= new AppData();
        appData.load("hw5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getHeader()));

        appData.save("hw5-1");
    }
}
