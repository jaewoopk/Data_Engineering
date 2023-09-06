package kr.ac.sejong.kmook.Data_Engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/parkjaewoo/desktop/email-EuAll.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.startsWith("#")) {
                continue;
            }
            int[] emailToFrom = Arrays.stream(line.split("\t")).mapToInt(Integer::parseInt).toArray();
            System.out.println(new Email(emailToFrom[0], emailToFrom[1]));
        }
    }
}
