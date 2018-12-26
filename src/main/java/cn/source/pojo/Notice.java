package cn.source.pojo;

import java.sql.Timestamp;

public class Notice {
    private Integer nid;

    private String title;

    private String context;

    private Timestamp dateline;

    private String img;
    
    private String logoimg;

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notice(Integer nid, String title, String context, Timestamp dateline, String img, String logoimg) {
		super();
		this.nid = nid;
		this.title = title;
		this.context = context;
		this.dateline = dateline;
		this.img = img;
		this.logoimg = logoimg;
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

	public Timestamp getDateline() {
		return dateline;
	}

	public void setDateline(Timestamp dateline) {
		this.dateline = dateline;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLogoimg() {
		return logoimg;
	}

	public void setLogoimg(String logoimg) {
		this.logoimg = logoimg;
	}

	@Override
	public String toString() {
		return "Notice [nid=" + nid + ", title=" + title + ", context=" + context + ", dateline=" + dateline + ", img="
				+ img + ", logoimg=" + logoimg + "]";
	}

	
	
   
}