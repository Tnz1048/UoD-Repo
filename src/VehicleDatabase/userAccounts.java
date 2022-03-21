package VehicleDatabase;

public class userAccounts {
    
        private String username;
        private String password;  

    public userAccounts(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        username = "Admin";
        return username;
    }


    public String getPassword() {
        password = "Password";
        return password;
    }
    
   public static void successfulLogin(){
   
       System.out.println("Login Successful!");
   }
   
   public static void unsuccessfulLogin(){
       System.out.println("Login unsuccessful!");   
       
   }   
    
    



        

        
        
        
        
        
    }
    