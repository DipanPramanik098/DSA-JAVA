class BankAccount{
    public String userName;
    private String passWord;

    public void setPassWord(String psw){
        passWord = psw;
    }
}
public class _02_AccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.userName = "Dipan Pramanik";

        // account.passWord = "12345";

    }    
}
// class BankAccount{
//     public String userName;
//     private String passWord;

//     public void setPassWord(String psw){
//         passWord = psw;
//     }
// }