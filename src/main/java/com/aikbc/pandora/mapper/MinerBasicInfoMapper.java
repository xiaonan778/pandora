package com.aikbc.pandora.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aikbc.pandora.entity.MinerBasicInfo;

@Mapper
public interface MinerBasicInfoMapper {
	
	List<MinerBasicInfo> getList();
	
    int deleteByPrimaryKey(String id);

    int insert(MinerBasicInfo record);

    int insertSelective(MinerBasicInfo record);

    MinerBasicInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MinerBasicInfo record);

    int updateByPrimaryKey(MinerBasicInfo record);
    
}