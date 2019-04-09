package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckerrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckerrorExample() {
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

        public Criteria andErrornbrIsNull() {
            addCriterion("ERRORNBR is null");
            return (Criteria) this;
        }

        public Criteria andErrornbrIsNotNull() {
            addCriterion("ERRORNBR is not null");
            return (Criteria) this;
        }

        public Criteria andErrornbrEqualTo(String value) {
            addCriterion("ERRORNBR =", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrNotEqualTo(String value) {
            addCriterion("ERRORNBR <>", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrGreaterThan(String value) {
            addCriterion("ERRORNBR >", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORNBR >=", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrLessThan(String value) {
            addCriterion("ERRORNBR <", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrLessThanOrEqualTo(String value) {
            addCriterion("ERRORNBR <=", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrLike(String value) {
            addCriterion("ERRORNBR like", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrNotLike(String value) {
            addCriterion("ERRORNBR not like", value, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrIn(List<String> values) {
            addCriterion("ERRORNBR in", values, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrNotIn(List<String> values) {
            addCriterion("ERRORNBR not in", values, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrBetween(String value1, String value2) {
            addCriterion("ERRORNBR between", value1, value2, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrornbrNotBetween(String value1, String value2) {
            addCriterion("ERRORNBR not between", value1, value2, "errornbr");
            return (Criteria) this;
        }

        public Criteria andErrortypIsNull() {
            addCriterion("ERRORTYP is null");
            return (Criteria) this;
        }

        public Criteria andErrortypIsNotNull() {
            addCriterion("ERRORTYP is not null");
            return (Criteria) this;
        }

        public Criteria andErrortypEqualTo(String value) {
            addCriterion("ERRORTYP =", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypNotEqualTo(String value) {
            addCriterion("ERRORTYP <>", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypGreaterThan(String value) {
            addCriterion("ERRORTYP >", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORTYP >=", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypLessThan(String value) {
            addCriterion("ERRORTYP <", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypLessThanOrEqualTo(String value) {
            addCriterion("ERRORTYP <=", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypLike(String value) {
            addCriterion("ERRORTYP like", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypNotLike(String value) {
            addCriterion("ERRORTYP not like", value, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypIn(List<String> values) {
            addCriterion("ERRORTYP in", values, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypNotIn(List<String> values) {
            addCriterion("ERRORTYP not in", values, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypBetween(String value1, String value2) {
            addCriterion("ERRORTYP between", value1, value2, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrortypNotBetween(String value1, String value2) {
            addCriterion("ERRORTYP not between", value1, value2, "errortyp");
            return (Criteria) this;
        }

        public Criteria andErrordescIsNull() {
            addCriterion("ERRORDESC is null");
            return (Criteria) this;
        }

        public Criteria andErrordescIsNotNull() {
            addCriterion("ERRORDESC is not null");
            return (Criteria) this;
        }

        public Criteria andErrordescEqualTo(String value) {
            addCriterion("ERRORDESC =", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescNotEqualTo(String value) {
            addCriterion("ERRORDESC <>", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescGreaterThan(String value) {
            addCriterion("ERRORDESC >", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORDESC >=", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescLessThan(String value) {
            addCriterion("ERRORDESC <", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescLessThanOrEqualTo(String value) {
            addCriterion("ERRORDESC <=", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescLike(String value) {
            addCriterion("ERRORDESC like", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescNotLike(String value) {
            addCriterion("ERRORDESC not like", value, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescIn(List<String> values) {
            addCriterion("ERRORDESC in", values, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescNotIn(List<String> values) {
            addCriterion("ERRORDESC not in", values, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescBetween(String value1, String value2) {
            addCriterion("ERRORDESC between", value1, value2, "errordesc");
            return (Criteria) this;
        }

        public Criteria andErrordescNotBetween(String value1, String value2) {
            addCriterion("ERRORDESC not between", value1, value2, "errordesc");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrIsNull() {
            addCriterion("PLATSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrIsNotNull() {
            addCriterion("PLATSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrEqualTo(String value) {
            addCriterion("PLATSEQNBR =", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrNotEqualTo(String value) {
            addCriterion("PLATSEQNBR <>", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrGreaterThan(String value) {
            addCriterion("PLATSEQNBR >", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PLATSEQNBR >=", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrLessThan(String value) {
            addCriterion("PLATSEQNBR <", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrLessThanOrEqualTo(String value) {
            addCriterion("PLATSEQNBR <=", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrLike(String value) {
            addCriterion("PLATSEQNBR like", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrNotLike(String value) {
            addCriterion("PLATSEQNBR not like", value, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrIn(List<String> values) {
            addCriterion("PLATSEQNBR in", values, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrNotIn(List<String> values) {
            addCriterion("PLATSEQNBR not in", values, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrBetween(String value1, String value2) {
            addCriterion("PLATSEQNBR between", value1, value2, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andPlatseqnbrNotBetween(String value1, String value2) {
            addCriterion("PLATSEQNBR not between", value1, value2, "platseqnbr");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIsNull() {
            addCriterion("ERRORSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIsNotNull() {
            addCriterion("ERRORSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andErrorstatusEqualTo(String value) {
            addCriterion("ERRORSTATUS =", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotEqualTo(String value) {
            addCriterion("ERRORSTATUS <>", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusGreaterThan(String value) {
            addCriterion("ERRORSTATUS >", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORSTATUS >=", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLessThan(String value) {
            addCriterion("ERRORSTATUS <", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLessThanOrEqualTo(String value) {
            addCriterion("ERRORSTATUS <=", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusLike(String value) {
            addCriterion("ERRORSTATUS like", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotLike(String value) {
            addCriterion("ERRORSTATUS not like", value, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusIn(List<String> values) {
            addCriterion("ERRORSTATUS in", values, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotIn(List<String> values) {
            addCriterion("ERRORSTATUS not in", values, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusBetween(String value1, String value2) {
            addCriterion("ERRORSTATUS between", value1, value2, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andErrorstatusNotBetween(String value1, String value2) {
            addCriterion("ERRORSTATUS not between", value1, value2, "errorstatus");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNull() {
            addCriterion("TRANSAMT is null");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNotNull() {
            addCriterion("TRANSAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransamtEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT =", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <>", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT >", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT >=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThan(BigDecimal value) {
            addCriterion("TRANSAMT <", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT not in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT not between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNull() {
            addCriterion("CLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNotNull() {
            addCriterion("CLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCleardateEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE =", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE <>", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEARDATE >", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE >=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThan(Date value) {
            addCriterionForJDBCDate("CLEARDATE <", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE <=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARDATE in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARDATE not in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARDATE between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARDATE not between", value1, value2, "cleardate");
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