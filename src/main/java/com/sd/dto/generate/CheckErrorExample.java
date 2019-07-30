package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckErrorExample() {
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

        public Criteria andErrorNbrIsNull() {
            addCriterion("ERROR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andErrorNbrIsNotNull() {
            addCriterion("ERROR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNbrEqualTo(String value) {
            addCriterion("ERROR_NBR =", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrNotEqualTo(String value) {
            addCriterion("ERROR_NBR <>", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrGreaterThan(String value) {
            addCriterion("ERROR_NBR >", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_NBR >=", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrLessThan(String value) {
            addCriterion("ERROR_NBR <", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrLessThanOrEqualTo(String value) {
            addCriterion("ERROR_NBR <=", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrLike(String value) {
            addCriterion("ERROR_NBR like", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrNotLike(String value) {
            addCriterion("ERROR_NBR not like", value, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrIn(List<String> values) {
            addCriterion("ERROR_NBR in", values, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrNotIn(List<String> values) {
            addCriterion("ERROR_NBR not in", values, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrBetween(String value1, String value2) {
            addCriterion("ERROR_NBR between", value1, value2, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorNbrNotBetween(String value1, String value2) {
            addCriterion("ERROR_NBR not between", value1, value2, "errorNbr");
            return (Criteria) this;
        }

        public Criteria andErrorTypIsNull() {
            addCriterion("ERROR_TYP is null");
            return (Criteria) this;
        }

        public Criteria andErrorTypIsNotNull() {
            addCriterion("ERROR_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTypEqualTo(String value) {
            addCriterion("ERROR_TYP =", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypNotEqualTo(String value) {
            addCriterion("ERROR_TYP <>", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypGreaterThan(String value) {
            addCriterion("ERROR_TYP >", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_TYP >=", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypLessThan(String value) {
            addCriterion("ERROR_TYP <", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypLessThanOrEqualTo(String value) {
            addCriterion("ERROR_TYP <=", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypLike(String value) {
            addCriterion("ERROR_TYP like", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypNotLike(String value) {
            addCriterion("ERROR_TYP not like", value, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypIn(List<String> values) {
            addCriterion("ERROR_TYP in", values, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypNotIn(List<String> values) {
            addCriterion("ERROR_TYP not in", values, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypBetween(String value1, String value2) {
            addCriterion("ERROR_TYP between", value1, value2, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorTypNotBetween(String value1, String value2) {
            addCriterion("ERROR_TYP not between", value1, value2, "errorTyp");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNull() {
            addCriterion("ERROR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNotNull() {
            addCriterion("ERROR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDescEqualTo(String value) {
            addCriterion("ERROR_DESC =", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotEqualTo(String value) {
            addCriterion("ERROR_DESC <>", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThan(String value) {
            addCriterion("ERROR_DESC >", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC >=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThan(String value) {
            addCriterion("ERROR_DESC <", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC <=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLike(String value) {
            addCriterion("ERROR_DESC like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotLike(String value) {
            addCriterion("ERROR_DESC not like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescIn(List<String> values) {
            addCriterion("ERROR_DESC in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotIn(List<String> values) {
            addCriterion("ERROR_DESC not in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescBetween(String value1, String value2) {
            addCriterion("ERROR_DESC between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotBetween(String value1, String value2) {
            addCriterion("ERROR_DESC not between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrIsNull() {
            addCriterion("PLAT_SEQ_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrIsNotNull() {
            addCriterion("PLAT_SEQ_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR =", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR <>", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrGreaterThan(String value) {
            addCriterion("PLAT_SEQ_NBR >", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR >=", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLessThan(String value) {
            addCriterion("PLAT_SEQ_NBR <", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLessThanOrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR <=", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLike(String value) {
            addCriterion("PLAT_SEQ_NBR like", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotLike(String value) {
            addCriterion("PLAT_SEQ_NBR not like", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrIn(List<String> values) {
            addCriterion("PLAT_SEQ_NBR in", values, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotIn(List<String> values) {
            addCriterion("PLAT_SEQ_NBR not in", values, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrBetween(String value1, String value2) {
            addCriterion("PLAT_SEQ_NBR between", value1, value2, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotBetween(String value1, String value2) {
            addCriterion("PLAT_SEQ_NBR not between", value1, value2, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andErrorStatusIsNull() {
            addCriterion("ERROR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andErrorStatusIsNotNull() {
            addCriterion("ERROR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andErrorStatusEqualTo(String value) {
            addCriterion("ERROR_STATUS =", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusNotEqualTo(String value) {
            addCriterion("ERROR_STATUS <>", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusGreaterThan(String value) {
            addCriterion("ERROR_STATUS >", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_STATUS >=", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusLessThan(String value) {
            addCriterion("ERROR_STATUS <", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusLessThanOrEqualTo(String value) {
            addCriterion("ERROR_STATUS <=", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusLike(String value) {
            addCriterion("ERROR_STATUS like", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusNotLike(String value) {
            addCriterion("ERROR_STATUS not like", value, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusIn(List<String> values) {
            addCriterion("ERROR_STATUS in", values, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusNotIn(List<String> values) {
            addCriterion("ERROR_STATUS not in", values, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusBetween(String value1, String value2) {
            addCriterion("ERROR_STATUS between", value1, value2, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andErrorStatusNotBetween(String value1, String value2) {
            addCriterion("ERROR_STATUS not between", value1, value2, "errorStatus");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNull() {
            addCriterion("TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(BigDecimal value) {
            addCriterion("TRANS_AMT >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(BigDecimal value) {
            addCriterion("TRANS_AMT <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMT in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMT not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMT between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMT not between", value1, value2, "transAmt");
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