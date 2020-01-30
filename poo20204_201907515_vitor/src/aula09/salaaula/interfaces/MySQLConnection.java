package aula09.salaaula.interfaces;

public class MySQLConnection implements DBConnection{
      
    @Override
    public void getConnection(String url, String userName, String password) {
        System.out.println("\nConectado ao MySQL:\n" + 
                           "URL: " + url + 
                           "\nuserName: " + userName + 
                           "\npassword: " + password);
    }
}