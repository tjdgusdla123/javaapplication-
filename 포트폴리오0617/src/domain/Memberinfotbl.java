package domain;

import java.sql.Date;

public class Memberinfotbl {
	private String membernickname;     // 회원별명
	private String membermail;        // 회원이메일
	private String memberpassword;    // 회원비밀번호
	private String memberphonenumber; // 회원전화번호
	private String memberremove;   // 회원탈퇴여부
	private String memberislogin;     // 회원로그인여부
	private Date memberlastlogindate; // 회원마지막로그인날짜
	
	public Memberinfotbl() {
		super();
		//매개변수가 없는 생성자
	}
	
	//매개변수가 있는 생성자
		//이미 데이터가 존재하는 경우 set을 호출하지 않고 
		//한번에 초기화 할 목적으로 생성
	public Memberinfotbl(String membernickname, String membermail, String memberpassword, String memberphonenumber,
			String memberremove, String memberislogin, Date memberlastlogindate) {
		super();
		this.membernickname = membernickname;
		this.membermail = membermail;
		this.memberpassword = memberpassword;
		this.memberphonenumber = memberphonenumber;
		this.memberremove = memberremove;
		this.memberislogin = memberislogin;
		this.memberlastlogindate = memberlastlogindate;
	}

	public String getMembernickname() {
		return membernickname;
	}

	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}

	public String getMembermail() {
		return membermail;
	}

	public void setMembermail(String membermail) {
		this.membermail = membermail;
	}

	public String getMemberpassword() {
		return memberpassword;
	}

	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}

	public String getMemberphonenumber() {
		return memberphonenumber;
	}

	public void setMemberphonenumber(String memberphonenumber) {
		this.memberphonenumber = memberphonenumber;
	}

	public String getMemberremove() {
		return memberremove;
	}

	public void setMemberremove(String memberremove) {
		this.memberremove = memberremove;
	}

	public String getMemberislogin() {
		return memberislogin;
	}

	public void setMemberislogin(String memberislogin) {
		this.memberislogin = memberislogin;
	}

	public Date getMemberlastlogindate() {
		return memberlastlogindate;
	}

	public void setMemberlastlogindate(Date memberlastlogindate) {
		this.memberlastlogindate = memberlastlogindate;
	}

	@Override
	public String toString() {
		return "Memberinfotbl [membernickname=" + membernickname + ", membermail=" + membermail + ", memberpassword="
				+ memberpassword + ", memberphonenumber=" + memberphonenumber + ", memberremove=" + memberremove
				+ ", memberislogin=" + memberislogin + ", memberlastlogindate=" + memberlastlogindate + "]";
	}

	
}
