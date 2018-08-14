package configManagement;

import java.util.HashMap;

public class Configs {
	private Configs pre;
	private int id;
	private HashMap<String,String> hmap;
	
	public Configs(Configs pre,int id,HashMap<String,String> hmap){
		this.pre=pre;
		this.id=id;
		this.hmap=hmap;
	}

	public Configs getPre() {
		return pre;
	}

	public void setPre(Configs pre) {
		this.pre = pre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<String, String> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<String, String> hmap) {
		this.hmap = hmap;
	}
}
