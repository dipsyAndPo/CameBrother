package cn.yyt.test1;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.source.mapper.MouldMapper;
import cn.source.mapper.UsersMapper;
import cn.source.pojo.Mould;
import cn.source.pojo.Tarde;
import cn.source.pojo.Users;
import cn.source.service.MouldService;


@RunWith(SpringJUnit4ClassRunner.class) //琛ㄧず缁ф壙浜哠pringJUnit4ClassRunner绫�
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class test1 {
	
	@Autowired UsersMapper um;
	@Autowired MouldMapper mou;
	@Autowired MouldService ms;
	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		
	}
	
	@Test
	public void test() {
		Mould mould = mou.selectByPrimaryKey(5);
		System.out.println(mould);
		
	}
	
	@Test
	public void test11() {
		Users user=new Users();
		
		//澧炲姞
//		user.setUname("yyt");//璧嬪��
//		user.setUpwd("yyt");//璧嬪��
//		int insert = um.insert(user);
//		Syste.out.println("澧炲姞浜�"+insert+"鏉℃暟鎹�備富閿槸"+user.getUid());
		
		//鍒犻櫎
//		int deleteByPrimaryKey = um.deleteByPrimaryKey(1);
//		System.out.println("鍒犻櫎浜�"+deleteByPrimaryKey+"鏉℃暟鎹�");
		
		//鏍规嵁object淇敼锛堟瘡涓暟鍊奸兘涓嶈兘涓虹┖锛�
//		user.setUid(2);
//		user.setUname("aaa");
//		user.setUpwd("bbb");
//		int updateByPrimaryKey = um.updateByPrimaryKey(user);
//		System.out.println("淇敼浜�"+updateByPrimaryKey+"鏉℃暟鎹�");
		
		//浼犲叆涓婚敭鍜岃淇敼鐨勬暟鎹紙鍔ㄦ�乻ql锛�
//		user.setUid(2);
//		user.setUname("ddd");
//		int updateByPrimaryKeySelective = um.updateByPrimaryKeySelective(user);
//		System.out.println("淇敼浜�"+updateByPrimaryKeySelective+"鏉℃暟鎹�");
		
		//鏍规嵁涓婚敭鏌ヨ
//		Users selectByPrimaryKey = um.selectByPrimaryKey(2);
//		System.out.println(selectByPrimaryKey);
		
		//鏍规嵁Exanple鏌ヨ
		
		
	}
	
	
//	@Test
//	public void test2() {
//		Users user=new Users();
//		user.setUname("yyt");
//		user.setUpwd("yyt");
//		int insert = um.insert(user);
//		System.out.println("澧炲姞浜�"+insert+"鏉℃暟鎹�備富閿槸"+user.getUid());
//	}

}
