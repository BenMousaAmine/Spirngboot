package Service;

import Domain.Employee;
import Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImp implements EmployeeService{
    private final EmployeeRepository employeeRepository ;

    public EmployeeImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Iterable<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

}
