package ra.md5buoi2.service;

import java.util.List;
import java.util.Optional;

public interface IService<T, E> {
    List<T> findAll();

    Optional<T> findById(E id);

    Object save(T t);

    void deleteById(E id);
}
