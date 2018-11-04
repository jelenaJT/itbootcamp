package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    public class ExcelUtils {

        	private static XSSFSheet ExcelWSheet;

        	private static XSSFWorkbook ExcelWBook;

        	private static XSSFCell Cell;

        	private static XSSFRow Row;
        	private static DataFormatter formatter ; //creating formatter using the default locale
        		 
        		 
    		//Setting the File path and opening the Excel file, Pass, Excel Path and Sheetname as Arguments to this method

    		public static void setExcelFile(String Path,String SheetName) throws Exception {

       			try {

           			// Open the Excel file

					FileInputStream ExcelFile = new FileInputStream(Path);

					// Access the required test data sheet

					ExcelWBook = new XSSFWorkbook(ExcelFile);

					ExcelWSheet = ExcelWBook.getSheet(SheetName);
					formatter = new DataFormatter();
					} catch (Exception e){

						throw (e);

					}

			}

    		//Reading the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    	    public static String getCellData(int RowNum, int ColNum) throws Exception{

       			try{
          			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
          			String CellData = formatter.formatCellValue(Cell);
          			//String CellData = Cell.getStringCellValue();
          			return CellData;

          			}catch (Exception e){

						return"";

          			}

		    }

    		//Writing in the Excel cell, Row num and Col num are the parameters

    		public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

       			try{

          			Row  = ExcelWSheet.getRow(RowNum);
					Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

					if (Cell == null) {

						Cell = Row.createCell(ColNum);
						Cell.setCellValue(Result);

						} else {

							Cell.setCellValue(Result);

						}

          // Constant variables Test Data path and Test Data file name

          				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

          				ExcelWBook.write(fileOut);

          				fileOut.flush();

 						fileOut.close();

						}catch(Exception e){

							throw (e);

					}

				}

	}