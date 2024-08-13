package day05;

interface DataAccessObject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 삭제");
		
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삭제");
		
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 삭제");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	
}

class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySQL DB에서 삭제");
		
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에서 삭제");
		
	}

	@Override
	public void update() {
		System.out.println("MySQL DB에서 삭제");
		
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에서 삭제");
		
	}
	
}

public class DaoExample {
	
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
