
package Test;

import Service.EmployeeService;
import dao.CommonDao;
import domin.Employees;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        CommonDao emDao = new EmployeeService();
        List<Employees> list = (List<Employees>) emDao.getList();
        for (Employees e : list) {
            System.out.println(e.getEmployeeID() + " " + e.getFirstName());
        }
    }
}
