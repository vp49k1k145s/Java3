package lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            reading();
            sew();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void reading() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int x;
        while((x = bis.read()) != -1) {
            out.write(x);
        }
        byte[] b = out.toByteArray();
        System.out.println(Arrays.toString(b));
        bis.close();
        out.close();
    }

    public static void sew() throws IOException {
        ArrayList<InputStream> ali = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ali.add(new FileInputStream(i + ".txt"));
        }
        BufferedInputStream bis = new BufferedInputStream(new SequenceInputStream(Collections.enumeration(ali)));
        int x;
        while((x = bis.read()) != -1) {
            System.out.print((char)x);
        }
        bis.close();
    }

}
