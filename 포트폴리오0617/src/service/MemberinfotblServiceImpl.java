package service;

import dao.MemberinfotblDao;
//User의 요청을 처리할 메소드를 구현할 클래스
public class MemberinfotblServiceImpl implements MemberinfotblService{

	private	MemberinfotblDao memberinfotblDao;
	
	private MemberinfotblServiceImpl() {
		//Dao 인스턴스를 생성
		memberinfotblDao = MemberinfotblDao.sharedInstance();
		
	}
	
	private static MemberinfotblService memberinfotblService;
	
	public static MemberinfotblService sharedInstance() {
		if(memberinfotblService == null) {
			memberinfotblService = new MemberinfotblServiceImpl();
		}
		return memberinfotblService;
	}
	
}
