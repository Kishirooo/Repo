import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public void order(String fileName)throws IOException {
        boolean flag=true;
        WriteFile writeFile=new WriteFile();
        ReadFile readFile=new ReadFile();
        ArrayList<SellerPart>arrayList=new ArrayList<>();
        readFile.readNpc(fileName,arrayList);
        Scanner scanner=new Scanner(System.in);
        int count=0;
        for(;flag;){
            System.out.println("请选择店名：");
            String shopName=scanner.nextLine();
            System.out.println("请选择您要点的菜：");
            String foodName=scanner.nextLine();
            for(int i=0;i<arrayList.size();i++){
                if(shopName.equals(arrayList.get(i).getShopName())){
                    if(foodName.equals(arrayList.get(i).getFoodName())){
                        count+=Integer.parseInt(arrayList.get(i).getPrice());
                    }
                }
            }
            System.out.println("是否继续点餐？是的按1，不是的按其他进行结账！");
            int choice=scanner.nextInt();
            if(choice==1){
                continue;
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println("共计"+count+"元，按1确认下单，按其他退出！");
        int com=scanner.nextInt();
        if(com==1){
            Account account=new Account();
            account.setMoney(account.getMoney()-count);
        }
        else {
            return;
        }
    }


}
