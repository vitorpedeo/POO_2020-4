package aula09.salaaula.interfaces;

public class OracleConnection implements DBConnection {
   
    @Override
    public void getConnection(String url, String userName, String password) {
        System.out.println("\nConectado ao Oracle:" + 
                           "\nURL: " + url + 
                           "\nuserName: " + userName + 
                           "\npassword: " + password);
    }

}