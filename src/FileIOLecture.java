import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    //FIlE - a discrete container for data on a storage device.
    //Path - location of a file in the filesystem.
    //Relative Path - relative to the current working directory.
    //<script src="  .../js/weather/weather.js"></script>
    //Absolute Path - specified from the filesystem root
    public static void main(String[] args) {
        //Path Interface - define an object that represents a path.
        //   Paths class - contains static methods to obtain a filepath.
        // .get(String filename)  method
        // .get(String directory, string filename)
        // .get(String parentDirectory, String childDirectory, String filename)    3 overloaded methods
        //All return a Path object that corresponds to the passed string(s).

        String directory = "data";//variable to plug into get() method
        String filename = "gods.txt";

        Path dataDirectory  = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataDirectory);
        System.out.println(dataFile);

        try{
            // File class - contains static methods to read, write, create, and delete files.
            // .exists(Path filepath) - checks whether or not the file exists.
            // .notExistst(Path filepath)
            if(Files.notExists(dataDirectory)){
                Files.createDirectory(dataDirectory);
            }
            if(!Files.exists(dataFile)){
                //.createFile(Path filepath)
                Files.createFile(dataFile);
            }
            if(Files.exists(dataFile)){//creating a list
                // .write(Path filepath, List<String> list, StandardOpenOption.Append  *optional*)
                Files.write(dataFile, Arrays.asList("Zeus", "Aphrodite", "Hercules", "Athena", "Poseidon"));
                Files.write(dataFile, Arrays.asList("Apollo", "Hades"), StandardOpenOption.APPEND);

            }
        } catch(IOException iox){
            iox.printStackTrace();

        }
        try {
            //Reading Files
            //Create a list of strings that represents the file data.
            //instantiate it
            List<String> gods = Files.readAllLines(dataFile);
            for(String god : gods){
                System.out.println(god);
            }
            System.out.println(gods);

            List<String> bucket = new ArrayList<>();

            for(String god : gods){
                if(god.equals("Hercules")){
                    bucket.add("Hera");
                    continue;
                }
                bucket.add(god);
            }
            Files.write(dataFile, bucket);

            }catch(IOException iox){
                iox.printStackTrace();
        }
    }
}
