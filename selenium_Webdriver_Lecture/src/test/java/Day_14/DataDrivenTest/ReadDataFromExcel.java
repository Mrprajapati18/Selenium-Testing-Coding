package Day_14.DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        
        // Excel File----> Workbook------>Sheets------>Rows-----Cells
        
        // Read Data from excel file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\TestingData.xlsx"); // Find the excel sheet data in dynamically then write System.getProperty("user.dir")
        
        // Get the workbook of the excel file(Open the file in excelSheet)
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        
        // Extract the specific sheet in workbook
        XSSFSheet sheet = workbook.getSheet("Sheet"); // Ensure the sheet name matches exactly

        // Check if the sheet exists
        if (sheet == null) {
            System.out.println("Sheet not found in the Excel file.");
            workbook.close();
            file.close();
            return;
        }
        
        // Find the number of rows in the particular file
        int totalRows = sheet.getLastRowNum(); // this will return the last number of sheet in rows
        
        // Extract the particular cells
        int totalCells = sheet.getRow(0).getLastCellNum(); // Use getRow(0) to get the first row
        
        System.out.println("Number of rows: " + totalRows);
        System.out.println("Number of cells: " + totalCells);
        
        workbook.close();
        file.close();
    }
}
