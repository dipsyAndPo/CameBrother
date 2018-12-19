package cn.source.pojo;

import java.util.List;

public class Tarde {
    private Integer tid;

    private String tname;

    private List<Mould> mouldList;

	public Tarde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarde(Integer tid, String tname, List<Mould> mouldList) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mouldList = mouldList;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Mould> getMouldList() {
		return mouldList;
	}

	public void setMouldList(List<Mould> mouldList) {
		this.mouldList = mouldList;
	}

	@Override
	public String toString() {
		return "Tarde [tid=" + tid + ", tname=" + tname + ", mouldList=" + mouldList + "]";
	}
    
    
    
}