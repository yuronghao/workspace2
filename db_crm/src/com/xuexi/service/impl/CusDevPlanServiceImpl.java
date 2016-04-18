package com.xuexi.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xuexi.dao.CusDevPlanDao;
import com.xuexi.entity.CusDevPlan;
import com.xuexi.service.CusDevPlanService;

/**
 * 客户开发计划Service实现类
 * @author Administrator
 *
 */
@Service("cusDevPlanService")
public class CusDevPlanServiceImpl implements CusDevPlanService{

	@Resource
	private CusDevPlanDao cusDevPlanDao;
	
	@Override
	public List<CusDevPlan> find(Map<String, Object> map) {
		return cusDevPlanDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return cusDevPlanDao.getTotal(map);
	}

	@Override
	public int update(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.update(cusDevPlan);
	}

	@Override
	public int add(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.add(cusDevPlan);
	}

	@Override
	public int delete(Integer id) {
		return cusDevPlanDao.delete(id);
	}

}
