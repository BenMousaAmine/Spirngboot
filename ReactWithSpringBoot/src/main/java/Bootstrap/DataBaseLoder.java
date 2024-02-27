package Bootstrap;

import Domain.Employee;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoder implements CommandLineRunner {

    private final EmployeeRepository repository;
    @Autowired
    public DataBaseLoder(EmployeeRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}