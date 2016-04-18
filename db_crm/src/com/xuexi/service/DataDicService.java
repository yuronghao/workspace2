package com.xuexi.service;

import java.util.List;
import java.util.Map;

import com.xuexi.entity.DataDic;

/**
 * �����ֵ�Service�ӿ�
 * @author Administrator
 *
 */
public interface DataDicService {

	/**
	 * ��ѯ�����ֵ伯��
	 * @param map
	 * @return
	 */
	public List<DataDic> find(Map<String,Object> map);
	
	/**
	 * ��ѯ���е������ֵ����Ƽ���
	 * @return
	 */
	public List<DataDic> findAll();
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸������ֵ�
	 * @param dataDic
	 * @return
	 */
	public int update(DataDic dataDic);
	
	/**
	 * ��������ֵ�
	 * @param dataDic
	 * @return
	 */
	public int add(DataDic dataDic);
	
	/**
	 * ɾ�������ֵ�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
