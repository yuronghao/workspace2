package com.xuexi.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xuexi.dao.CustomerServiceDao;
import com.xuexi.entity.CustomerService;
import com.xuexi.service.CustomerServiceService;

/**
 * �ͷ�����Serviceʵ����
 * @author Administrator
 *
 */
@Service("customerServiceService")
public class CustomerServiceServiceImpl implements CustomerServiceService{

	@Resource
	private CustomerServiceDao customerServiceDao;
	
	@Override
	public int add(com.xuexi.entity.CustomerService customerService) {
		return customerServiceDao.add(customerService);
	}

	@Override
	public List<CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}

	

}
