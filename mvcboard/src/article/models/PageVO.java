package article.models;

public class PageVO {
	private long startnum;
	private long endnum;
	private long startpage;
	
	public PageVO(long startnum, long endnum, long startpage, long endpage) {
		super();
		this.startnum = startnum;
		this.endnum = endnum;
		this.startpage = startpage;
		this.endpage = endpage;
	}

	private long endpage;	
	
	public long getStartpage() {
		return startpage;
	}

	public void setStartpage(long startpage) {
		this.startpage = startpage;
	}

	public long getEndpage() {
		return endpage;
	}

	public void setEndpage(long endpage) {
		this.endpage = endpage;
	}

	public PageVO(){
		
	}
	
	public long getStartnum() {
		return startnum;
	}
	public void setStartnum(long startnum) {
		this.startnum = startnum;
	}
	public long getEndnum() {
		return endnum;
	}
	public void setEndnum(long endnum) {
		this.endnum = endnum;
	}
	@Override
	public String toString() {
		return "PageVO [startnum=" + startnum + ", endnum=" + endnum + ", startpage=" + startpage + ", endpage="
				+ endpage + "]";
	}
	
	public PageVO(long startnum, long endnum) {
		super();
		this.startnum = startnum;
		this.endnum = endnum;
	}

}
