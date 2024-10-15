package ra.md5buoi2.respository.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.md5buoi2.model.Department;
@Repository
public interface IDepartmentRepo extends JpaRepository<Department, Long> {
}
