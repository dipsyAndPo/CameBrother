package cn.source.pojo;

import java.util.List;

public class Users {
    private Integer uid;

    private String uname;

    private String upwd;
    
    private Integer struts;
    
    private String uphone;

    private List<Star> statList;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public List<Star> getStatList() {
		return statList;
	}

	
	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public void setStatList(List<Star> statList) {
		this.statList = statList;
	}


	public Users(Integer uid, String uname, String upwd, Integer struts, String uphone, List<Star> statList) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.struts = struts;
		this.uphone = uphone;
		this.statList = statList;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", struts=" + struts + ", uphone=" + uphone
				+ ", statList=" + statList + "]";
	}

	public Integer getStruts() {
		return struts;
	}

	public void setStruts(Integer struts) {
		this.struts = struts;
	}
	
	
    
    
}