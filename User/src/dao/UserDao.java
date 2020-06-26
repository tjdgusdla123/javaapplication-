package dao;

import domain.User;

public class UserDao extends AbstractDao {
	//Singleton 패턴을 적용하기 위한 코드
	//인스턴스를 하나만 생성하는 디자인 패턴
	//모든 곳에서 공유할 데이터를 갖는 클래스나
	//Entry point(출입구)에 해당하는 클래스 또는
	//서버에서 클라이언트의 요청을 처리하는 클래스는 
	//인스턴스가 1개이면 됩니다.
	private UserDao() {}
	
	private static UserDao userDao;
	
	public static UserDao sharedInstance() {
		if(userDao == null) {
			userDao = new UserDao();
		}
		return userDao;
	}
	
	//email 중복 검사를 위한 메소드
	public boolean emailCheck(String email) {
		//System.out.println(email);
		boolean result = false;
		connect();
		
		try {
			//sql 생성
			//email을 대문자로 변경해서 비교
			pstmt = con.prepareStatement(
				"select email from user where upper(email) = ?");
			//데이터 바인딩
			pstmt.setString(1, email.toUpperCase());
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
		
		//System.out.println(result);
		return result;
	}
	
	//nickname 중복 검사를 위한 메소드
	public boolean nicknameCheck(String nickname) {
		boolean result = false;
		connect();
		
		try {
			//sql 생성
			pstmt = con.prepareStatement(
				"select nickname from user where upper(nickname) = ?");
			//데이터 바인딩
			pstmt.setString(1, nickname.toUpperCase());
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
		return result;
	}
	
	//데이터 삽입을 위한 메소드
	public int register(User user) {
		int result = -1;
		connect();
		try {
			pstmt = con.prepareStatement(
				"insert into user("
				+ "email, password,nickname, image)"
				+ " values(?,?,?,?)");
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getNickname());
			pstmt.setString(4, user.getImage());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("DAO:" + e.getMessage());
			e.printStackTrace();
		}
		close();
		return result;

	}
}





