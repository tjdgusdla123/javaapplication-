package domain;

import java.util.Date;

public class Storebasicinfo {
	private String storenickname;    // 가게닉네임
	private String	storename;       // 업소명
	private String	storeCEO;      // 영업자성명
	private String	storeaddress;    // 주소
	private String	storeshopnumber; // 가게전화번호
	private String	storesector;      // 업종
	private String	storeopentime;    // 영업시간
	private String	storeholiyday;    // 휴무일
	private String	storeintroduce;    // 가게소개
	private int	storetablecount;       // 테이블수
	private String	storeparking;      // 주차여부
	private String	storebusinessnumber; // 사업자번호
	private Date	storegrandopening;   // 개업일
	private String storeCEOphonenumber;   // 영업자전화번호
	private String	storehomepage;      // 홈페이지
	private String storephoto;       // 가게사진
	public Storebasicinfo() {
		super();
		
	}
	public Storebasicinfo(String storenickname, String storename, String storeCEO, String storeaddress,
			String storeshopnumber, String storesector, String storeopentime, String storeholiyday,
			String storeintroduce, int storetablecount, String storeparking, String storebusinessnumber,
			Date storegrandopening, String storeCEOphonenumber, String storehomepage, String storephoto) {
		super();
		this.storenickname = storenickname;
		this.storename = storename;
		this.storeCEO = storeCEO;
		this.storeaddress = storeaddress;
		this.storeshopnumber = storeshopnumber;
		this.storesector = storesector;
		this.storeopentime = storeopentime;
		this.storeholiyday = storeholiyday;
		this.storeintroduce = storeintroduce;
		this.storetablecount = storetablecount;
		this.storeparking = storeparking;
		this.storebusinessnumber = storebusinessnumber;
		this.storegrandopening = storegrandopening;
		this.storeCEOphonenumber = storeCEOphonenumber;
		this.storehomepage = storehomepage;
		this.storephoto = storephoto;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStoreCEO() {
		return storeCEO;
	}
	public void setStoreCEO(String storeCEO) {
		this.storeCEO = storeCEO;
	}
	public String getStoreaddress() {
		return storeaddress;
	}
	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}
	public String getStoreshopnumber() {
		return storeshopnumber;
	}
	public void setStoreshopnumber(String storeshopnumber) {
		this.storeshopnumber = storeshopnumber;
	}
	public String getStoresector() {
		return storesector;
	}
	public void setStoresector(String storesector) {
		this.storesector = storesector;
	}
	public String getStoreopentime() {
		return storeopentime;
	}
	public void setStoreopentime(String storeopentime) {
		this.storeopentime = storeopentime;
	}
	public String getStoreholiyday() {
		return storeholiyday;
	}
	public void setStoreholiyday(String storeholiyday) {
		this.storeholiyday = storeholiyday;
	}
	public String getStoreintroduce() {
		return storeintroduce;
	}
	public void setStoreintroduce(String storeintroduce) {
		this.storeintroduce = storeintroduce;
	}
	public int getStoretablecount() {
		return storetablecount;
	}
	public void setStoretablecount(int storetablecount) {
		this.storetablecount = storetablecount;
	}
	public String getStoreparking() {
		return storeparking;
	}
	public void setStoreparking(String storeparking) {
		this.storeparking = storeparking;
	}
	public String getStorebusinessnumber() {
		return storebusinessnumber;
	}
	public void setStorebusinessnumber(String storebusinessnumber) {
		this.storebusinessnumber = storebusinessnumber;
	}
	public Date getStoregrandopening() {
		return storegrandopening;
	}
	public void setStoregrandopening(Date storegrandopening) {
		this.storegrandopening = storegrandopening;
	}
	public String getStoreCEOphonenumber() {
		return storeCEOphonenumber;
	}
	public void setStoreCEOphonenumber(String storeCEOphonenumber) {
		this.storeCEOphonenumber = storeCEOphonenumber;
	}
	public String getStorehomepage() {
		return storehomepage;
	}
	public void setStorehomepage(String storehomepage) {
		this.storehomepage = storehomepage;
	}
	public String getStorephoto() {
		return storephoto;
	}
	public void setStorephoto(String storephoto) {
		this.storephoto = storephoto;
	}
	@Override
	public String toString() {
		return "storebasicinfo [storenickname=" + storenickname + ", storename=" + storename + ", storeCEO=" + storeCEO
				+ ", storeaddress=" + storeaddress + ", storeshopnumber=" + storeshopnumber + ", storesector="
				+ storesector + ", storeopentime=" + storeopentime + ", storeholiyday=" + storeholiyday
				+ ", storeintroduce=" + storeintroduce + ", storetablecount=" + storetablecount + ", storeparking="
				+ storeparking + ", storebusinessnumber=" + storebusinessnumber + ", storegrandopening="
				+ storegrandopening + ", storeCEOphonenumber=" + storeCEOphonenumber + ", storehomepage="
				+ storehomepage + ", storephoto=" + storephoto + "]";
	}
	
	
}
