import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import com.csvreader.CsvReader;

public class example {

    public static void main(String[] args) {
        String filename = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\information.csv";
        try {

            CsvReader organizationInfo = new CsvReader(filename,';');

           organizationInfo.readHeaders();

            while (organizationInfo.readRecord())
            {
                String productID = organizationInfo.get("ProductID");
                String productName = organizationInfo.get("ProductName");
                String supplierID = organizationInfo.get("SupplierID");
               // String categoryID = organizationInfo.get("CategoryID");
               // String quantityPerUnit = organizationInfo.get("QuantityPerUnit");
               // String unitPrice = organizationInfo.get("UnitPrice");
               // String unitsInStock = organizationInfo.get("UnitsInStock");
               // String unitsOnOrder = organizationInfo.get("UnitsOnOrder");
               // String reorderLevel = organizationInfo.get("ReorderLevel");
               // String discontinued = organizationInfo.get("Discontinued");

                // perform program logic here
                System.out.println(productID + ":" + productName);
            }

            organizationInfo.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}