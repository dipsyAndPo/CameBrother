package cn.source.pojo;

import java.util.Date;

public class Notice {
    private Integer nid;

    private String title;

    private String context;

    private Date dateline;

    private String img;

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notice(Integer nid, String title, String context, Date dateline, String img) {
		super();
		this.nid = nid;
		this.title = title;
		this.context = context;
		this.dateline = dateline;
		this.img = img;
	}

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getDateline() {
		return dateline;
	}

	public void setDateline(Date dateline) {
		this.dateline = dateline;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Notice [nid=" + nid + ", title=" + title + ", context=" + context + ", dateline=" + dateline + ", img="
				+ img + "]";
	}

   
}