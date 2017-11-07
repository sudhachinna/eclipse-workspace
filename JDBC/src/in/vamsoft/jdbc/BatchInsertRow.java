package in.vamsoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BatchInsertRow {

  public static void main(String[] args) {
    try(Connection con=JdbcDaoConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into empdemo1 values(?,?,?,?,?)");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in))
        {
          String answer="no";
          
          do {
            System.out.println("Enter id:");
            int id=scanner.nextInt();
            System.out.println("Enter Name:");
            String name=scanner1.next();
            System.out.println("Enter Salary");
            double sal=scanner1.nextDouble();
            System.out.println("Enter DOJ in format dd-mm-yyyy");
            String doj=scanner1.next();
            System.out.println("Enter deptid:");
            int deptid=scanner1.nextInt();
            
            LocalDate localDate=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd-mm-yyyy"));
            java.sql.Data hireDate=java.sql.Date.valueof(localDate);
            
            ps.setInt(1, id);
            ps.setString(2,name);
            ps.setDouble(3, sal);
            ps.setDate(4, hireDate);
            ps.setInt(5,deptid);
            ps.addBatch();
            System.out.println("Do you want to insert more rows?(yes/no)");
            answer=scanner1.next();
          }while(answer.equalsIgnoreCase("yes"));
          int[] rowsInserted=ps.executeBatch();
          for(int row:rowsInserted) {
            if(row!=0) {
              System.out.println(row+"rows inserted");
              else
                System.out.println("No row was inseted");
            }
          }catch(SQLException e) {
            e.printStackTrace();
          }    
         

}
  }
