package edu.com.project.products;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main_Product {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> goods = new ArrayList<>();
        goods.add(new Product(1, "Стул Ізо чорний А-01", 26, 3249.5, "AMF", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(2, "Стілець Аскона чорний шкірзам чорний", 42, 4249.3, "AMF", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(3, "Стілець Самба хром горіх Скаден чорний без канта", 7, 5249.2, "AMF", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(4, "Крісло Атлантіс Хром Механізм ANYFIX Неаполь N-20", 19, 7249.1, "AMF", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(5, "Крісло Ultra Хром сидіння А-1/спинка Сітка чорна, вставка Скаден чорний", 31, 8249.8, "AMF", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(6, "Крісло Комфорт Нью/АМФ-1 А-1", 27, 9249.7, "AMF", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(7, "Стіл комп'ютерний Like 1387х680 Білий Перл База біла", 45, 2249.6, "AMF", "Комп'ютерні столи", 530, 560, 860));
        goods.add(new Product(8, "Стіл комп'ютерний Pluto ST L (1380х600х750) Дуб Ендгрейн/Чорний графiт", 52, 3249.5, "AMF", "Комп'ютерні столи", 530, 560, 860));
        goods.add(new Product(9, "Стіл комп'ютерний МГ-220 (1800х900х780мм) горіх темний", 58, 4249.4, "AMF", "Комп'ютерні столи", 530, 560, 860));
        goods.add(new Product(10, "Стілець GLEN апельсин", 9, 5249.3, "Concepto", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(11, "Стілець LAGUNA сірий графіт", 11, 4249.2, "Concepto", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(12, "Крісло поворотне GALAXY вугільний сірий", 21, 5249.1, "Concepto", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(13, "Крісло поворотне WANG срібна лисиця", 38, 6249.0, "Concepto", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(14, "Стіл комп'ютерний PALERMO BLACK MARBLE", 25, 7249.3, "Concepto", "Комп'ютерні столи", 530, 560, 860));
        goods.add(new Product(15, "Стілець Vetro N-67 бежевий", 33, 6249.4, "Vetro", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(16, "Крісло поворотне Vetro R-65 м'ятна", 26, 7249.5, "Vetro", "Крісла офісні", 530, 560, 860));
        goods.add(new Product(17, "Стілець Vetro S-110 графіт", 21, 7249.6, "Vetro", "Офісніе стільці", 530, 560, 860));
        goods.add(new Product(18, "Стіл обідній Vetro ТМ-76 чорний онікс", 26, 8249.7, "Vetro", "Комп'ютерні столи", 530, 560, 860));

        Product product = new Product();

        // manufacturer names
        System.out.println("\nManufacturer names:" + "\n" + product.manufacturerName(goods)); // manufacturer names

        //goods in stock
        System.out.println("\nGoods in stock:");
        Set<Map.Entry<String, Integer>> set = product.nameQuantity(goods).entrySet();
        for (Map.Entry<String, Integer> me : set) {
            System.out.printf("%-75s%s", me.getKey(), ": ");
            System.out.println(me.getValue());
        }

        // change price by %
        System.out.print("\nChange price by 1.2:");
        product.changePrice(goods, 1.2);
        System.out.println(goods);


        //statisticPrice(ArrayList<Product> goods, String function)
        System.out.print("\nStatistic price:");
        System.out.printf("%-16s%.2f", "\nMax price: ", product.statisticPrice(goods, "Max"));
        System.out.printf("%-16s%.2f", "\nMix price: ", product.statisticPrice(goods, "Min"));
        System.out.printf("%-16s%.2f", "\nAverage price: ", product.statisticPrice(goods, "Average"));

        // sort for Comparator
        System.out.print("\n\nSort by name:");
        product.sortList(goods, "name");

        System.out.print("\n\nSort by quantityOfGoods:");
        product.sortList(goods, "quantityOfGoods");

        // sort for Stream
        System.out.print("\n\nSort by price:");
        goods.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(System.out::print);

        String fileName = "src/edu/project/products/myProduct.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Write data to file: " + fileName);
            bw.write(String.valueOf(goods));

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


