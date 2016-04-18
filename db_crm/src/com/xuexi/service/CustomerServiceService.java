package com.xuexi.service;

import java.util.List;
import java.util.Map;

import com.xuexi.entity.CustomerService;

/**
 * �ͻ�����Service�ӿ�
 * @author Administrator
 *
 */
public interface CustomerServiceService {

	/**
	 * ��ӿͻ�����
	 * @param customerService
	 * @return
	 */
	public int add(CustomerService customerService);
	
	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<CustomerService> find(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ������¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ŀͻ�����
	 * @param customerService
	 * @return
	 */
	public int update(CustomerService customerService);
}
