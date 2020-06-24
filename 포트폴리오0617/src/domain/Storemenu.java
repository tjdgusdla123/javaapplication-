package domain;

public class Storemenu {

	private String	menucode;    //메뉴코드
	private String	menuname;    // 메뉴명
	private String	menuinfo;    // 메뉴설명
	private int 	menuprice;    // 메뉴가격
	private String	storenickname; //가게닉네임
	private String	menuphoto;   // 메뉴사진
	public Storemenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Storemenu(String menucode, String menuname, String menuinfo, int menuprice, String storenickname,
			String menuphoto) {
		super();
		this.menucode = menucode;
		this.menuname = menuname;
		this.menuinfo = menuinfo;
		this.menuprice = menuprice;
		this.storenickname = storenickname;
		this.menuphoto = menuphoto;
	}
	public String getMenucode() {
		return menucode;
	}
	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuinfo() {
		return menuinfo;
	}
	public void setMenuinfo(String menuinfo) {
		this.menuinfo = menuinfo;
	}
	public int getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(int menuprice) {
		this.menuprice = menuprice;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	public String getMenuphoto() {
		return menuphoto;
	}
	public void setMenuphoto(String menuphoto) {
		this.menuphoto = menuphoto;
	}
	@Override
	public String toString() {
		return "Storemenu [menucode=" + menucode + ", menuname=" + menuname + ", menuinfo=" + menuinfo + ", menuprice="
				+ menuprice + ", storenickname=" + storenickname + ", menuphoto=" + menuphoto + "]";
	}
	
}
