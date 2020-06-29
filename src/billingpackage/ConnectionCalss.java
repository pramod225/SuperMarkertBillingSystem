package billingpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionCalss {
     public Connection con;
    public  Connection getCon() {
        
        String db="admin";
        String user="root";
        String pss="Pramod@123";
        try {
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3305/"+db,user,pss);
       if(con != null ){
                //System.out.println("conncetion  suceefully");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       System.out.println("conncetion not suceefully");
        
        }
        return con;
        
    }
    public static void main(String [] agrs){
    
    
    
    }
}
