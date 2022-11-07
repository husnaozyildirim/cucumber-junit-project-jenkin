package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class ExcelRead {

    @Test
    public void read_excel_file() throws IOException {
        String path = "employee.xlsx";
        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employee");

        System.out.println(sheet.getRow(1).getCell(0));

        System.out.println(sheet.getRow(4).getCell(2));

        int usedRow = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRow);

        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        for (int rowNum=0; rowNum < usedRow ; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Husna")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        //get job title

        for(int i=0; i<usedRow; i++){
            if(sheet.getRow(i).getCell(0).toString().equals("Husna")){
                System.out.println("Husna job title: "+sheet.getRow(i).getCell(2) );
            }
        }

    }

    String filePath = "employee.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void addSalaryToEmployee() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
       workbook = new XSSFWorkbook(fileInputStream);
       sheet = workbook.getSheet("Employee");
        XSSFCell salaryCell = sheet.getRow(0).createCell(3);

        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(150_000);

        sheet.getRow(2).createCell(3).setCellValue(120_000);
        sheet.getRow(3).createCell(3).setCellValue(200_000);
        sheet.getRow(4).createCell(3).setCellValue(300_000);
        sheet.getRow(5).createCell(3).setCellValue(250_000);

        for(int i=0; i<sheet.getLastRowNum(); i++){
            if(sheet.getRow(i).getCell(0).toString().equals("Mary")){
                sheet.getRow(i).getCell(0).setCellValue("Linda");
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();

    }
}
