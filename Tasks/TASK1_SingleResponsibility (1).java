public class Task1_SingleResponsibility {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail(null,null,null); 

        User loginService = new User();
        loginService.login(null,null); 
    }
}
class User{
        public void login(String username, String password) 
        {
        System.out.printf("Login Service \n");
    }
}

class EmailService 
{
    public void sendEmail(String to, String subject, String body) 
    {
        System.out.printf("Email Service \n");
    }
}
