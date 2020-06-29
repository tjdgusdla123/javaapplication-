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
	 //membermail 중복 검사를 위한 메소드
	public boolean membermailCheck(String membermail) {
		System.out.println(membermail);
		boolean result = false;
		connect();
		try {
			//sql 생성
			//membermail을 대문자로 변경해서 비교		
			System.out.println("membermaildao확인");
			pstmt = con.prepareStatement("select membermail from memberinfotbl where upper(membermail) = ?");
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
			System.out.println("membernicknameDAO:" + e.getMessage());
			e.printStackTrace();
		}
		close();		
		System.out.println("membermaildao확인"+result);
		return result;
	}
	 //membernickname 중복 검사를 위한 메소드
	public boolean membernicknameCheck(String membernickname) {
		System.out.println(membernickname);
		boolean result = false;
		connect();
		try {
			//sql 생성
			//membernickname을 대문자로 변경해서 비교		
			System.out.println("membernicknamedao확인");
			pstmt = con.prepareStatement("select membernickname from memberinfotbl where upper(membernickname) = ?");
			//데이터 바인딩
			pstmt.setString(1, membernickname.toUpperCase());
			//SQL 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = false;				
			}else {
				result = true;
			}			
		}catch(Exception e) {
			System.out.println("membernicknameDAO:" + e.getMessage());
			e.printStackTrace();
		}
		close();		
		System.out.println("membermaildao확인"+result);
		return result;
	}
	
	public int register(Memberinfotbl memberinfotbl) {
		int result = -1;
		connect();
		try {
			pstmt = con.prepareStatement(
				"insert into memberinfotbl("
				+ "memberemail, memberpassword,membernickname, )"
				+ " values(?,?,?,?)");
			pstmt.setString(1, memberinfotbl.getMembermail());
			pstmt.setString(2, memberinfotbl.getMemberpassword());
			pstmt.setString(3, memberinfotbl.getMembernickname());
	
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("멤버DAO:" + e.getMessage());
			e.printStackTrace();
		}
		close();
		return result;

	}
	//로그인 처리를 위한 메소드
	public Memberinfotbl login(String membernickname) {
		//없는 아이디인 경우는 null을 리턴
		Memberinfotbl memberinfotbl = null;
		connect();
		try {
			//SQL 만들기
			//user 테이블에서 id를 가지고 데이터를 찾아오기
			pstmt = con.prepareStatement(
				"select * from memberinfotbl where id=?");
			pstmt.setString(1, membernickname);
			//데이터 읽어서 저장
			if(rs.next()) {
				memberinfotbl = new Memberinfotbl();
				memberinfotbl.setMembernickname(rs.getString("membernickname"));
				memberinfotbl.setMemberpassword(rs.getString("Membdrpassword"));
				memberinfotbl.setMembernickname(rs.getString("Membermail"));
				
			}	
		}catch(Exception e) {
			System.out.println("DAO:" + e.getMessage());
			e.printStackTrace();
		}
		
		close();
		return memberinfotbl;
	}
	
}
