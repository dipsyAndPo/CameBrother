package cn.source.pojo;

import java.util.List;

public class Users {
    private Integer uid;

    private String uname;

    private String upwd;

    private List<Star> statList;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Integer uid, String uname, String upwd, List<Star> statList) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.statList = statList;
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

	public void setStatList(List<Star> statList) {
		this.statList = statList;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", statList=" + statList + "]";
	}
    
    
}