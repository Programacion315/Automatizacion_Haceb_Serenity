package com.haceb.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel {
    private XSSFWorkbook libro;
    private FileInputStream file;

    public String leerDatosExcel(String ruta, String hoja, int rowValue, int cellValue) throws IOException {
        String valor = null;
        file = new FileInputStream(new File(ruta));
        libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        libro.close();
        file.close();
        return valor;
    }

    public String leerDatoExcel(String ruta, String hoja, int rowValue, int cellValue) throws IOException {
        FileInputStream file = new FileInputStream(new File(ruta));
        Workbook libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);

        String valor = "";

        if (cell != null) {
            CellType cellType = cell.getCellTypeEnum(); // Usar getCellTypeEnum() en lugar de getCellType()

            if (cellType == CellType.STRING) {
                valor = cell.getStringCellValue();
            } else if (cellType == CellType.NUMERIC) {
                valor = String.valueOf((int) cell.getNumericCellValue());
            }
        }

        libro.close();
        file.close();

        return valor;
    }

    public void escribirDatoExcel(String ruta, String hoja, int rowValue, int cellValue, String dato) throws IOException {
        FileInputStream file = new FileInputStream(new File(ruta));
        Workbook libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        if (row == null) {
            row = sheet.createRow(rowValue);
        }
        Cell cell = row.createCell(cellValue);
        cell.setCellValue(dato);

        FileOutputStream fileOut = new FileOutputStream(ruta);
        libro.write(fileOut);
        fileOut.close();

        libro.close();
        file.close();
    }

    public void incrementarIterador(String ruta, String hoja, int rowValue, int cellValue) throws IOException {
        FileInputStream file = new FileInputStream(new File(ruta));
        Workbook libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);

        int iterador = (int) cell.getNumericCellValue(); // Obtiene el valor actual del iterador
        iterador++; // Incrementa en 1
        cell.setCellValue(iterador); // Actualiza la celda con el nuevo valor

        FileOutputStream fileOut = new FileOutputStream(ruta);
        libro.write(fileOut);
        fileOut.close();

        libro.close();
        file.close();
    }


}
