import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    public boolean login(String fileName)throws IOException {
        ArrayList<Account> arrayList= new ArrayList<Account>();
        ReadFile readFile=new ReadFile();
        readFile.readFile(fileName,arrayList);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName= scanner.nextLine();
        for(int i=0;i<arrayList.size();i++){
            if(userName.equals(arrayList.get(i).getUserName())){
                System.out.println("请输入密码：");
                String password=scanner.nextLine();
                if(Objects.equals(arrayList.get(i).getPassword(), password)){
                    return true;
                }
                else{
                    System.out.println("密码错误！");
                    return false;
                }
            }
        }
        System.out.println("用户不存在！请先注册！");
        return false;
    }
}
