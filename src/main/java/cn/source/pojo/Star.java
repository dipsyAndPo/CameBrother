package cn.source.pojo;


public class Star {
    private Integer sid;

    private Users user;

    private Mould moulds;

	public Star() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Star(Integer sid, Users user, Mould moulds) {
		super();
		this.sid = sid;
		this.user = user;
		this.moulds = moulds;
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




	public Mould getMoulds() {
		return moulds;
	}





	public void setMoulds(Mould moulds) {
		this.moulds = moulds;
	}





	@Override
	public String toString() {
		return "Star [sid=" + sid + ", user=" + user + ", mould=" + moulds + "]";
	}

    
   
}