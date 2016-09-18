import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.scyy.dao.UserDao;
import com.scyy.domain.Users;

@Transactional
public class TestUser {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save(Users u){
		userDao.save(u);
	}
	/**
	 * this.username = username;
		this.name = name;
		this.password = password;
		this.adddate = adddate;
		this.editdate = editdate;
		this.editwho = editwho;
		this.job = job;
		this.feed = feed;
		this.corp = corp;
		this.type = type;
		this.pos = pos;
		this.depid = depid;
	 * @param args
	 */
	public static void main(String[] args) {
		Users admin = new Users();
		admin.setUsername("lyh");
		admin.setName("刘一寰");
		admin.setPassword("123");
		admin.setAdddate(new Date());
		admin.setEditdate(new Date());
		admin.setEditwho("INSTALL");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestUser t = (TestUser)context.getBean("testUser");
		t.save(admin);
		System.out.println("OK");
	}
	
}
