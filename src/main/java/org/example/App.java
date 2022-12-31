package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws FileNotFoundException {
        List<Product> products = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Product.class)
                .build()
                .parse();

        products.forEach(product -> System.out.println(product.render()));
    }
}
