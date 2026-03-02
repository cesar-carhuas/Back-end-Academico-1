package examen_final.cesar_carhuas.rest;


import examen_final.cesar_carhuas.entidades.play_Store;
import examen_final.cesar_carhuas.negocios.nego_play_store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/examen_final")
public class rest_play_store {
    @Autowired
    private nego_play_store nego_play_store;

    @PostMapping("/crear")
    public play_Store grabar(@RequestBody play_Store play_store){
        return nego_play_store.crear_play_store(play_store);
    }
    @GetMapping("/listar")
    public List<play_Store> listar(){
        try{
            return nego_play_store.listar_play_store();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible obtener los datos");
        }
    }
    @PutMapping("/actualizar")
    public play_Store actualizar(@RequestBody play_Store play_store){
        try{
            return nego_play_store.actualizar_play_store(play_store);
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible actualizar");
        }
    }
    @DeleteMapping("/crear/{id_play_Store}")
    public play_Store borrar(@PathVariable(value = "id_play_Store") Long id_play_Store){
        return nego_play_store.borrar_play_store(id_play_Store);
    }
}


