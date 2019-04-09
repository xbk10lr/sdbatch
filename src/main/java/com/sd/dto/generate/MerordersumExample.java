package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerordersumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerordersumExample() {
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

        public Criteria andSettlenbrIsNull() {
            addCriterion("SETTLENBR is null");
            return (Criteria) this;
        }

        public Criteria andSettlenbrIsNotNull() {
            addCriterion("SETTLENBR is not null");
            return (Criteria) this;
        }

        public Criteria andSettlenbrEqualTo(String value) {
            addCriterion("SETTLENBR =", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrNotEqualTo(String value) {
            addCriterion("SETTLENBR <>", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrGreaterThan(String value) {
            addCriterion("SETTLENBR >", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLENBR >=", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrLessThan(String value) {
            addCriterion("SETTLENBR <", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrLessThanOrEqualTo(String value) {
            addCriterion("SETTLENBR <=", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrLike(String value) {
            addCriterion("SETTLENBR like", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrNotLike(String value) {
            addCriterion("SETTLENBR not like", value, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrIn(List<String> values) {
            addCriterion("SETTLENBR in", values, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrNotIn(List<String> values) {
            addCriterion("SETTLENBR not in", values, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrBetween(String value1, String value2) {
            addCriterion("SETTLENBR between", value1, value2, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andSettlenbrNotBetween(String value1, String value2) {
            addCriterion("SETTLENBR not between", value1, value2, "settlenbr");
            return (Criteria) this;
        }

        public Criteria andMernbrIsNull() {
            addCriterion("MERNBR is null");
            return (Criteria) this;
        }

        public Criteria andMernbrIsNotNull() {
            addCriterion("MERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMernbrEqualTo(String value) {
            addCriterion("MERNBR =", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotEqualTo(String value) {
            addCriterion("MERNBR <>", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThan(String value) {
            addCriterion("MERNBR >", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERNBR >=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThan(String value) {
            addCriterion("MERNBR <", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThanOrEqualTo(String value) {
            addCriterion("MERNBR <=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLike(String value) {
            addCriterion("MERNBR like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotLike(String value) {
            addCriterion("MERNBR not like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrIn(List<String> values) {
            addCriterion("MERNBR in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotIn(List<String> values) {
            addCriterion("MERNBR not in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrBetween(String value1, String value2) {
            addCriterion("MERNBR between", value1, value2, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotBetween(String value1, String value2) {
            addCriterion("MERNBR not between", value1, value2, "mernbr");
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

        public Criteria andCleartimeIsNull() {
            addCriterion("CLEARTIME is null");
            return (Criteria) this;
        }

        public Criteria andCleartimeIsNotNull() {
            addCriterion("CLEARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCleartimeEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME =", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME <>", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEARTIME >", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME >=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThan(Date value) {
            addCriterionForJDBCDate("CLEARTIME <", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME <=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARTIME in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARTIME not in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARTIME between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARTIME not between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andTotalamtIsNull() {
            addCriterion("TOTALAMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalamtIsNotNull() {
            addCriterion("TOTALAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamtEqualTo(BigDecimal value) {
            addCriterion("TOTALAMT =", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotEqualTo(BigDecimal value) {
            addCriterion("TOTALAMT <>", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtGreaterThan(BigDecimal value) {
            addCriterion("TOTALAMT >", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMT >=", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtLessThan(BigDecimal value) {
            addCriterion("TOTALAMT <", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMT <=", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtIn(List<BigDecimal> values) {
            addCriterion("TOTALAMT in", values, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotIn(List<BigDecimal> values) {
            addCriterion("TOTALAMT not in", values, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMT between", value1, value2, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMT not between", value1, value2, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNull() {
            addCriterion("TOTALCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNotNull() {
            addCriterion("TOTALCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcountEqualTo(Integer value) {
            addCriterion("TOTALCOUNT =", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotEqualTo(Integer value) {
            addCriterion("TOTALCOUNT <>", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThan(Integer value) {
            addCriterion("TOTALCOUNT >", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTALCOUNT >=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThan(Integer value) {
            addCriterion("TOTALCOUNT <", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTALCOUNT <=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountIn(List<Integer> values) {
            addCriterion("TOTALCOUNT in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotIn(List<Integer> values) {
            addCriterion("TOTALCOUNT not in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountBetween(Integer value1, Integer value2) {
            addCriterion("TOTALCOUNT between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTALCOUNT not between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtIsNull() {
            addCriterion("TOTALFEEAMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtIsNotNull() {
            addCriterion("TOTALFEEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtEqualTo(BigDecimal value) {
            addCriterion("TOTALFEEAMT =", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtNotEqualTo(BigDecimal value) {
            addCriterion("TOTALFEEAMT <>", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtGreaterThan(BigDecimal value) {
            addCriterion("TOTALFEEAMT >", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALFEEAMT >=", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtLessThan(BigDecimal value) {
            addCriterion("TOTALFEEAMT <", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALFEEAMT <=", value, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtIn(List<BigDecimal> values) {
            addCriterion("TOTALFEEAMT in", values, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtNotIn(List<BigDecimal> values) {
            addCriterion("TOTALFEEAMT not in", values, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALFEEAMT between", value1, value2, "totalfeeamt");
            return (Criteria) this;
        }

        public Criteria andTotalfeeamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALFEEAMT not between", value1, value2, "totalfeeamt");
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