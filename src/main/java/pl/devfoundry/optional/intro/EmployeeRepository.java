package pl.devfoundry.optional.intro;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeRepository {

    private static Map<String, Employee> employees = new HashMap<>();

    static {
        employees.put("Pawel", new Employee("Pawel", 30));
    }

    private EmployeeRepository() { }

    public static Optional<Employee> find(String name) {
        return Optional.ofNullable(employees.get(name));
    }


}
