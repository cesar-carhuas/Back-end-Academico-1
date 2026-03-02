package examen_final.cesar_carhuas.repositorio;

import examen_final.cesar_carhuas.entidades.seguridad.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositorio extends CrudRepository<User, Long> {
    User findByUsername(String username);
}