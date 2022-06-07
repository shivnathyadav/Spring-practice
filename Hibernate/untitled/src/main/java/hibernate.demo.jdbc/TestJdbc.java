package hibernate.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc{
    public static void main(String[] args) {
        String jdbcUrl ="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "Hb@student1";

        try {
            System.out.println("Connecting to data base : "+jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println(myConn);

            System.out.println("Connection successfull");

        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}