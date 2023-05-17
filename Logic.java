import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Logic {
	String displayDetails(String empNo, String field) {
		Employee employee = new Employee();
		String query = "select empname,designation,doj from employee_details where empNo= ? ";
		String value=null;
		try {
			employee = getJdbcConnection(query,empNo);
			
			if(field.equals("EMPNAME"))
				value= employee.getEmpName();
			
			if(field.equals("DESIGNATION"))
				value = employee.getDesignation();
			
			else 
				value =  "Invalid Field Value";
			
			
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return value;
	
		
	}
public int displayExperience(String empNo)
{	Employee e = new Employee();
	String query = "select empname,designation,doj from employee_details where empNo= ? ";
	try {
		e = getJdbcConnection(query,empNo);
		
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return 1;
}
	private Employee getJdbcConnection(String query,String empNo) throws SQLException {
		Employee e = new Employee();
		e.setEmpNo(empNo);
		Connection connection=null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		  connection = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "root");
		if(connection!=null)
		pstmt = connection.prepareStatement(query);
		if(pstmt != null)
		{
			pstmt.setString(0, empNo);
			resultSet = pstmt.executeQuery();
			if(resultSet.next())
			{
				e.setEmpName(resultSet.getString(0));
				e.setDesignation(resultSet.getString(1));
				e.setDOJ(resultSet.getDate(2));
			}
			else
				System.out.println("Invalid Employee Number");
		}
		
		return e;

	}

}
