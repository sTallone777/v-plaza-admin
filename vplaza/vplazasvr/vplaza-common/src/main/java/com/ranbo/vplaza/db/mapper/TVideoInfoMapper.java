package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.TVideoInfo;

public interface TVideoInfoMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TVideoInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TVideoInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TVideoInfo selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TVideoInfo selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TVideoInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TVideoInfo record);
}