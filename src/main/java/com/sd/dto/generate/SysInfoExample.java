package com.sd.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysInfoExample() {
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

        public Criteria andSysNbrIsNull() {
            addCriterion("SYS_NBR is null");
            return (Criteria) this;
        }

        public Criteria andSysNbrIsNotNull() {
            addCriterion("SYS_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andSysNbrEqualTo(String value) {
            addCriterion("SYS_NBR =", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrNotEqualTo(String value) {
            addCriterion("SYS_NBR <>", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrGreaterThan(String value) {
            addCriterion("SYS_NBR >", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NBR >=", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrLessThan(String value) {
            addCriterion("SYS_NBR <", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrLessThanOrEqualTo(String value) {
            addCriterion("SYS_NBR <=", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrLike(String value) {
            addCriterion("SYS_NBR like", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrNotLike(String value) {
            addCriterion("SYS_NBR not like", value, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrIn(List<String> values) {
            addCriterion("SYS_NBR in", values, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrNotIn(List<String> values) {
            addCriterion("SYS_NBR not in", values, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrBetween(String value1, String value2) {
            addCriterion("SYS_NBR between", value1, value2, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andSysNbrNotBetween(String value1, String value2) {
            addCriterion("SYS_NBR not between", value1, value2, "sysNbr");
            return (Criteria) this;
        }

        public Criteria andPreDateIsNull() {
            addCriterion("PRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPreDateIsNotNull() {
            addCriterion("PRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPreDateEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_DATE =", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_DATE <>", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRE_DATE >", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_DATE >=", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateLessThan(Date value) {
            addCriterionForJDBCDate("PRE_DATE <", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_DATE <=", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateIn(List<Date> values) {
            addCriterionForJDBCDate("PRE_DATE in", values, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRE_DATE not in", values, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRE_DATE between", value1, value2, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRE_DATE not between", value1, value2, "preDate");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNull() {
            addCriterion("NOW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNotNull() {
            addCriterion("NOW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNowDateEqualTo(Date value) {
            addCriterionForJDBCDate("NOW_DATE =", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NOW_DATE <>", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThan(Date value) {
            addCriterionForJDBCDate("NOW_DATE >", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NOW_DATE >=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThan(Date value) {
            addCriterionForJDBCDate("NOW_DATE <", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NOW_DATE <=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateIn(List<Date> values) {
            addCriterionForJDBCDate("NOW_DATE in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NOW_DATE not in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NOW_DATE between", value1, value2, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NOW_DATE not between", value1, value2, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNull() {
            addCriterion("NEXT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNotNull() {
            addCriterion("NEXT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextDateEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE =", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <>", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThan(Date value) {
            addCriterionForJDBCDate("NEXT_DATE >", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE >=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThan(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_DATE in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_DATE not in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_DATE between", value1, value2, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_DATE not between", value1, value2, "nextDate");
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