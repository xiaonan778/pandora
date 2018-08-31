package com.aikbc.pandora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aikbc.pandora.entity.MinerBasicInfo;
import com.aikbc.pandora.mapper.MinerBasicInfoMapper;
import com.aikbc.pandora.service.MinerBasicService;

/**
 * @author CJay
 * @date 2018年8月31日 上午10:04:58
 */
@Service
@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
public class MinerBasicInfoImpl implements MinerBasicService {
	
	@Autowired
	private MinerBasicInfoMapper dao;
	
	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#getList()
	 */
	@Override
	public List<MinerBasicInfo> getList(int pageNum,int pageSize) {
		// TODO Auto-generated method stub
//		PageHelper.startPage(pageNum,pageSize);
		return dao.getList();
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#insert(com.aikbc.pandora.entity.MinerBasicInfo)
	 */
	@Override
	public int insert(MinerBasicInfo record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#insertSelective(com.aikbc.pandora.entity.MinerBasicInfo)
	 */
	@Override
	public int insertSelective(MinerBasicInfo record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public MinerBasicInfo selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#updateByPrimaryKeySelective(com.aikbc.pandora.entity.MinerBasicInfo)
	 */
	@Override
	public int updateByPrimaryKeySelective(MinerBasicInfo record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	/* (non-Javadoc)
	 * @see com.aikbc.pandora.service.MinerBasicService#updateByPrimaryKey(com.aikbc.pandora.entity.MinerBasicInfo)
	 */
	@Override
	public int updateByPrimaryKey(MinerBasicInfo record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}


}
