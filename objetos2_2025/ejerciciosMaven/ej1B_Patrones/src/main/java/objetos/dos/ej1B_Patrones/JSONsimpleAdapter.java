package objetos.dos.ej1B_Patrones;

import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONsimpleAdapter extends VoorheesExporter {

	public JSONObject construirSocioEnJSON (Socio s) {
		JSONObject socioJS= new JSONObject();
		
		socioJS.put("nombre", s.getNombre());
		socioJS.put("email", s.getEmail());
		socioJS.put("legajo", s.getLegajo());
		
		return socioJS;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arrDeSocios = new JSONArray();
		
		socios.stream().forEach(s -> arrDeSocios.add(this.construirSocioEnJSON(s)));
		
		return arrDeSocios.toJSONString(); //toString() retorna igual
		
		
	}
}
