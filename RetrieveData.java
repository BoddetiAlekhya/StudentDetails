package com.sqldb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.student.model.Student;

public class RetrieveData {
	public List<Student> getStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");

	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root", "root");
	        
	        Statement stmt = (Statement) con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from listOfStudents");
         
       
         
        while (rs.next()) {
            int rollNo = rs.getInt("student_rollNo");
            String name = rs.getString("name");
            int age = rs.getInt("student_age");
            String className = rs.getString("className");
             
            Student studentlist = new Student(rollNo,name,age,className);
            Student.add(studentlist);
        }
         
        con.close();

		}catch(Exception e) {
		System.out.println(e);
		}
         
        return students;
    }

	public static List<Student> getAttribrute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
