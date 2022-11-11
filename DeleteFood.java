import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFood {
    public void deleteFood(String fileName)throws IOException {
        ReadFile readFile=new ReadFile();
        ArrayList<SellerPart>arrayList=new ArrayList<>();
        readFile.readNpc(fileName,arrayList);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的店名：");
        String shopName=scanner.nextLine();
        System.out.println("请输入要删减的食物名：");
        String foodName=scanner.nextLine();
        for(int i=0;i<arrayList.size();i++){
            if(shopName.equals(arrayList.get(i).getShopName())){
                if(foodName.equals(arrayList.get(i).getFoodName())){
                    WriteFile writeFile=new WriteFile();
                    arrayList.remove(i);
                    writeFile.writeNpc(fileName,arrayList);
                    return;
                }
                else{
                    System.out.println("食物目录中无该食物！请重新操作！");
                    return;
                }
            }
        }
        System.out.println("未搜索到"+shopName+"，请重新操作！");
        return;
    }

}
