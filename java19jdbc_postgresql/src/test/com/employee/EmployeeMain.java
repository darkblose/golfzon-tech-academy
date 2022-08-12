package test.com.employee;

import test.com.employee.model.EmployeeDAO;
import test.com.employee.model.EmployeeDAOimpl;
import test.com.employee.model.EmployeeVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        EmployeeDAO dao = new EmployeeDAOimpl();

        EmployeeVO vo = new EmployeeVO();
        boolean On = true;
        int Num = 0;
        String First_name = null;
        String Last_name = null;
        String Email = null;
        int Salary = 0;
        String Hire_date = null;

        while (On) {
            System.out.println("실행할 메뉴를 선택하세요.");
            System.out.println("1. 입력 2. 수정 3. 삭제 4. 사원번호 검색 5. 모두 검색 6. 키워드 검색 9. 종료");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("입력 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("First Name: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    First_name = br.readLine();
                    System.out.print("Last Name: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Last_name = br.readLine();
                    System.out.print("Email: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Email = br.readLine();
                    System.out.print("Salary: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Salary = Integer.parseInt(br.readLine());
                    System.out.print("Date: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Hire_date = br.readLine();
                    vo.setFirst_name(First_name);
                    vo.setLast_name(Last_name);
                    vo.setEmail(Email);
                    vo.setSalary(Salary);
                    vo.setHire_date(Hire_date);
                    int result = dao.insert(vo);
                    if (result == 1) {
                        System.out.println("입력 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("수정 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("사원 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    System.out.print("First Name: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    First_name = br.readLine();
                    System.out.print("Last Name: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Last_name = br.readLine();
                    System.out.print("Email: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Email = br.readLine();
                    System.out.print("Salary: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Salary = Integer.parseInt(br.readLine());
                    System.out.print("Date: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Hire_date = br.readLine();
                    vo.setNum(Num);
                    vo.setFirst_name(First_name);
                    vo.setLast_name(Last_name);
                    vo.setEmail(Email);
                    vo.setSalary(Salary);
                    vo.setHire_date(Hire_date);
                    result = dao.update(vo);
                    if (result == 1) {
                        System.out.println("수정 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("삭제 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("글 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new EmployeeVO();
                    vo.setNum(Num);
                    result = dao.delete(vo);
                    if (result == 1) {
                        System.out.println("삭제 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("사원번호 검색 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("사원 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new EmployeeVO();
                    vo.setNum(Num);
                    EmployeeVO vo2 = dao.selectOne(vo);
                    System.out.println("-----------------------------------------");
                    System.out.printf("Num | ");
                    System.out.printf("First Name | ");
                    System.out.printf("Last Name | ");
                    System.out.printf("\t\t\tEmail\t\t | ");
                    System.out.printf("\t\tSalary\t | ");
                    System.out.printf("Hire Date \n");
                    System.out.println("-----------------------------------------");
                    System.out.printf("%2s", vo2.getNum());
                    System.out.printf("%10s", vo2.getFirst_name());
                    System.out.printf("%15s", vo2.getLast_name());
                    System.out.printf("%20s", vo2.getEmail());
                    System.out.printf("%18s", vo2.getSalary());
                    System.out.printf("%15s\n", vo2.getHire_date());
                    System.out.println("=========================================");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("모두 검색 페이지");
                    System.out.println("-----------------------------------------");
                    List<EmployeeVO> vos = dao.selectAll();
                    System.out.println("-----------------------------------------");
                    System.out.printf("Num | ");
                    System.out.printf("First Name | ");
                    System.out.printf("Last Name | ");
                    System.out.printf("\t\t\tEmail\t\t | ");
                    System.out.printf("\t\tSalary\t | ");
                    System.out.printf("Hire Date \n");
                    System.out.println("-----------------------------------------");
                    for (EmployeeVO x : vos) {
                        System.out.printf("%2s", x.getNum());
                        System.out.printf("%10s", x.getFirst_name());
                        System.out.printf("%15s", x.getLast_name());
                        System.out.printf("%20s", x.getEmail());
                        System.out.printf("%18s", x.getSalary());
                        System.out.printf("%15s\n", x.getHire_date());
                    }
                    System.out.println("=========================================");
                    break;
                case 6:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("키워드 검색 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.println("1. Num, 2. First Name, 3. Last Name, 4. Email, 5. Salary, 6. Hire Date");
                    System.out.print("Key: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Integer Key = Integer.valueOf(br.readLine());
                    switch (Key) {
                        case 1:
                        case 5:
                            System.out.print("Word: ");
                            br = new BufferedReader(new InputStreamReader(System.in));
                            Integer Point = Integer.valueOf(br.readLine());
                            System.out.println();
                            List<EmployeeVO> vos2 = dao.searchPoint(Key, Point);
                            System.out.println("-----------------------------------------");
                            System.out.printf("Num | ");
                            System.out.printf("First Name | ");
                            System.out.printf("Last Name | ");
                            System.out.printf("\t\t\tEmail\t\t | ");
                            System.out.printf("\t\tSalary\t | ");
                            System.out.printf("Hire Date \n");
                            System.out.println("-----------------------------------------");
                            for (EmployeeVO x : vos2) {
                                System.out.printf("%2s", x.getNum());
                                System.out.printf("%10s", x.getFirst_name());
                                System.out.printf("%15s", x.getLast_name());
                                System.out.printf("%20s", x.getEmail());
                                System.out.printf("%18s", x.getSalary());
                                System.out.printf("%15s\n", x.getHire_date());
                            }
                            System.out.println("=========================================");
                            continue;
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            System.out.print("Word: ");
                            br = new BufferedReader(new InputStreamReader(System.in));
                            String Word = br.readLine();
                            System.out.println();
                            vos2 = dao.searchList(Key, String.valueOf(Word));
                            System.out.println("-----------------------------------------");
                            System.out.printf("Num | ");
                            System.out.printf("First Name | ");
                            System.out.printf("Last Name | ");
                            System.out.printf("\t\t\tEmail\t\t | ");
                            System.out.printf("\t\tSalary\t | ");
                            System.out.printf("Hire Date \n");
                            System.out.println("-----------------------------------------");
                            for (EmployeeVO x : vos2) {
                                System.out.printf("%2s", x.getNum());
                                System.out.printf("%10s", x.getFirst_name());
                                System.out.printf("%15s", x.getLast_name());
                                System.out.printf("%20s", x.getEmail());
                                System.out.printf("%18s", x.getSalary());
                                System.out.printf("%15s\n", x.getHire_date());
                            }
                            System.out.println("=========================================");
                            continue;
                    }
                case 9:
                    On = false;
                    break;
            }
        }

    }//end main

}//end class
