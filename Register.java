import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public void register(String fileName)throws IOException {
        ArrayList<Account> array = new ArrayList<>();
        ReadFile readFile =new ReadFile();
        readFile.readFile(fileName,array);
        Scanner scanner= new Scanner(System.in);
        System.out.println("用户名：");
        String userName = scanner.nextLine();
        for(int i=0;i<array.size();i++){
            if(userName.equals(array.get(i).getUserName())){
                System.out.println("您已注册！");
                return;
            }
        }
        System.out.println("密码：");
        String password = scanner.nextLine();
        Account account = new Account();
        account.setUserName(userName);
        account.setPassword(password);
        array.add(account);
        WriteFile writeFile =new WriteFile();
        writeFile.writeFile(fileName,array);
        System.out.println("注册成功！");
    }

}
