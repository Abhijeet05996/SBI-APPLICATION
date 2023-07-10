import password_encoder_app.PwdSecurityService;

public class UserReg {

	public static void main(String[] args) {
		 PwdSecurityService pss = new  PwdSecurityService();
		 String encode = pss.encodeString("Abhijeet");
		 System.out.println(encode); //QWJoaWplZXQ=
		
	}

}
