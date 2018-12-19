package cn.yyt.test1;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.source.mapper.UsersMapper;
import cn.source.pojo.Users;
import cn.source.pojo.UsersExample;
import cn.source.pojo.UsersExample.Criteria;


@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class test1 {
	
	@Autowired UsersMapper um;
	
	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		
	}
	
	
	@Test
	public void test11() {
		Users user=new Users();
		
		//增加
//		user.setUname("yyt");//赋值
//		user.setUpwd("yyt");//赋值
//		int insert = um.insert(user);
//		Syste.out.println("增加了"+insert+"条数据。主键是"+user.getUid());
		
		//删除
//		int deleteByPrimaryKey = um.deleteByPrimaryKey(1);
//		System.out.println("删除了"+deleteByPrimaryKey+"条数据");
		
		//根据object修改（每个数值都不能为空）
//		user.setUid(2);
//		user.setUname("aaa");
//		user.setUpwd("bbb");
//		int updateByPrimaryKey = um.updateByPrimaryKey(user);
//		System.out.println("修改了"+updateByPrimaryKey+"条数据");
		
		//传入主键和要修改的数据（动态sql）
//		user.setUid(2);
//		user.setUname("ddd");
//		int updateByPrimaryKeySelective = um.updateByPrimaryKeySelective(user);
//		System.out.println("修改了"+updateByPrimaryKeySelective+"条数据");
		
		//根据主键查询
//		Users selectByPrimaryKey = um.selectByPrimaryKey(2);
//		System.out.println(selectByPrimaryKey);
		
		//根据Exanple查询
		UsersExample ue=new UsersExample();//先创建  实体example类 然后设置查询规则
		ue.setOrderByClause("uId desc");//设置排序   asc升序,desc降序排列
		ue.setDistinct(false);//去除重复,true是选择不重复记录,false反之
		UsersExample.Criteria cri=ue.createCriteria();//构造自定义查询条件
		cri.andUnameIsNotNull();//查询不是null的
		
		
		List<Users> selectByExample = um.selectByExample(ue);
		for (Users users : selectByExample) {
			System.out.println(users.getUname());
		}
	}
	
	
//	@Test
//	public void test2() {
//		Users user=new Users();
//		user.setUname("yyt");
//		user.setUpwd("yyt");
//		int insert = um.insert(user);
//		System.out.println("增加了"+insert+"条数据。主键是"+user.getUid());
//	}

}
