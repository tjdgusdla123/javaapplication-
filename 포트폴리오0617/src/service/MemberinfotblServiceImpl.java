package service;

import dao.MemberinfotblDao;

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
