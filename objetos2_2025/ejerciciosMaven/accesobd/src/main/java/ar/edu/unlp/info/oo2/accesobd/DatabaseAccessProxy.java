package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	
	private DatabaseRealAccess dba;
	private boolean logged = false;
	private String passwd = "abc123";
	
	
	public void login (String pass) {
		if (pass == this.passwd) {
			logged = true;
			dba = new DatabaseRealAccess();
		}
	}

	public Collection<String> getSearchResults(String queryString) {
		if (logged)
			return this.dba.getSearchResults(queryString);
		
		return null;
	}
	
	
	public int insertNewRow(List<String> rowData) {
		
		if (logged) 
			return this.dba.insertNewRow(rowData);
		
		return -1;
	}

}
