package dao;

import domain.Memberinfotbl;

public class MemberinfotblDao extends MemberinfotblAbstractDao {
    //singleton 패턴을 적용하기 위한 코드
	//인스턴스를 하나만 생성하는 디자인 패턴
	//모든 곳에서 공유할 데이터를 갖는 클래스나 
	//Entry point(출입구)에 해당하는 클래스 또는 서버에서 클라이언트의 요청을 처리하는 클래스는 인스턴스가 1개이면 됩니다.
	private MemberinfotblDao() {}
	
	private static MemberinfotblDao memberinfotblDao;
	
	public static MemberinfotblDao sharedInstance() {
		if(memberinfotblDao == null) {
			memberinfotblDao = new MemberinfotblDao();
		}
		return memberinfotblDao;
	}
	
	      //email 중복 검사를 위한 메소드
		public boolean membermailCheck(String membermail) {
			System.out.println(membermail);
			boolean result = false;
			connect();
			
			try {
				//sql 생성
				//email을 대문자로 변경해서 비교
				System.out.println("dao확인");
				pstmt = con.prepareStatement("select membermail from user where upper(membermail) = ?");
				//데이터 바인딩
				pstmt.setString(1, membermail.toUpperCase());
				//SQL 실행
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = false;
				}else {
					result = true;
				}
				
			}catch(Exception e) {
				System.out.println("DAO:" + e.getMessage());
				e.printStackTrace();
			}
			close();
			
			System.out.println(result);
			return result;
		}
		
}
