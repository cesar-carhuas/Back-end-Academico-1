package examen_final.cesar_carhuas.negocios;

import examen_final.cesar_carhuas.entidades.seguridad.User;
import examen_final.cesar_carhuas.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserNegocio {

    @Autowired
    private UserRepositorio userRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User grabar(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepositorio.save(user);
    }

    public List<User> obtenerUsuarios() {
        return (List<User>) userRepositorio.findAll();
    }

    public User actualizar(User user) {
        if (userRepositorio.existsById(user.getId())) {
            return userRepositorio.save(user);
        } else {
            return null; // Manejar el caso donde el usuario no existe
        }
    }

    public User borrarUsuario(Long id) {
        User user = userRepositorio.findById(id).orElse(null);
        if (user != null) {
            userRepositorio.delete(user);
        }
        return user;
    }

    public User buscarPorId(Long id) {
        return userRepositorio.findById(id).orElse(null);
    }

    public User buscarPorUsername(String username) {
        return userRepositorio.findByUsername(username);
    }
}
