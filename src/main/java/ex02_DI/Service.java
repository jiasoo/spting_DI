package ex02_DI;



public class Service {
	private DAO dao;
	public Service() {}
	
	// 생성자를 이용
	public Service(DAO dao) {
		this.dao = dao;
	}

	// setter를 이용
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public DAO getDao() {
		return dao;
	}

	// 실제 실행하고자 하는 메서드
		public void biz() {
			dao.prn();
			
		}
}
