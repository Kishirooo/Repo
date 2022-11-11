public class Account {
    private String userName;

    private String password;
    private long money;
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password =password;
    }
    public String getUserName(){
        return  userName;
    }
    public String getPassword(){
        return password;
    }
    public void setMoney(long money){
        this.money=money;
    }
    public long getMoney(){
        return money;
    }

}
