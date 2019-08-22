package HomeWork2;

import java.io.*;

public class ParseFromFile {
    private static BufferedReader br;

    public static String[] getList(String inputFilePath) {
        String[] strings = null;
        try {
            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            br = new BufferedReader(new InputStreamReader(inputFS));
            strings = br.lines()
                    .filter(s -> s.contains("www") || s.contains("https"))
                    .toArray(String[]::new);
        } catch (FileNotFoundException e){
            System.err.println("File not found");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return strings;
    }
}
