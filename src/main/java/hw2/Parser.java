package hw2;

import java.io.*;

public class Parser {

    private BufferedReader br;

    public String[] getList(String inputFilePath) {
        String[] strings = null;
        try {
            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            br = new BufferedReader(new InputStreamReader(inputFS));
            strings = br.lines()
                    .filter(s -> s.contains("www"))
                    .toArray(String[]::new);
        } catch (FileNotFoundException e){
            System.err.println("Where is your file?");
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
