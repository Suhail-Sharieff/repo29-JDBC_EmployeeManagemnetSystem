public class employee {
    private  int id;
    private  String name;
    private  String email;
    private  float salary;
    private  String address;

    public employee(int id,String name,String email,float salary,String address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
        this.address=address;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public float getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }
    public String showData(){
        return ("\n[id="+id+" name="+name+" email="+email+" salary="+salary+" address="+address+"]");
    }
}
