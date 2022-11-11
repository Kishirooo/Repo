import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public void readFile(String fileName, ArrayList<Account> array) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new FileReader(fileName));
        String line;
        while((line=bufferedReader.readLine())!=null){
            String[]strings = line.split(" ");
            Account account =new Account();
            account.setUserName(strings[0]);
            account.setPassword(strings[1]);
            array.add(account);
        }
        bufferedReader.close();
    }
    public void readNpc(String fileName, ArrayList<SellerPart> arrayList)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split(" ");
            SellerPart sellerPart = new SellerPart();
            sellerPart.setShopName(strings[0]);
            sellerPart.setFoodName(strings[1]);
            sellerPart.setPrice(strings[2]);
            arrayList.add(sellerPart);

        }
        bufferedReader.close();
    }

}
