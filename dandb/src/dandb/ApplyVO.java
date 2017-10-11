package dandb;

public class ApplyVO {

	private String memberId;
	private long teamId;
	private long genre1;
	private long genre2;
	private long genre3;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public long getGenre1() {
		return genre1;
	}
	public void setGenre1(long genre1) {
		this.genre1 = genre1;
	}
	public long getGenre2() {
		return genre2;
	}
	public void setGenre2(long genre2) {
		this.genre2 = genre2;
	}
	public long getGenre3() {
		return genre3;
	}
	public void setGenre3(long genre3) {
		this.genre3 = genre3;
	}
	
	@Override
	public String toString() {
		return "ApplyVO [memberId=" + memberId + ", teamId=" + teamId + ", genre1=" + genre1 + ", genre2=" + genre2
				+ ", genre3=" + genre3 + "]";
	}
	
} //end class
