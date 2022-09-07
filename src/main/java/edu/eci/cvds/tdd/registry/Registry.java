package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Integer> listaDeRegistros = new ArrayList<>();
    public RegisterResult registerVoter(Person person) {
        RegisterResult respuesta = null ;
        if(!person.isAlive()){
            respuesta = RegisterResult.DEAD;
        } else if (person.getAge()<18 && person.getAge() >0) {
            respuesta = RegisterResult.UNDERAGE;
        } else if (person.getAge() < 0 || person.getAge()>200) {
            respuesta = RegisterResult.INVALID_AGE;
        }else if(listaDeRegistros.contains(person.getId())) {
            respuesta = RegisterResult.DUPLICATED;
        }else{
            respuesta = RegisterResult.VALID;
            listaDeRegistros.add(person.getId());
        }
        return respuesta;
    }

}
