package ar.edu.unahur.obj2.unittests.store.service.tools;

import java.io.IOException;

public class StaticService {


    public static int getMultiplicator() {
        return 10;
    }

    public static String readFile(String fileName) throws IOException {

        // Read file here
        return "file content";
    }
}
