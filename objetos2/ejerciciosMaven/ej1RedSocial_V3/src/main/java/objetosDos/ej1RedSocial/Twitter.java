package objetosDos.ej1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<User> users;

	public Twitter() {
		this.users = new ArrayList<User>();
	}

	private boolean screenNameExist (String sn) {
		return users.stream()
				.anyMatch(u -> u.getScreenName().equals(sn));
	}
	
	public boolean addUser (User u) {
		
		if (!screenNameExist(u.getScreenName())) {
			return users.add(u);	
		}
		
		return false;
	}
	
	public void delUser (User u) {
		/*
		 * 1~ Remuevo al usuario de la lista
		 * 2~ Recorro la lista de usuarios para encargarles que borren ReTweets cuyo origen es del usuario que se elimino. 
		 */ 
		users.remove(u);
		
		users.stream().forEach(user -> user.deleteTweetsFrom(u));
		
		//usar For es reinventar la rueda
		
	}

	public List<User> getUsers() {
		return users;
	}

}
