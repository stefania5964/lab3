package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
    private Person person;
    private ArrayList<Integer> ListaDeRegistros = new ArrayList<>();
    public RegisterResult registerVoter(Person p) {
        this.person = p ;
        RegisterResult respuesta = null ;
        if(!person.isAlive()){
            respuesta = RegisterResult.DEAD;
        } else if (person.getAge()<18 && person.getAge() >0) {
            respuesta = RegisterResult.UNDERAGE;
        } else if (person.getAge() < 0 || person.getAge()>200) {
            respuesta = RegisterResult.INVALID_AGE;
        }else if(ListaDeRegistros.contains(p.getId())) {
            respuesta = RegisterResult.DUPLICATED;
        }else{
            respuesta = RegisterResult.VALID;
            ListaDeRegistros.add(p.getId());
        }
        return respuesta;
    }

}
