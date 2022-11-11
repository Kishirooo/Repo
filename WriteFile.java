import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public void writeFile (String fileName , ArrayList <Account> array) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter( fileName ) ) ;
        for (int i = 0 ; i < array.size() ; i++) {
            Account account = array.get( i ) ;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(account.getUserName()+" "+account.getPassword() );
            bufferedWriter.write(stringBuilder.toString() );
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
    public void writeNpc(String fileName , ArrayList <SellerPart> arrayList )throws IOException{
        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(fileName));
        for(int i=0;i<arrayList.size();i++){
            SellerPart sellerPart= arrayList.get(i);
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(sellerPart.getShopName() + " " + sellerPart.getFoodName() +" "+sellerPart.getPrice());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }


}
