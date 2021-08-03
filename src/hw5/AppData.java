package hw5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;


    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }




    public AppData() {
    }

    public void save(String fileName ) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(header));

            for (Integer[] row : data) {
                writer.write(rowToString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {
        String result = "";

        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        result += "\n";
        return result;
    }
        public void load(String fileName) {
          try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
             header = bufferedReader.readLine().split(";");
              ArrayList<Integer[]> datalist = new ArrayList<>();
              String tempString;
              while ((tempString = bufferedReader.readLine()) != null) {
                  datalist.add(stringToDataRow(tempString));
              }
              data = datalist.toArray(new Integer[][]{{}});
    } catch (FileNotFoundException exception) {
        exception.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");

        Integer[] integers = new Integer[strings.length];
        for (int i = o; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }
}