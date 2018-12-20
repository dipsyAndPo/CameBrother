package cn.source.pojo;

import java.util.List;

public class Tarde {
    private Integer tid;

    private String tname;
    private List<Mould> moulds;

	public Tarde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarde(Integer tid, String tname, List<Mould> moulds) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.moulds = moulds;
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

	public List<Mould> getMoulds() {
		return moulds;
	}

	public void setMoulds(List<Mould> moulds) {
		this.moulds = moulds;
	}

	@Override
	public String toString() {
		return "Tarde [tid=" + tid + ", tname=" + tname + ", moulds=" + moulds + "]";
	}

	
    
    
    
    
}