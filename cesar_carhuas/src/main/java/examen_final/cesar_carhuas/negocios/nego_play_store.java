package examen_final.cesar_carhuas.negocios;


import examen_final.cesar_carhuas.entidades.play_Store;
import examen_final.cesar_carhuas.repositorio.repos_play_store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class nego_play_store {

    @Autowired
    private repos_play_store repos_play_store;
    public play_Store crear_play_store(play_Store play_store){
        return repos_play_store.save(play_store);
    }
    public List<play_Store> listar_play_store(){
        return (List<play_Store>) repos_play_store.findAll();
    }
    public play_Store actualizar_play_store(play_Store play_Store){
        play_Store p_s = repos_play_store.findById(play_Store.getId_play_Store()).get();
        if(p_s != null){
            return repos_play_store.save(play_Store);
        }else {return null;}
    }
    public play_Store borrar_play_store(Long id_play_Store){
        play_Store p_s = repos_play_store.findById(id_play_Store).get();
        if(p_s != null){
            repos_play_store.delete(p_s);
        }else {return null;}
        return p_s;
    }
}




