package test.com.employee.model;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    public int insert(EmployeeVO vo) throws SQLException;

    public int update(EmployeeVO vo) throws SQLException;

    public int delete(EmployeeVO vo) throws SQLException;

    public EmployeeVO selectOne(EmployeeVO vo) throws SQLException;

    public List<EmployeeVO> selectAll() throws SQLException;

    public List<EmployeeVO> searchList(Integer searchKey, String searchWord) throws SQLException;

    List<EmployeeVO> searchPoint(Integer searchkey, Integer searchPoint) throws SQLException;
}
