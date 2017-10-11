package test;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("OracleDB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에 삭제");
	}

}
