package com.hiring.service;

import java.util.List;

import com.hiring.bean.Recruit;
import com.hiring.bean.obj.RecruitObj;
import com.hiring.framework.Page;

public interface RecruitService extends BaseService<Recruit>
	{

	String serv_name = "recruitService";

	List<RecruitObj> findPageObj(Page page);
	
	List<RecruitObj> findAll();

	List<RecruitObj> findPageObjByName(Page page, String name);
	
	int countObjByName(String name);
	
	RecruitObj get(String id);
	}
