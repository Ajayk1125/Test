import java.util.Scanner;
class PasswordDemo {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter First Name : ");
		String firstName = obj.nextLine(); 

		System.out.print("Enter Last Name : ");
		String lastName = obj.nextLine();
 
		System.out.print("Enter userName :");
		String userName = obj.nextLine();

		System.out.print("Enter Phone Number : ");
		7
		String phoneNumber = obj.nextLine();
 
		String numberSeries = "1234567890";

		System.out.print("Enter Password :");
		String passWord = obj.nextLine();
		StringBuffer sbr = new StringBuffer(userName);
		sbr.reverse();

		try {
			if(passWord.equalsIgnoreCase(userName)|| passWord.contains(firstName) || passWord.contains(lastName) || passWord.contains(numberSeries) || passWord.contains(sbr) || passWord.contains(phoneNumber)) 
			{	throw new InvalidPasswordException("password is Weak!..");
			}
		}catch(InvalidPasswordException ex) {
			System.out.println(ex);		
		}

		System.out.println("Name :" + firstName + " " + lastName);
		System.out.println("UserName :" + userName);
		System.out.println("Phone Number : " + phoneNumber);
	}
		
}
class InvalidPasswordException extends Exception {
		public InvalidPasswordException(String passWord) {
			super(passWord);
		}
	}
