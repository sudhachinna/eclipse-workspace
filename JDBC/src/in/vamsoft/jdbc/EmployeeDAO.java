package in.vamsoft.jdbc;

import java.sql.SQLException;

public interface EmployeeDAO {

  boolean addEmployee(Employee emp) throws SQLException;

  boolean removeEmployee(int empId);

  void close() throws SQLException;

}