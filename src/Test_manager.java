import java.util.Date;
public class Test_manager {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("java");
        employee.setSalary(100);
        employee.setBirthday(new Date());
        Manager manager = new Manager();
        manager.setName("python");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);
        System.out.println("员工"+employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBirthday());
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getBirthday());
        System.out.println(manager.getBonus());

    }
}
