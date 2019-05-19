package AsciiMath.tex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> dic = new HashMap<>();
    private ArrayList<String> keywords = new ArrayList<>();

    Dictionary(String filePath) {
        parseCSV(filePath);
    }

    public String getConst(String ascii) {
        if ((ascii.equals("{:"))||(ascii.equals(":}"))) return ".";
        if (dic.containsKey(ascii)) return "\\" + dic.get(ascii);
        if (keywords.contains(ascii)) return "\\" + ascii;
        return ascii;
    }

    public String getLeft(String left) {
        return "\\left" + getConst(left);
    }

    public String getRight(String right) {
        return "\\right" + getConst(right);
    }

    private void parseCSV(String path) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                parseLine(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void parseLine(String line) {
        String key, value;
        int pos = line.indexOf(';');
        if (pos != -1) {
            key = line.substring(0, pos);
            value = line.substring(pos + 1);
            if (value.isBlank()) keywords.add(key);
            else dic.put(key, value);
        }
    }
}
