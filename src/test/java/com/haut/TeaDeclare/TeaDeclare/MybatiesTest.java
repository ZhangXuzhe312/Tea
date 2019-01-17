package com.haut.TeaDeclare.TeaDeclare;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.haut.dao.UserDao;
import com.haut.entity.LoginUser;


public class MybatiesTest {
	
	/*//创建SqlSessionFactory工厂类,为查询数据库开启一次会话
	public static SqlSession selSql() throws IOException{
		Reader resourceAsReader =Resources.getResourceAsReader("mybaties-config.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession openSession = sqlSessionFactory.openSession();//获取SqlSession实例
		return openSession;
	}
	
	//增删改 事务的SqlSession
	public static SqlSession openSession() throws IOException{
		Reader resourceAsReader =Resources.getResourceAsReader("mybaties-config.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession openSession = sqlSessionFactory.openSession(true);//自动提交 无参的需要手动调用commit()方法
		return openSession;
	}
	
	
	//接口式编程  查看
	//用junit注解测试不能有返回值?对          
	public LoginUser selUsers() throws IOException{
			//使用getMapper(接口名.class) 创建一个代理对象
			UserDao mapper = selSql().getMapper(UserDao.class);
			//代理对象.mapper sql映射文件XXXMapper.xml文件的id
			LoginUser selUser = mapper.selUser(111,"111");
			selSql().close();
			System.out.println(selUser.toString());
			return selUser;
			
	}
	
	//增加
	public boolean addUser(LoginUser u) throws IOException{
		UserDao mapper = openSession().getMapper(UserDao.class);
		boolean addUser = mapper.addUser(u);
		openSession().close();
		return addUser;
		
	}
	
	//删除用户
	public boolean delUser(LoginUser u) throws IOException{
		UserDao mapper =  openSession().getMapper(UserDao.class);
		boolean delUser = mapper.delUser(u);
		openSession().close();
		return delUser;
	}
	
	//修改密码
	public boolean updateUser(LoginUser u) throws IOException{
		UserDao mapper = openSession().getMapper(UserDao.class);
		boolean updateUser = mapper.updateUser(u);
		openSession().close();
		return updateUser;
	}
	
	//注解查询
	public LoginUser sel() throws IOException{
		UserDao mapper = openSession().getMapper(UserDao.class);
		LoginUser sel = mapper.sel(111);
		openSession().close();
		return sel;
	}
	
	public static void main(String[] args) {
		try {
			//查
			
			 LoginUser rs= new MybatiesTest().selUsers();
			 System.out.println(rs.toString());
			 
			
			//增加
			
			
			LoginUser loginUser = new LoginUser();
			loginUser.setUpass("666");
			System.out.println(new MybatiesTest().addUser(loginUser));
			
			
			//删除
			
		    LoginUser loginUser = new LoginUser();
			loginUser.setUid(111117);
			System.out.println(new MybatiesTest().delUser(loginUser));
			
			
			//修改密码
			
			LoginUser loginUser = new LoginUser();
			loginUser.setUid(111111);
			loginUser.setUpass("21313");
			System.out.println(new MybatiesTest().updateUser(loginUser));
			
			
			//注解sql
			System.out.println(new MybatiesTest().sel());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
