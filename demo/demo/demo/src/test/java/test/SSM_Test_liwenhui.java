package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.qbb.model.User;
import com.qbb.service.UserService;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-bean.xml",
		"classpath:spring-mybatis.xml",
		})
public class SSM_Test_liwenhui  {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(SSM_Test_liwenhui.class);

	@Resource
	ApplicationContext ctx;
	@Resource
	SqlSessionFactory sqlSessionFactory;
	@Resource 
	UserService userService;
	
	@Test
	public void MybatisList() {
		if (logger.isInfoEnabled()) {
			logger.info("MybatisList()"+sqlSessionFactory); //$NON-NLS-1$
		}
	}
	
	/**
	 *  @功能:增加用户测试
	 *  @作者:李文辉 
	 *  @代号:ab
	 *  @时间:2017年5月19日  
	 */
	@Test
	public void saveUser(){
		User user=new User();
		user.setName("Tom");
		int insert = userService.insert(user);
		if (logger.isInfoEnabled()) {
			logger.info("saveUser() - int insert={}", insert); //$NON-NLS-1$
		}
		
	}
	
	/**
	 *  @功能:查询全部用户
	 *  @作者:李文辉 
	 *  @代号:ab
	 *  @时间:2017年5月19日  
	 */
	@Test
	public void getAll(){
		List<User> userAll = userService.getUserAll();
		for (User user : userAll) {
			System.out.println(user.getName());
		}
	}
	
}

