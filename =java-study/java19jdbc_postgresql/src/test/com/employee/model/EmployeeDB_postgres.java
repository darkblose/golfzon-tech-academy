package test.com.employee.model;

public interface EmployeeDB_postgres {
    String DRIVER_NAME = "org.postgresql.Driver";
    String URL = "jdbc:postgresql://localhost:5432/golfzon";
    String USER = "kosta";
    String PASSWORD = "hi123456";

    String SQL_INSERT = "insert into " + "employee(num, first_name, last_name, email, salary, hire_date)" + "values(nextval('seq_employee'),?,?,?,?,?)";
    String SQL_UPDATE = "update employee set first_name=?,last_name=?,email=?, salary=?, hire_date = ? where num=?";
    String SQL_DELETE = "delete from employee where num=?";
    String SQL_SELECT_ONE = "select * from employee where num=?";
    String SQL_SELECT_ALL = "select * from employee order by num desc";
    String SQL_SEARCH_LIST_NUM = "select * from employee where NUM = ? order by num desc";
    String SQL_SEARCH_LIST_FN = "select * from employee where first_name like ? order by num desc";
    String SQL_SEARCH_LIST_LN = "select * from employee where last_name like ? order by num desc";
    String SQL_SEARCH_LIST_email = "select * from employee where email like ? order by num desc";
    String SQL_SEARCH_LIST_salary = "select * from employee where salary = ? order by num desc";
    String SQL_SEARCH_LIST_HD = "select * from employee where hire_date like ? order by num desc";

}
