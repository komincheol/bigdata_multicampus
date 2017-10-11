package dandb;

public class GenreVO {
	
	private String genreId;
	private String gname;
	
	public String getGenreId() {
		return genreId;
	}
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return gname;
	}
	public void setGenreName(String gname) {
		this.gname = gname;
	}
	
	@Override
	public String toString() {
		return "GenreVO [genreId=" + genreId + ", gname=" + gname + "]";
	}
} //end class
