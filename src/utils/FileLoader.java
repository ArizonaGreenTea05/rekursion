package utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class FileLoader {

// save file
    public static void save(String data, String filename){
        save(data, filename,"");
    }

    public static void save(String data, String filename, String path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("resources/" + path + filename));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.err.println("ERROR! failed to save file '" + filename + "'");
        }
    }

// load file
    public static String[] load(String filename) {
        return load(filename,"");
    }

    public static String[] load(String filename, String path){
        String input = null;
        
        File file = new File("resources/" + path + filename);

        if(!file.exists()){
            System.err.println("ERROR! file '" + filename + "' not found");
            return null;
        }
        
        try {
            input = new String(Files.readAllBytes(Path.of("resources/" + path + filename)));
        } catch (IOException e) {
            System.err.println("ERROR! failed to load file '" + filename + "'");
            return null;
        }
        return Objects.requireNonNull(input).split("\n",Integer.MAX_VALUE);
    }
}
