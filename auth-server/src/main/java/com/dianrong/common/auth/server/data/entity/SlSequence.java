package com.dianrong.common.auth.server.data.entity;

import java.math.BigDecimal;

public class SlSequence {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$SEQUENCE.NAME
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$SEQUENCE.CNT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private BigDecimal cnt;
    
    /**.
     *  辅助字段，用于保存cnt的值
     */
    private BigDecimal tempCnt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$SEQUENCE.NAME
     *
     * @return the value of SL$SEQUENCE.NAME
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$SEQUENCE.NAME
     *
     * @param name the value for SL$SEQUENCE.NAME
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$SEQUENCE.CNT
     *
     * @return the value of SL$SEQUENCE.CNT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$SEQUENCE.CNT
     *
     * @param cnt the value for SL$SEQUENCE.CNT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setCnt(BigDecimal cnt) {
        this.cnt = cnt;
    }

	/**
	 * @return the tempCnt
	 */
	public BigDecimal getTempCnt() {
		return tempCnt;
	}

	/**
	 * @param tempCnt the tempCnt to set
	 */
	public void setTempCnt(BigDecimal tempCnt) {
		this.tempCnt = tempCnt;
	}
}