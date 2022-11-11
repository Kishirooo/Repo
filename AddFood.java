import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddFood {
    public void addFood(String fileName) throws IOException {
        ArrayList<SellerPart>arrayList=new ArrayList<>();
        ReadFile readFile =new ReadFile();
        readFile.readNpc(fileName,arrayList);
        Scanner scanner =new Scanner(System.in);
        String shopName,foodName,price;
        System.out.println("请输入店名：");
        shopName=scanner.nextLine();
        System.out.println("请输入食物名：");
        foodName=scanner.nextLine();
        for(int i=0;i<arrayList.size();i++){
            if(shopName.equals(arrayList.get(i).getShopName())){
                if(foodName.equals(arrayList.get(i).getFoodName())){
                    System.out.println("该食物已添加！");
                    return;
                }
            }
        }
        System.out.println("请输入食物价格：");
        price=scanner.nextLine();
        SellerPart sellerPart=new SellerPart();
        sellerPart.setShopName(shopName);
        sellerPart.setFoodName(foodName);
        sellerPart.setPrice(price);
        WriteFile writeFile=new WriteFile();
        arrayList.add(sellerPart);
        writeFile.writeNpc(fileName,arrayList);
        System.out.println("添加成功！");
    }

}
