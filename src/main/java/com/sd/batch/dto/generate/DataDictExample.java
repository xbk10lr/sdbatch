package com.sd.batch.dto.generate;

import java.util.ArrayList;
import java.util.List;

public class DataDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictExample() {
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

        public Criteria andDataKeyIsNull() {
            addCriterion("DATA_KEY is null");
            return (Criteria) this;
        }

        public Criteria andDataKeyIsNotNull() {
            addCriterion("DATA_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andDataKeyEqualTo(String value) {
            addCriterion("DATA_KEY =", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotEqualTo(String value) {
            addCriterion("DATA_KEY <>", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyGreaterThan(String value) {
            addCriterion("DATA_KEY >", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_KEY >=", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLessThan(String value) {
            addCriterion("DATA_KEY <", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLessThanOrEqualTo(String value) {
            addCriterion("DATA_KEY <=", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLike(String value) {
            addCriterion("DATA_KEY like", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotLike(String value) {
            addCriterion("DATA_KEY not like", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyIn(List<String> values) {
            addCriterion("DATA_KEY in", values, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotIn(List<String> values) {
            addCriterion("DATA_KEY not in", values, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyBetween(String value1, String value2) {
            addCriterion("DATA_KEY between", value1, value2, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotBetween(String value1, String value2) {
            addCriterion("DATA_KEY not between", value1, value2, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNull() {
            addCriterion("DATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNotNull() {
            addCriterion("DATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDataValueEqualTo(String value) {
            addCriterion("DATA_VALUE =", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotEqualTo(String value) {
            addCriterion("DATA_VALUE <>", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThan(String value) {
            addCriterion("DATA_VALUE >", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_VALUE >=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThan(String value) {
            addCriterion("DATA_VALUE <", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThanOrEqualTo(String value) {
            addCriterion("DATA_VALUE <=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLike(String value) {
            addCriterion("DATA_VALUE like", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotLike(String value) {
            addCriterion("DATA_VALUE not like", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueIn(List<String> values) {
            addCriterion("DATA_VALUE in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotIn(List<String> values) {
            addCriterion("DATA_VALUE not in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueBetween(String value1, String value2) {
            addCriterion("DATA_VALUE between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotBetween(String value1, String value2) {
            addCriterion("DATA_VALUE not between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNull() {
            addCriterion("DATA_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNotNull() {
            addCriterion("DATA_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDataDescEqualTo(String value) {
            addCriterion("DATA_DESC =", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotEqualTo(String value) {
            addCriterion("DATA_DESC <>", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThan(String value) {
            addCriterion("DATA_DESC >", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DESC >=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThan(String value) {
            addCriterion("DATA_DESC <", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThanOrEqualTo(String value) {
            addCriterion("DATA_DESC <=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLike(String value) {
            addCriterion("DATA_DESC like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotLike(String value) {
            addCriterion("DATA_DESC not like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescIn(List<String> values) {
            addCriterion("DATA_DESC in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotIn(List<String> values) {
            addCriterion("DATA_DESC not in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescBetween(String value1, String value2) {
            addCriterion("DATA_DESC between", value1, value2, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotBetween(String value1, String value2) {
            addCriterion("DATA_DESC not between", value1, value2, "dataDesc");
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