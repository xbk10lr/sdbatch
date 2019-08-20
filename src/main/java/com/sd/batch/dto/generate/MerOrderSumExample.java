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

        public Criteria andMerNbrIsNull() {
            addCriterion("MER_NBR is null");
            return (Criteria) this;
        }

        public Criteria andMerNbrIsNotNull() {
            addCriterion("MER_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerNbrEqualTo(String value) {
            addCriterion("MER_NBR =", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrNotEqualTo(String value) {
            addCriterion("MER_NBR <>", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrGreaterThan(String value) {
            addCriterion("MER_NBR >", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NBR >=", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrLessThan(String value) {
            addCriterion("MER_NBR <", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrLessThanOrEqualTo(String value) {
            addCriterion("MER_NBR <=", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrLike(String value) {
            addCriterion("MER_NBR like", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrNotLike(String value) {
            addCriterion("MER_NBR not like", value, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrIn(List<String> values) {
            addCriterion("MER_NBR in", values, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrNotIn(List<String> values) {
            addCriterion("MER_NBR not in", values, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrBetween(String value1, String value2) {
            addCriterion("MER_NBR between", value1, value2, "merNbr");
            return (Criteria) this;
        }

        public Criteria andMerNbrNotBetween(String value1, String value2) {
            addCriterion("MER_NBR not between", value1, value2, "merNbr");
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
            addCriterion("CLEAR_TIME =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(Date value) {
            addCriterion("CLEAR_TIME <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(Date value) {
            addCriterion("CLEAR_TIME >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLEAR_TIME >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(Date value) {
            addCriterion("CLEAR_TIME <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLEAR_TIME <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<Date> values) {
            addCriterion("CLEAR_TIME in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<Date> values) {
            addCriterion("CLEAR_TIME not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(Date value1, Date value2) {
            addCriterion("CLEAR_TIME between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLEAR_TIME not between", value1, value2, "clearTime");
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