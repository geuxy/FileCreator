package me.geuxy;

import me.geuxy.util.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    private String inMessage;
    private String inMessage1;
    private File directory;
    private File file;

    public FileCreator() {}

    public FileCreator(String in, String in1, File directory, File file) {
        this.inMessage = in;
        this.inMessage1 = in1;
        this.directory = directory;
        this.file = file;
    }

    public void init() {
        Scanner consoleIn = new Scanner(System.in);
        Logger.out("file name (including extension):");
        inMessage1 = consoleIn.nextLine();

        Logger.out("directory:");
        inMessage = consoleIn.nextLine();

        Logger.out("------------------------------------------------");

        directory = new File(inMessage);
        if(directory.exists()) {
            Logger.out("found " + directory);
        } else {
            Logger.err(directory + " cannot be found.");
        }

        file = new File(inMessage, inMessage1);
        if(file.exists()) {
            Logger.err("The file '" + inMessage1 + "' already exists.");
        } else {
            if(directory.exists()) {
                Logger.out("Created new file " + inMessage1 + "!");
                try {
                    file.createNewFile();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
