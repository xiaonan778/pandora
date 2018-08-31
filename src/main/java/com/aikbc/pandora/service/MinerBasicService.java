package com.aikbc.pandora.service;


import java.util.List;

import com.aikbc.pandora.entity.MinerBasicInfo;

/**
 * @author CJay
 * @date 2018年8月31日 上午10:03:15
 */
public interface MinerBasicService {
	
	List<MinerBasicInfo> getList(int pageNum,int pageSize);
	
	int deleteByPrimaryKey(String id);

    int insert(MinerBasicInfo record);

    int insertSelective(MinerBasicInfo record);

    MinerBasicInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MinerBasicInfo record);

    int updateByPrimaryKey(MinerBasicInfo record);
}
