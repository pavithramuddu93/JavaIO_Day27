package blz;


import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class NIOFileAPITest {

    /**
     * private variables can only be accessed within the same class (an outside
     * class has no access to it) private = restricted access However, it is
     * possible to access them if we provide public get and set methods.
     */
    private static String HOME = "C:\\Users\\shard\\Desktop\\shardul";
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test

    /**
     * created method here when we given a path it will check it is exist or not and
     * confirm it incase if it is not exist then throws IOException
     *
     * @throws IOException -throws exception
     */
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        /**
         * check file exists or not
         */
        Path homePath = Paths.get(HOME);
        assertTrue(Files.exists(homePath));
        System.out.println(homePath);

        /**
         * Delete file and check file does not exist
         */
        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
        if (Files.exists(playPath))
            FileUtils.deleteFiles(playPath.toFile());
        assertTrue(Files.notExists(playPath));

        /**
         * Create a directory
         */
        Files.createDirectory(playPath);
        assertTrue(Files.exists(playPath));

        /**
         * Create Empty File
         */
        IntStream.range(1, 10).forEach(cntr -> {
            Path tempFile = Paths.get(playPath + "/temp" + cntr);
            assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
            }
            assertTrue(Files.exists(tempFile));
        });

        /**
         * List files, directories as well as files with extensions
         */
        System.out.println("Files.list");
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        System.out.println("Files.newDirectory");
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        System.out.println("Files.newDirectory with temp");
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().contains("temp"))
                .forEach(System.out::println);
    }
}