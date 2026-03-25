package objetos.dos.ej1B_Patrones;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {
	
	//Si no ponia el try catch me daba un error de "Unhandled exception type"
	public String construirSocioEnJSON(Socio s) {
	    try {
	        ObjectMapper objectMapper = new ObjectMapper();
	        return objectMapper.writeValueAsString(s);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public String exportar(List<Socio> socios) {
		
		return socios.stream().map(s -> this.construirSocioEnJSON(s))
							  .collect(Collectors.toList())
							  .toString();
		
	}
}
