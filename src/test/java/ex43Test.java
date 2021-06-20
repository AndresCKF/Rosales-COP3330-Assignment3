/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 Andres Rosales
 *
 */

import ex43.fileHandler;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex43Test {

    @Test
    void makedir_work(){
        Path path = Paths.get("./website/test/directoryexists");
        fileHandler.makeDir("test", "/directoryexists");
        assert(Files.exists(path));
    }

}
