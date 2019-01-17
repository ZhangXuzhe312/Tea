package com.haut.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBSession {


	public static SqlSession openSession() throws IOException{
		Reader resourceAsReader =Resources.getResourceAsReader("mybaties-config.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession openSession = sqlSessionFactory.openSession();//获取SqlSession实例
		return openSession;
	}
	
}
