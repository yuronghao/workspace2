package com.xuexi.dao;

import java.util.List;
import java.util.Map;

import com.xuexi.entity.CusDevPlan;

/**
 * �ͻ������ƻ�Dao�ӿ�
 * @author Administrator
 *
 */
public interface CusDevPlanDao {

	
	/**
	 * ��ѯ�ͻ������ƻ�����
	 * @param map
	 * @return
	 */
	public List<CusDevPlan> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ŀͻ������ƻ�
	 * @param cusDevPlan
	 * @return
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 * ��ӿͻ������ƻ�
	 * @param cusDevPlan
	 * @return
	 */
	public int add(CusDevPlan cusDevPlan);
	
	/**
	 * ɾ���ͻ������ƻ�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
