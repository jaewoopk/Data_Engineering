package kr.ac.sejong.kmook.Data_Engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class App2 {
    public static void findMax(ArrayList<Email> email) {
        TreeSet<Email> treeSet = new TreeSet<>(email);
        System.out.println(treeSet.toString());
    }
    public static ArrayList<Email> init() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("/Users/parkjaewoo/desktop/email-EuAll.txt"));
        ArrayList<Email> emailArrayList = new ArrayList<>();

        int lineCount = 0;
        String line = null;
        while ((line = br.readLine()) != null) {
            lineCount++;
            if (line.startsWith("#")) {
                continue;
            }
            int[] emailToFrom = Arrays.stream(line.split("\t")).mapToInt(Integer::parseInt).toArray();
            emailArrayList.add(new Email(emailToFrom[0], emailToFrom[1]));
        }
        System.out.println("lineCount => " + lineCount);
        br.close();
        return emailArrayList;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Email> emailArrayList = init();
        findMax(emailArrayList);
    }
}
