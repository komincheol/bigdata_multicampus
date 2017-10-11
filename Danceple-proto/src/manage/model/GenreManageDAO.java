package manage.model;

import dandb.GenreVO;

public interface GenreManageDAO {

	void insertGenre(GenreVO genreVO) throws Exception;
	void deleteGenre(String genreId) throws Exception;
	void updateGenre(GenreVO genreVO)throws Exception;
}
