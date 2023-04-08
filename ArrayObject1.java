public class ArrayObject1 {
    public static void main(String args[]) {

        Employee e[];
        e = new Employee[4];
    
        for(int i = 0; i < 4; i++) {
            e[i] = new Employee();
            e[i].setData(i+1, 5000*(i+1));
        }
        
        for(int i = 0; i < 4; i++) {
          e[i].printData();
        }
    }
}

class Employee {
    private int empId;
    private float salary;
    
    public void setData(int id, float s) {
        empId = id;
        salary = s;
    }
    
    public void printData() {
        System.out.println("Emp Id : " + empId + "\tSalary : " + salary);
    }
}