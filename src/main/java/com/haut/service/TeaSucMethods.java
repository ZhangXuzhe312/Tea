package com.haut.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.haut.entity.TeaDetail;
import com.haut.util.DBSession;

public class TeaSucMethods {
	//遍历当前登录的教师信息
	public List<TeaDetail> selTeaInfoById(){
		SqlSession openSession=null;
		try {
			openSession=DBSession.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
