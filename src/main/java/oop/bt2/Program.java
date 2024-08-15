/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account ac1 = new Account("TK01", "Tran Quang Nha", 10000);
        Account ac2 = new Account ("TK07","Banh Minh Nam",0);
        
        System.out.println("Thong tin tai khoan ban dau");
        System.out.println("\"My Account [id: \"ac1.getID()+\",name:\"+ ac2.getName()+ \",blance:\" +ac2.getBalance() +\"]");
        System.out.println("MyFriend Account[id" +ac2.getID()+ ", name"+ac2.getName()+",balance:" +ac2.getBalance()+"]");
       
        System.out.println("Rut 200000 tien tu tai khona Account.....");
        ac1.debit(200000);
       
        System.out.println("Nap 1000000 vao tai khoan MyFriend Account......");
        ac2.credit(1000000);
        System.out.println("Chuyen khoan 50000000 tu MyAccount to MyFriend......");
        ac1.tranferTo(ac2,50000000);
       
        System.out.println("Thong tin tai khoan sau giao dich:");
        System.out.println("My Account [id: "+ac1.getID()+ ",name: "+ac1.getName()+",balance:" +ac1.getBalance()+"]");
        System.out.println("\"MyFriend Account [id:\"+ac2.getID()+ \",name:\"+ac2.getName() +\",balance: \"+ac2.getBalance()+\"]");
    }
}