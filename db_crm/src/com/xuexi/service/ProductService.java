package com.xuexi.service;

import java.util.List;
import java.util.Map;

import com.xuexi.entity.Product;

/**
 * ��ƷService�ӿ�
 * @author Administrator
 *
 */
public interface ProductService {

	/**
	 * ��ѯ��Ʒ����
	 * @param map
	 * @return
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
}
