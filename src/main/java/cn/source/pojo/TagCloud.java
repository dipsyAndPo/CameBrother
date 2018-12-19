package cn.source.pojo;

public class TagCloud {
    private Integer tid;

    private String tname;

    private Integer amount;

	public TagCloud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TagCloud(Integer tid, String tname, Integer amount) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.amount = amount;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TagCloud [tid=" + tid + ", tname=" + tname + ", amount=" + amount + "]";
	}

  
}