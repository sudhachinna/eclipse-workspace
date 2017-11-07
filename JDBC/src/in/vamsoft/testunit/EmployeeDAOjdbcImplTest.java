package in.vamsoft.testunit;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import in.vamsoft.jdbc.Employee;
import in.vamsoft.jdbc.EmployeeDAO;
import in.vamsoft.jdbc.EmployeeDAOFactory;

public class EmployeeDAOjdbcImplTest {

  static EmployeeDAO dao;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    dao = EmployeeDAOFactory.getEmployeeDAOObj();
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    dao.close();
    dao = null;
  }

  @Test
  public void testAddEmployee() {
    Employee emp = new Employee(600, "Sudha", 20000, LocalDate.now(), 20);
    try {
      boolean result = dao.addEmployee(emp);
      assertTrue(result);
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Test
  @Ignore
  public void testRemoveEmployee() {
    fail("Not yet implemented");
  }

}
