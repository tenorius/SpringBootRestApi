import java.sql.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenorius.restapi.entities.Contato;
import com.tenorius.restapi.entities.Operadora;
import com.tenorius.restapi.repositories.ContatoRepository;

public class JacksonExample {

    public static void main(String[] args) throws JsonProcessingException {
        
    	Operadora operadora = new Operadora("Tim",12,"Celular",2);
       
       
        //Contato contato = new Contato("Sawyer", new Date(System.currentTimeMillis()),operadora,"33417791","blue");

        // object mapper is the main object to marshall (write) data into JSON
        ObjectMapper objectMapper = new ObjectMapper();
       // String value = objectMapper.writeValueAsString(contato);
       // System.out.println(value);
         
    }
}