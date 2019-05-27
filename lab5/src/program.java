import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\java development\\lab5\\src\\text.txt";
        String save = "C:\\Workspace\\java development\\lab5\\src\\result.txt";

        int minSymbols = 3;
        int maxSymbols = 5;
        List<String> textList = readFile(path);

        System.out.println("Текст:\n");
        textList.forEach(System.out::println);

        System.out.println("\n#################################################################################\n");

        textList = deleteBadWordsToCollection(textList, minSymbols, maxSymbols);

        //выводим конечный текст
        System.out.println("Текст в результате:\n");
        textList.forEach(System.out::println);

        //сохраняем данные в файл
        saveToFile(save, textList);
    }

public static void saveToFile(String path, List<String> list) {
    try {
        Files.write(Paths.get(path), list);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static List<String> readFile(String path) {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static int getCountBadWords(String line, int minSymbols, int maxSymbols) {
        int result = 0;
        if (line != null) {
            line = line.trim();
            if (line.length() != 0) {
                for (String word : line.split("\\s+")) {
                    int length = word.length();
                    if (length >= minSymbols && length <= maxSymbols) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static List<String> deleteBadWordsToCollection(List<String> list, int minSymbols, int maxSymbols) {
        List<String> resultList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (String line : list) {
                line = line.trim();
                int countWords = getCountBadWords(line, minSymbols, maxSymbols);
                line = deleteBadWords(line, countWords, minSymbols, maxSymbols);
                resultList.add(line);
            }
        }
        return resultList;
    }

    public static String deleteBadWords(String line, int countBadWords, int minSymbols, int maxSymbols) {
        StringBuilder sb = new StringBuilder();
        if (line.length() != 0) {
            if (countBadWords > 0) {
                for (String word : line.split(" ")) {
                    if (word.length() != 0) {
                        if (countBadWords != 0 && word.length() >= minSymbols && word.length() <= maxSymbols) {
                            countBadWords--;
                        } else {
                            sb.append(word).append(" ");
                        }
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
        return sb.length() == 0 ? line : sb.toString();
    }
}
