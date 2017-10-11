package dandb;

public class DuescheckVO {

	private String userId;
	private String teamId;
	private String seasonId;
	private String duesCheck;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	public String getDuesCheck() {
		return duesCheck;
	}
	public void setDuesCheck(String duesCheck) {
		this.duesCheck = duesCheck;
	}
	
	@Override
	public String toString() {
		return "DuesCheck [userId=" + userId + ", teamId=" + teamId + ", seasonId=" + seasonId + ", duesCheck="
				+ duesCheck + "]";
	}
} //end class
