package com.sd.dto.generate;

import java.util.ArrayList;
import java.util.List;

public class JobtaskinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobtaskinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("TASKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("TASKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("TASKNAME =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("TASKNAME <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("TASKNAME >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNAME >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("TASKNAME <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("TASKNAME <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("TASKNAME like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("TASKNAME not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("TASKNAME in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("TASKNAME not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("TASKNAME between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("TASKNAME not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskexpressIsNull() {
            addCriterion("TASKEXPRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaskexpressIsNotNull() {
            addCriterion("TASKEXPRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskexpressEqualTo(String value) {
            addCriterion("TASKEXPRESS =", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressNotEqualTo(String value) {
            addCriterion("TASKEXPRESS <>", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressGreaterThan(String value) {
            addCriterion("TASKEXPRESS >", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressGreaterThanOrEqualTo(String value) {
            addCriterion("TASKEXPRESS >=", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressLessThan(String value) {
            addCriterion("TASKEXPRESS <", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressLessThanOrEqualTo(String value) {
            addCriterion("TASKEXPRESS <=", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressLike(String value) {
            addCriterion("TASKEXPRESS like", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressNotLike(String value) {
            addCriterion("TASKEXPRESS not like", value, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressIn(List<String> values) {
            addCriterion("TASKEXPRESS in", values, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressNotIn(List<String> values) {
            addCriterion("TASKEXPRESS not in", values, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressBetween(String value1, String value2) {
            addCriterion("TASKEXPRESS between", value1, value2, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskexpressNotBetween(String value1, String value2) {
            addCriterion("TASKEXPRESS not between", value1, value2, "taskexpress");
            return (Criteria) this;
        }

        public Criteria andTaskparamIsNull() {
            addCriterion("TASKPARAM is null");
            return (Criteria) this;
        }

        public Criteria andTaskparamIsNotNull() {
            addCriterion("TASKPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andTaskparamEqualTo(String value) {
            addCriterion("TASKPARAM =", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamNotEqualTo(String value) {
            addCriterion("TASKPARAM <>", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamGreaterThan(String value) {
            addCriterion("TASKPARAM >", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamGreaterThanOrEqualTo(String value) {
            addCriterion("TASKPARAM >=", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamLessThan(String value) {
            addCriterion("TASKPARAM <", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamLessThanOrEqualTo(String value) {
            addCriterion("TASKPARAM <=", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamLike(String value) {
            addCriterion("TASKPARAM like", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamNotLike(String value) {
            addCriterion("TASKPARAM not like", value, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamIn(List<String> values) {
            addCriterion("TASKPARAM in", values, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamNotIn(List<String> values) {
            addCriterion("TASKPARAM not in", values, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamBetween(String value1, String value2) {
            addCriterion("TASKPARAM between", value1, value2, "taskparam");
            return (Criteria) this;
        }

        public Criteria andTaskparamNotBetween(String value1, String value2) {
            addCriterion("TASKPARAM not between", value1, value2, "taskparam");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("SYSID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SYSID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("SYSID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("SYSID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("SYSID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("SYSID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("SYSID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("SYSID like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("SYSID not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("SYSID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("SYSID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("SYSID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("SYSID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNull() {
            addCriterion("TASKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNotNull() {
            addCriterion("TASKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusEqualTo(String value) {
            addCriterion("TASKSTATUS =", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotEqualTo(String value) {
            addCriterion("TASKSTATUS <>", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThan(String value) {
            addCriterion("TASKSTATUS >", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASKSTATUS >=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThan(String value) {
            addCriterion("TASKSTATUS <", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThanOrEqualTo(String value) {
            addCriterion("TASKSTATUS <=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLike(String value) {
            addCriterion("TASKSTATUS like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotLike(String value) {
            addCriterion("TASKSTATUS not like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIn(List<String> values) {
            addCriterion("TASKSTATUS in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotIn(List<String> values) {
            addCriterion("TASKSTATUS not in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusBetween(String value1, String value2) {
            addCriterion("TASKSTATUS between", value1, value2, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotBetween(String value1, String value2) {
            addCriterion("TASKSTATUS not between", value1, value2, "taskstatus");
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