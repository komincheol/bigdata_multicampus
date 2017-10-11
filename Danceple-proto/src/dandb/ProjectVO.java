package dandb;

public class ProjectVO {

	private long projectNo;
	private String projectTitle;
	private String projectDate;
	private String projectDesc;

	public long getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(long projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getProjectDate() {
		return projectDate;
	}
	public void setProjectDate(String projectDate) {
		this.projectDate = projectDate;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	@Override
	public String toString() {
		return "ProjectVO [projectNo=" + projectNo + ", projectTitle=" + projectTitle + ", projectDate=" + projectDate
				+ ", projectDesc=" + projectDesc + "]";
	}
	
} //end class
