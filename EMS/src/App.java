import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the database name u wanna work with:");
        String dbName=sc.next();
        System.out.println("WORKING WITH : "+dbName);
        while (true) {
            System.out.println("Enter operation u wanna perform: ");
            System.out.println(
                "1 for adding new employee\n2 for removing employee\n3 for clearing data from table 'employee'\n4 for updating emloyee data\n5 for  displayingData "
                
            );
            int choice=sc.nextInt();
            if (choice>=1&&choice<=5) {
                employeeFunc func=new employeeFunc();
                switch (choice) {
                    case 1://add
                        System.out.println("Enter in format: id name email salary address: ");
                        int id=sc.nextInt();String name=sc.next();String email=sc.next();float salary=sc.nextFloat();String address=sc.next();
                        employee newEmployee=new employee(id, name, email, salary, address);
                        func.addEmployee(newEmployee, dbName);
                        break;
                
                    case 2://remove
                        System.out.println("Enter the id of employee u wanna remove:");
                        int remid=sc.nextInt();
                        func.deleteId(remid, dbName);
                        break;
                
                    case 3://clear
                        func.deleteTable(dbName);
                        System.out.println("deleting employee table..");
                        break;
                
                    case 4://update
                        System.out.println("Enter in format: id updatedName updatedEmail updatedSalary updatedAddress:");
                        int oldId=sc.nextInt();String upName=sc.next();String upEmail=sc.next();float upSalry=sc.nextFloat();String upAdd=sc.next();
                        func.updateName(oldId, upName,upEmail,upSalry,upAdd, dbName);
                        break;
                
                    case 5://display
                        System.out.println(func.showData(dbName));
                        break;
                
                    default:
                        break;
                }
            }else{
                System.out.println("Invalid choice");
            }
        }
       
        
    }
}
