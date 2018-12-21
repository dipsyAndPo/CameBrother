package cn.source.pojo;

public class Cao {
	private int cid;
	private String cao;
	public Cao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cao(int cid, String cao) {
		super();
		this.cid = cid;
		this.cao = cao;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCao() {
		return cao;
	}
	public void setCao(String cao) {
		this.cao = cao;
	}
	@Override
	public String toString() {
		return "Cao [cid=" + cid + ", cao=" + cao + "]";
	}
	
	

}
