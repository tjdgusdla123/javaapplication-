package test;

import org.junit.Test;

import dao.UserDao;

public class TestDao {

	@Test
	public void emailCheck() {
		UserDao dao = UserDao.sharedInstance();
		System.out.println(
			dao.emailCheck("ggangpae2@gmail.com"));
	}
}
