package homework_6.file_reader;

import java.io.FileNotFoundException;
import java.util.Map;

public interface FileService {
    Map<String, Long> getTopTenDomains() throws FileNotFoundException;
}
