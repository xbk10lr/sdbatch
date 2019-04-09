package com.sd.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysinfoExample() {
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

        public Criteria andSysnbrIsNull() {
            addCriterion("SYSNBR is null");
            return (Criteria) this;
        }

        public Criteria andSysnbrIsNotNull() {
            addCriterion("SYSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andSysnbrEqualTo(String value) {
            addCriterion("SYSNBR =", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrNotEqualTo(String value) {
            addCriterion("SYSNBR <>", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrGreaterThan(String value) {
            addCriterion("SYSNBR >", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrGreaterThanOrEqualTo(String value) {
            addCriterion("SYSNBR >=", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrLessThan(String value) {
            addCriterion("SYSNBR <", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrLessThanOrEqualTo(String value) {
            addCriterion("SYSNBR <=", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrLike(String value) {
            addCriterion("SYSNBR like", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrNotLike(String value) {
            addCriterion("SYSNBR not like", value, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrIn(List<String> values) {
            addCriterion("SYSNBR in", values, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrNotIn(List<String> values) {
            addCriterion("SYSNBR not in", values, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrBetween(String value1, String value2) {
            addCriterion("SYSNBR between", value1, value2, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andSysnbrNotBetween(String value1, String value2) {
            addCriterion("SYSNBR not between", value1, value2, "sysnbr");
            return (Criteria) this;
        }

        public Criteria andPredateIsNull() {
            addCriterion("PREDATE is null");
            return (Criteria) this;
        }

        public Criteria andPredateIsNotNull() {
            addCriterion("PREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPredateEqualTo(Date value) {
            addCriterionForJDBCDate("PREDATE =", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PREDATE <>", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateGreaterThan(Date value) {
            addCriterionForJDBCDate("PREDATE >", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREDATE >=", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateLessThan(Date value) {
            addCriterionForJDBCDate("PREDATE <", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREDATE <=", value, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateIn(List<Date> values) {
            addCriterionForJDBCDate("PREDATE in", values, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PREDATE not in", values, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREDATE between", value1, value2, "predate");
            return (Criteria) this;
        }

        public Criteria andPredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREDATE not between", value1, value2, "predate");
            return (Criteria) this;
        }

        public Criteria andNowdateIsNull() {
            addCriterion("NOWDATE is null");
            return (Criteria) this;
        }

        public Criteria andNowdateIsNotNull() {
            addCriterion("NOWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNowdateEqualTo(Date value) {
            addCriterionForJDBCDate("NOWDATE =", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NOWDATE <>", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateGreaterThan(Date value) {
            addCriterionForJDBCDate("NOWDATE >", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NOWDATE >=", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateLessThan(Date value) {
            addCriterionForJDBCDate("NOWDATE <", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NOWDATE <=", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateIn(List<Date> values) {
            addCriterionForJDBCDate("NOWDATE in", values, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NOWDATE not in", values, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NOWDATE between", value1, value2, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NOWDATE not between", value1, value2, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNextdateIsNull() {
            addCriterion("NEXTDATE is null");
            return (Criteria) this;
        }

        public Criteria andNextdateIsNotNull() {
            addCriterion("NEXTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextdateEqualTo(Date value) {
            addCriterionForJDBCDate("NEXTDATE =", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NEXTDATE <>", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateGreaterThan(Date value) {
            addCriterionForJDBCDate("NEXTDATE >", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXTDATE >=", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateLessThan(Date value) {
            addCriterionForJDBCDate("NEXTDATE <", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXTDATE <=", value, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateIn(List<Date> values) {
            addCriterionForJDBCDate("NEXTDATE in", values, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NEXTDATE not in", values, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXTDATE between", value1, value2, "nextdate");
            return (Criteria) this;
        }

        public Criteria andNextdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXTDATE not between", value1, value2, "nextdate");
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