package com.androsiuk.lab_patterns.csv_config;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.androsiuk.lab_patterns.DTO.CsvDTO;
import com.androsiuk.lab_patterns.enums.Availability;
import com.androsiuk.lab_patterns.enums.Category;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CsvConfig {

    private static final String CSV_FILE_PATH = "./src/main/resources/products.csv";
    private static final CSVFormat CSV_FORMAT = CSVFormat.DEFAULT
            .builder()
            .setHeader("name", "price", "isAvailable", "category", "seller_id")
            .setSkipHeaderRecord(true)
            .build();

    public static void writeProductsToCsv(List<CsvDTO> productDTOs) {
        File file = new File(CSV_FILE_PATH);
        try ( Writer writer = new FileWriter(file);
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSV_FORMAT)) {
            csvPrinter.printRecord("insuranceId", "userId", "createdAt");
            for (CsvDTO csvDTO : productDTOs) {
                csvPrinter.printRecord(csvDTO.getName(), csvDTO.getPrice(), csvDTO.getIsAvailable(),
                        csvDTO.getCategory(), csvDTO.getSeller_id());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<CsvDTO> readProductsFromCsv() {
        List<CsvDTO> products = new ArrayList<>();
        try (Reader reader = new FileReader(CSV_FILE_PATH);
             CSVParser csvParser = new CSVParser(reader, CSV_FORMAT)) {
            for (CSVRecord csvRecord : csvParser.getRecords()) {
                CsvDTO order = new CsvDTO(
                        String.valueOf(csvRecord.get("name")),
                        Double.valueOf(csvRecord.get("price")),
                        Availability.valueOf(csvRecord.get("isAvailable")),
                        Category.valueOf(csvRecord.get("category")),
                        Integer.valueOf(csvRecord.get("seller_id"))
                );
                products.add(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
