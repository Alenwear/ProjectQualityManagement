/**  
* @Project: baidu_ticket
* @Title: BaseMapper.java
* @Package: com.baidu.ticket.common.mapper
* @Description: 
* @author: isoftstone 
* @date: 2016-7-4 23:14:51
* @Copyright: 2016 www.isoftstone.com Inc. All rights reserved.
* @version: V1.0  
*/
package com.isoftstone.pqm;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *  
 *
 * @param <E> the element type
 * @ClassName: BaseMapper
 * @Description: 
 * @author: isoftstone
 * @date: 2016-7-4 23:14:51
 */
public interface BaseMapper <E extends Serializable> {
	
	/**
	 * Find list.
	 *
	 * @param params the params
	 * @return the list
	 */
	List<E> findList(Map<String, Object> params);
	
	/**
	 * Insert.
	 *
	 * @param e the e
	 * @return the int
	 */
	int insert(E e);
	
	/**
	 * Insert selective.
	 *
	 * @param e the e
	 * @return the int
	 */
	int insertSelective(E e);

	/**
	 * Update by primary key.
	 *
	 * @param e the e
	 * @return the int
	 */
	int updateByPrimaryKey(E e);

	/**
	 * Update by primary key selective.
	 *
	 * @param e the e
	 * @return the int
	 */
	int updateByPrimaryKeySelective(E e);

	/**
	 * Delete by primary key.
	 *
	 * @param id the id
	 * @return the int
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * Select by primary key.
	 *
	 * @param id the id
	 * @return the e
	 */
	E selectByPrimaryKey(String id);
}
