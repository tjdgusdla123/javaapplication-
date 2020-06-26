package dao;

public class StorebasicinfoDao extends MemberinfotblAbstractDao {
	   //singleton 패턴을 적용하기 위한 코드
		//인스턴스를 하나만 생성하는 디자인 패턴
		//모든 곳에서 공유할 데이터를 갖는 클래스나 
		//Entry point(출입구)에 해당하는 클래스 또는 서버에서 클라이언트의 요청을 처리하는 클래스는 인스턴스가 1개이면 됩니다.
		private StorebasicinfoDao() {}
		
		private static StorebasicinfoDao storebasicinfoDao;
		
		public static StorebasicinfoDao sharedInstance() {
			if(storebasicinfoDao == null) {
				storebasicinfoDao = new StorebasicinfoDao();
			}
			return storebasicinfoDao;
		}
	}

