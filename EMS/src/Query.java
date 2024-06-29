public class Query {
    public static String insert="insert into employee (id,name,email,salary,address) values (?,?,?,?,?)";
    public static String updateName ="update employee set name=?,email=?,salary=?,address=? where id=?";
    public static String deleteTable ="delete from employee";
    public static String deleteId="delete from employee where id=?";
    public static String select="select * from employee";
    
}
