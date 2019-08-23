package hw_02;

import java.io.*;

public class DocumentReader implements AutoCloseable {
    private String path;
    private BufferedReader reader;
    private String content;

    public DocumentReader(String path) {
        this.path = path;
        initialize();
    }

    private void initialize() {
        File file = new File(path);
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public String getLine() throws IOException {
        return reader.readLine();
    }

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        String c = "";
        try {
            while ((c = reader.readLine()) != null) {
                sb.append(c).append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }
}
