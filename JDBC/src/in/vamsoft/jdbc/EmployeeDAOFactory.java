package in.vamsoft.jdbc;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class EmployeeDAOFactory {

  public static Logger logger = Logger.getLogger(EmployeeMain.class);
  public static EmployeeDAO getEmployeeDAOObj()
  {
    EmployeeDAOjdbcImpl impl=null;
    try {
      impl = new EmployeeDAOjdbcImpl();
      
    } catch (ClassNotFoundException | SQLException | IOException e) {
      
      logger.info("The Object is Not Created ",e);
    }
    return impl;
  }
  
}
