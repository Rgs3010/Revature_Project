package shopping_app;
import java.util.*;
import java.sql.*;
import org.apache.log4j.Logger;

/*import shopping_app.exception.BusinessException;
import shopping_app.model.Player;
import com.app.search.service.PlayerSearchService;
import com.app.search.service.impl.PlayerSearchServiceImpl;

*/


public class Start 
{

	public static void main(String[] args) throws Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Welcome");
		System.out.println("--------");
		System.out.println("Main Menu");
		System.out.println("1).Login As Customer");
		System.out.println("2).Login As Employee");
		System.out.println("3).Register Customer");
		System.out.print("Enter Choice:");
		
		Class.forName("com.mysql.jdbc.Driver");
		String query="select productname from products where productid=3";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping_app","root","Rgs@21021110");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("productname");
		System.out.println(name);
		st.close();
		con.close();
		sc.close();
		
		switch(n)
		{
		case 1:
			System.out.print(1);
			customer_login();
			break;
		case 2:
			System.out.print(2);
			break;
		case 3:
			System.out.print(3);
			break;
		
		}
		
	}
	public static void customer_login()
	{
		System.out.print("u entered into cus login");
	}

}

