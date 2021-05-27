package chpt12;

public class TestReadFile {
    public static void main(String[] args) {
        ReadFile r = new ReadFile();

        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
