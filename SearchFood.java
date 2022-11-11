import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {
    public void searchFood(String fileName)throws IOException {
        ArrayList<SellerPart>arrayList=new ArrayList<>();
        WriteFile writeFile=new WriteFile();
        ReadFile readFile=new ReadFile();
        readFile.readNpc(fileName,arrayList);
        boolean flag=true;
        for(;flag;){
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入要查询的食物：");
            String foodName=scanner.nextLine();
            for(int i=0;i<arrayList.size();i++){
                if(foodName.equals(arrayList.get(i).getFoodName())){
                    System.out.println("店名："+arrayList.get(i).getShopName()+" "
                            +"食物名："+arrayList.get(i).getFoodName()+" "+"价格是："+arrayList.get(i).getPrice());
                }

            }
            System.out.println("按1继续查询，否则退出查询！");
            int judge=scanner.nextInt();
            if(judge==1){
                continue;
            }
            else{
                return;
            }
        }


    }

}
