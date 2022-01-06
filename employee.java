import java.util.Scanner;
class Employee
{
        int id;
        String name;
        String dept; 
        float salary;
        static int count;
 Employee()
{
count++;
id=0;
name=null;
dept=null;
salary=0;
}

Employee(int id,String name,String dept,float salary)
{
this.id=id;
this.name=name;
this.dept=dept;
this.salary=salary;
}

static void counter()
{
   System.out.println(count+" object is created");
}
 
                public static void main(String args[]) 
{
                Scanner sc = new Scanner(System.in);
                System.out.print("How many employees? ");
                int n = sc.nextInt();
                Employee emp[] = new Employee[n];
                for (int i = 0; i < n; i++) {
                emp[i] = new Employee();
                System.out.println("Enter " + (i + 1) + " Employee data :");
                System.out.print("Enter employee id :");
                emp[i].id = sc.nextInt();
                System.out.print("Enter employee name :");
                emp[i].name = sc.next();
                System.out.print("Enter employee department :");
                emp[i].dept = sc.next();
                System.out.print("Enter employee salary :");
                emp[i].salary = sc.nextFloat();
}
     System.out.println("\n\n********* All Employee Details are :*********\n");
     for (int i = 0; i < n; i++) {
            System.out.println("Employee id, Name, department and Salary :" + emp[0].id + " " + emp[i].name + " " + emp[i].dept + " " +emp[i].salary + "" +emp[i].count);
      }
     }
    }
