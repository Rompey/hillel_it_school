package homework_6.file_reader;

import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileService fileService = new FileServiceImpl();
        for (Map.Entry<String, Long> map : fileService.getTopTenDomains().entrySet()) {
            System.out.println("Domain: " + map.getKey() + ". Count: " + map.getValue());
        }
    }
}
