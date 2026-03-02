package examen_final.cesar_carhuas.rest;

import examen_final.cesar_carhuas.entidades.seguridad.User;
import examen_final.cesar_carhuas.negocios.UserNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen_final")
public class user_rest {
    @Autowired
    private UserNegocio userNegocio;

    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        User newUser = userNegocio.grabar(user);
        return ResponseEntity.ok("User created successfully with id: " + newUser.getId());
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userNegocio.obtenerUsuarios();
        return ResponseEntity.ok(users);
    }

}
