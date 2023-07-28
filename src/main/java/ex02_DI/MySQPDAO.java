package ex02_DI;

public class MySQPDAO implements DAO{
	public MySQPDAO() {
		System.out.println("MySQL 생성자");
	}
	@Override
	public void prn() {
		System.out.println("MySQL 메서드 ");		
	}

}
