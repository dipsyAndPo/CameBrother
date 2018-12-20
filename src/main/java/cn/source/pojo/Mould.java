package cn.source.pojo;

import java.util.List;

public class Mould {
    private Integer mid;

    private String mname;

    private Tarde tarde;
    
    private List<Star> starList;

    private String label;

    private Integer praise;

    private Integer tread;

    private String img;

    private String logo;

    private String preview;

    private String download;
    
	public Mould() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mould(Integer mid, String mname, Tarde tarde, List<Star> starList, String label, Integer praise,
			Integer tread, String img, String logo, String preview, String download) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.tarde = tarde;
		this.starList = starList;
		this.label = label;
		this.praise = praise;
		this.tread = tread;
		this.img = img;
		this.logo = logo;
		this.preview = preview;
		this.download = download;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Tarde getTarde() {
		return tarde;
	}

	public void setTarde(Tarde tarde) {
		this.tarde = tarde;
	}

	public List<Star> getStarList() {
		return starList;
	}

	public void setStarList(List<Star> starList) {
		this.starList = starList;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getPraise() {
		return praise;
	}

	public void setPraise(Integer praise) {
		this.praise = praise;
	}

	public Integer getTread() {
		return tread;
	}

	public void setTread(Integer tread) {
		this.tread = tread;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	@Override
	public String toString() {
		return "Mould [mid=" + mid + ", mname=" + mname + ", tarde=" + tarde + ", starList=" + starList + ", label="
				+ label + ", praise=" + praise + ", tread=" + tread + ", img=" + img + ", logo=" + logo + ", preview="
				+ preview + ", download=" + download + "]";
	}

  
    
}