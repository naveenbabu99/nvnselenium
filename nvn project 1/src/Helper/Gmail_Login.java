package Helper;

public class Gmail_Login
{

	public static void main(String[] args) throws Exception
	{
		Run_Helper object = new Run_Helper();
		
		object.Browser_path="E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe";
		object.URL="http://facebook.com";
		object.implicit_timeout=10;
		object.Launch_Browser();
		
		
		object.UID=" naveen";
		object.PWD="122345";
		object.user_signin();
		
	

	}
}
		
		
		
		
		
		


