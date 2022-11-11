import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        String userDataFile = "C:\\Users\\86137\\Downloads\\g\\src\\userDataFile";
        String foodMenu ="C:\\Users\\86137\\Downloads\\g\\src\\foodMenu";
        System.out.println("庸叔的印度npc国际外卖平台");
        System.out.println("按1登陆，按2注册，按其他退出！");
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        for(;;){
            switch(num){
                case 1:{
                    Login login=new Login();
                    if(login.login(userDataFile)){
                        System.out.println("登陆成功！");
                        System.out.println("买家按1，卖家按2！");
                    }
                    else {
                        System.out.println("登陆失败！");
                        System.exit(0);
                    }
                    int number =scanner.nextInt();
                    boolean flag=true;
                    if(number==2){
                        for(;flag;){
                            System.out.println("对食物操作：按1添加，按2删减，按3查询，按4退出！");
                            int choice=scanner.nextInt();
                            switch(choice){
                                case 1:{
                                    AddFood addFood=new AddFood();
                                    addFood.addFood(foodMenu);
                                    break;
                                }
                                case 2: {
                                    DeleteFood deleteFood = new DeleteFood();
                                    deleteFood.deleteFood(foodMenu);
                                    break;
                                }
                                case 3:{
                                    SearchFood searchFood=new SearchFood();
                                    searchFood.searchFood(foodMenu);
                                    break;
                                }
                                case 4: {
                                    flag = false;
                                }
                                default: {
                                    continue;
                                }
                            }
                        }
                    } else if (number==1) {
                        System.out.println("请浏览菜单!!!");
                        System.out.println("");
                        ArrayList<SellerPart>arrayList=new ArrayList<SellerPart>();
                        ReadFile readFile=new ReadFile();
                        readFile.readNpc(foodMenu,arrayList);
                        SellerPart sellerPart=new SellerPart();
                        for(int i=0;i<arrayList.size();i++){
                            System.out.println(arrayList.get(i).getShopName()+" "+arrayList.get(i).getFoodName()+
                                    " "+arrayList.get(i).getPrice());
                        }
                        System.out.println("");
                        Order order=new Order();
                        order.order(foodMenu);
                    }else
                        System.exit(0);

                }
                case 2: {
                    Register register =new Register();
                    register.register(userDataFile);

                }
                default:{
                    System.out.println("是否退出？是的按1，按其他则平台继续为您服务！");
                    if(scanner.nextInt()==1){
                        System.exit(0);
                    }
                    else{
                        System.out.println("请继续选择服务：按1登陆，按2注册，按其他退出！");
                        num=scanner.nextInt();
                        continue;
                    }

                }

            }
        }

    }
}