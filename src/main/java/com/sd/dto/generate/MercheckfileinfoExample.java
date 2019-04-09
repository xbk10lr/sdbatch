package com.sd.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MercheckfileinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MercheckfileinfoExample() {
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

        public Criteria andChecknbrIsNull() {
            addCriterion("CHECKNBR is null");
            return (Criteria) this;
        }

        public Criteria andChecknbrIsNotNull() {
            addCriterion("CHECKNBR is not null");
            return (Criteria) this;
        }

        public Criteria andChecknbrEqualTo(String value) {
            addCriterion("CHECKNBR =", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrNotEqualTo(String value) {
            addCriterion("CHECKNBR <>", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrGreaterThan(String value) {
            addCriterion("CHECKNBR >", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNBR >=", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrLessThan(String value) {
            addCriterion("CHECKNBR <", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrLessThanOrEqualTo(String value) {
            addCriterion("CHECKNBR <=", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrLike(String value) {
            addCriterion("CHECKNBR like", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrNotLike(String value) {
            addCriterion("CHECKNBR not like", value, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrIn(List<String> values) {
            addCriterion("CHECKNBR in", values, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrNotIn(List<String> values) {
            addCriterion("CHECKNBR not in", values, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrBetween(String value1, String value2) {
            addCriterion("CHECKNBR between", value1, value2, "checknbr");
            return (Criteria) this;
        }

        public Criteria andChecknbrNotBetween(String value1, String value2) {
            addCriterion("CHECKNBR not between", value1, value2, "checknbr");
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

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNull() {
            addCriterion("CHECKFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNotNull() {
            addCriterion("CHECKFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckflagEqualTo(String value) {
            addCriterion("CHECKFLAG =", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotEqualTo(String value) {
            addCriterion("CHECKFLAG <>", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThan(String value) {
            addCriterion("CHECKFLAG >", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKFLAG >=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThan(String value) {
            addCriterion("CHECKFLAG <", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThanOrEqualTo(String value) {
            addCriterion("CHECKFLAG <=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLike(String value) {
            addCriterion("CHECKFLAG like", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotLike(String value) {
            addCriterion("CHECKFLAG not like", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagIn(List<String> values) {
            addCriterion("CHECKFLAG in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotIn(List<String> values) {
            addCriterion("CHECKFLAG not in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagBetween(String value1, String value2) {
            addCriterion("CHECKFLAG between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotBetween(String value1, String value2) {
            addCriterion("CHECKFLAG not between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECKDATE not between", value1, value2, "checkdate");
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