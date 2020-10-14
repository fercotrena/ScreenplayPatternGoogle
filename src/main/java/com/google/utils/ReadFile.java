package com.google.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    public static ArrayList<String> getListOfWord() {

        ArrayList<String> result = new ArrayList<>();

        try (FileReader f = new FileReader("src/main/resources/words.txt")) {
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '\n') {
                    result.add(sb.toString().replace("\r", ""));
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                result.add(sb.toString().replace("\r", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
