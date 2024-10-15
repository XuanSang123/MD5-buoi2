package ra.md5buoi2.service.employee;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md5buoi2.model.Employee;
import ra.md5buoi2.respository.emploee.IEmploeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private IEmploeeRepo emploeeRepo;

    @Override
    public List<Employee> findAll() {
        return emploeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return emploeeRepo.findById(id);
    }

    @Override
    public Object save(Employee employee) {
        emploeeRepo.save(employee);
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        emploeeRepo.deleteById(id);
    }
}
