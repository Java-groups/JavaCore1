package HW15.HW;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class HW2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Start of the second homework task");
        File file = new File("file3");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).replaceAll("public", "private"));
        }
        Path path = Paths.get("file4");
        Files.write(path, arrayList, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

    }
}
