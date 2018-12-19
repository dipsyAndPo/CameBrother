package cn.source.pojo;

public class Star {
    private Integer sid;

    private Users user;

    private Mould mould;

	public Star() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Star(Integer sid, Users user, Mould mould) {
		super();
		this.sid = sid;
		this.user = user;
		this.mould = mould;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Mould getMould() {
		return mould;
	}

	public void setMould(Mould mould) {
		this.mould = mould;
	}

	@Override
	public String toString() {
		return "Star [sid=" + sid + ", user=" + user + ", mould=" + mould + "]";
	}

    
   
}