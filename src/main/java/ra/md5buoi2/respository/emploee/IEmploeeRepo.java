package ra.md5buoi2.respository.emploee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.md5buoi2.model.Employee;
@Repository
public interface IEmploeeRepo extends JpaRepository<Employee,Long> {
}
