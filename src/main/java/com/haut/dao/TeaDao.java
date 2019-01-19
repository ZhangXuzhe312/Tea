package com.haut.dao;

import java.util.List;

import com.haut.entity.TeaDetail;

public interface TeaDao {
	
	//查看教师信息
	
	public List<TeaDetail> selTeaInfoById(int id); 

}
