package com.aikbc.pandora.service;

import java.util.List;

import com.aikbc.pandora.entity.MinerBasicInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 矿机基础信息 服务类
 * </p>
 *
 * @author CJay123
 * @since 2018-09-03
 */
public interface MinerBasicInfoService extends IService<MinerBasicInfo> {
	
	/**
	 * 新增矿机基本信息
	 * @param minerBasicInfo
	 * @return
	 */
	Integer addMinerBascInfo(MinerBasicInfo minerBasicInfo);
	
	/**
	 * 查询配置信息
	 * @return
	 */
	List<MinerBasicInfo> getMinerBascInfo();
}
