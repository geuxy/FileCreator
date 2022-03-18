import me.geuxy.FileCreator;
import me.geuxy.util.Logger;

import java.io.File;

public class Start {
    private static String in;
    private static String in1;
    private static File file;
    private static File file1;

    public static void main(String[] args) {
        Logger.out("Welcome to FileCreator!");
        new FileCreator(in, in1, file, file1).init();
    }
}
