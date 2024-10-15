package ra.md5buoi2.service.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md5buoi2.model.Department;
import ra.md5buoi2.respository.department.IDepartmentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private IDepartmentRepo departmentRepo;

    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepo.findById(id);
    }

    @Override
    public Object save(Department department) {
        departmentRepo.save(department);
        return null;
    }

    @Override
    public void deleteById(Long id) {
        departmentRepo.deleteById(id);
    }
}
