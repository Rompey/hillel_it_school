package homework_6.file_reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileServiceImpl implements FileService {
    @Override
    public Map<String, Long> getTopTenDomains() throws FileNotFoundException {
        File file = new File("src/main/resources/urls.txt");
        List<String> domains = new ArrayList<>();

        extractedFromFile(file, domains);

        return getDomains(domains);
    }

    private void extractedFromFile(File file, List<String> domains) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split("/");
                domains.add(split[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, Long> getDomains(List<String> domains) {
        return domains
                .stream()
                .collect(Collectors.groupingBy(String::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
