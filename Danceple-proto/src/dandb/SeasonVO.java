package dandb;

public class SeasonVO {
	
	private long seasonId;
	private String snMonth;
	private String startDate;
	private String endDate;
	private long projectNo;
	
	public long getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(long seasonId) {
		this.seasonId = seasonId;
	}
	public String getSnMonth() {
		return snMonth;
	}
	public void setSnMonth(String snMonth) {
		this.snMonth = snMonth;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public long getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(long projectNo) {
		this.projectNo = projectNo;
	}
	@Override
	public String toString() {
		return "SeasonVO [seasonId=" + seasonId + ", snMonth=" + snMonth + ", startDate=" + startDate + ", endDate="
				+ endDate + ", projectNo=" + projectNo + "]";
	}
	

} //end class
