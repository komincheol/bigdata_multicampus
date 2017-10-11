package dandb;

public class TeacherVO {
	
	private String tName;
	private long genreId;
	private long teamId;
	
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public long getGenreId() {
		return genreId;
	}
	public void setGenreId(long genreId) {
		this.genreId = genreId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	
	@Override
	public String toString() {
		return "TeacherVO [tName=" + tName + ", genreId=" + genreId + ", teamId=" + teamId + "]";
	}
	
} //end class
