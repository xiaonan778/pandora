package com.aikbc.pandora.service.impl;

import com.aikbc.pandora.entity.MinerBasicInfo;
import com.aikbc.pandora.dao.MinerBasicInfoMapper;
import com.aikbc.pandora.service.MinerBasicInfoService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 矿机基础信息 服务实现类
 * </p>
 *
 * @author CJay123
 * @since 2018-09-03
 */
@Service
public class MinerBasicInfoServiceImpl extends ServiceImpl<MinerBasicInfoMapper, MinerBasicInfo> implements MinerBasicInfoService {
	private static Logger log = LoggerFactory.getLogger(MinerBasicInfoService.class);
	
	@Autowired
	private MinerBasicInfoMapper minerBasicInfoMapper;
	
	public Integer addMinerBascInfo(MinerBasicInfo minerBasicInfo){
		if(minerBasicInfo.getId().length()==0){
			log.error("miner_basic_info主键不能为空");
			return 0;
		}
		return minerBasicInfoMapper.insert(minerBasicInfo);
	}
	
	public List<MinerBasicInfo> getMinerBascInfo(){
		return minerBasicInfoMapper.selectList( new EntityWrapper<MinerBasicInfo>());
	}
	
}
