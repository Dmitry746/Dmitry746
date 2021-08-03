package hw3;

import java.util.Arrays;

public class main {













    public static void main(String[] args) {

    }

    public static void changeArrElements(Object[] array, int a, int b) {
    Object tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
    }
}
