package com.sd.batch.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerOrderSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerOrderSumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSettleNbrIsNull() {
            addCriterion("SETTLE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSettleNbrIsNotNull() {
            addCriterion("SETTLE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSettleNbrEqualTo(String value) {
            addCriterion("SETTLE_NBR =", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrNotEqualTo(String value) {
            addCriterion("SETTLE_NBR <>", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrGreaterThan(String value) {
            addCriterion("SETTLE_NBR >", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_NBR >=", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrLessThan(String value) {
            addCriterion("SETTLE_NBR <", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_NBR <=", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrLike(String value) {
            addCriterion("SETTLE_NBR like", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrNotLike(String value) {
            addCriterion("SETTLE_NBR not like", value, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrIn(List<String> values) {
            addCriterion("SETTLE_NBR in", values, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrNotIn(List<String> values) {
            addCriterion("SETTLE_NBR not in", values, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrBetween(String value1, String value2) {
            addCriterion("SETTLE_NBR between", value1, value2, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andSettleNbrNotBetween(String value1, String value2) {
            addCriterion("SETTLE_NBR not between", value1, value2, "settleNbr");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNull() {
            addCriterion("MER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNotNull() {
            addCriterion("MER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerNoEqualTo(String value) {
            addCriterion("MER_NO =", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotEqualTo(String value) {
            addCriterion("MER_NO <>", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThan(String value) {
            addCriterion("MER_NO >", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NO >=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThan(String value) {
            addCriterion("MER_NO <", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThanOrEqualTo(String value) {
            addCriterion("MER_NO <=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLike(String value) {
            addCriterion("MER_NO like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotLike(String value) {
            addCriterion("MER_NO not like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoIn(List<String> values) {
            addCriterion("MER_NO in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotIn(List<String> values) {
            addCriterion("MER_NO not in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoBetween(String value1, String value2) {
            addCriterion("MER_NO between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotBetween(String value1, String value2) {
            addCriterion("MER_NO not between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andClearDateIsNull() {
            addCriterion("CLEAR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClearDateIsNotNull() {
            addCriterion("CLEAR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClearDateEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE =", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE <>", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE >", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE >=", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateLessThan(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE <", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_DATE <=", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateIn(List<Date> values) {
            addCriterionForJDBCDate("CLEAR_DATE in", values, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEAR_DATE not in", values, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEAR_DATE between", value1, value2, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEAR_DATE not between", value1, value2, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNull() {
            addCriterion("CLEAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNotNull() {
            addCriterion("CLEAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEAR_TIME <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CLEAR_TIME in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEAR_TIME not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEAR_TIME between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEAR_TIME not between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNull() {
            addCriterion("TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNotNull() {
            addCriterion("TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT =", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT <>", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AMT >", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT >=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_AMT <", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT <=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMT in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMT not in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMT between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMT not between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtIsNull() {
            addCriterion("TOTAL_SUCCESS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtIsNotNull() {
            addCriterion("TOTAL_SUCCESS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT =", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT <>", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT >", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT >=", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT <", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SUCCESS_AMT <=", value, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SUCCESS_AMT in", values, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SUCCESS_AMT not in", values, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SUCCESS_AMT between", value1, value2, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SUCCESS_AMT not between", value1, value2, "totalSuccessAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtIsNull() {
            addCriterion("TOTAL_FAIL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtIsNotNull() {
            addCriterion("TOTAL_FAIL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT =", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT <>", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT >", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT >=", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT <", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FAIL_AMT <=", value, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FAIL_AMT in", values, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FAIL_AMT not in", values, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FAIL_AMT between", value1, value2, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFailAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FAIL_AMT not between", value1, value2, "totalFailAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtIsNull() {
            addCriterion("TOTAL_UNCHECK_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtIsNotNull() {
            addCriterion("TOTAL_UNCHECK_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT =", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT <>", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT >", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT >=", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT <", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_UNCHECK_AMT <=", value, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_UNCHECK_AMT in", values, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_UNCHECK_AMT not in", values, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_UNCHECK_AMT between", value1, value2, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_UNCHECK_AMT not between", value1, value2, "totalUncheckAmt");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountIsNull() {
            addCriterion("TOTAL_SUCCESS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountIsNotNull() {
            addCriterion("TOTAL_SUCCESS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountEqualTo(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT =", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT <>", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountGreaterThan(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT >", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT >=", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountLessThan(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT <", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SUCCESS_COUNT <=", value, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountIn(List<Integer> values) {
            addCriterion("TOTAL_SUCCESS_COUNT in", values, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_SUCCESS_COUNT not in", values, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SUCCESS_COUNT between", value1, value2, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalSuccessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SUCCESS_COUNT not between", value1, value2, "totalSuccessCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountIsNull() {
            addCriterion("TOTAL_FAIL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountIsNotNull() {
            addCriterion("TOTAL_FAIL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountEqualTo(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT =", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT <>", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountGreaterThan(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT >", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT >=", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountLessThan(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT <", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_FAIL_COUNT <=", value, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountIn(List<Integer> values) {
            addCriterion("TOTAL_FAIL_COUNT in", values, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_FAIL_COUNT not in", values, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_FAIL_COUNT between", value1, value2, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_FAIL_COUNT not between", value1, value2, "totalFailCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountIsNull() {
            addCriterion("TOTAL_UNCHECK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountIsNotNull() {
            addCriterion("TOTAL_UNCHECK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountEqualTo(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT =", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT <>", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountGreaterThan(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT >", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT >=", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountLessThan(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT <", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_UNCHECK_COUNT <=", value, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountIn(List<Integer> values) {
            addCriterion("TOTAL_UNCHECK_COUNT in", values, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_UNCHECK_COUNT not in", values, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_UNCHECK_COUNT between", value1, value2, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalUncheckCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_UNCHECK_COUNT not between", value1, value2, "totalUncheckCount");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtIsNull() {
            addCriterion("TOTAL_FEE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtIsNotNull() {
            addCriterion("TOTAL_FEE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT =", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT <>", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT >", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT >=", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT <", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE_AMT <=", value, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FEE_AMT in", values, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FEE_AMT not in", values, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FEE_AMT between", value1, value2, "totalFeeAmt");
            return (Criteria) this;
        }

        public Criteria andTotalFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FEE_AMT not between", value1, value2, "totalFeeAmt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}