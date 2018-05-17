package pl.devfoundry.optional.intro;

import java.util.Optional;

public class App {

    public static void main(String[] args) {
        Optional<Employee> employee = EmployeeRepository.find("Jacek");


//        if (employee.isPresent()) {
//            Employee emp = employee.get();
//            if (emp.getAge() >= 30) {
//                System.out.println(emp.getName().toUpperCase());
//            } else {
//                throw new RuntimeException("Brak odpowiedniego pracownika");
//            }
//        }


        employee.filter(emp -> emp.getAge() >= 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        employeeName -> System.out.println(employeeName),
                        () -> System.out.println("Nie znaleziono pracownika")
                );
    }
}
