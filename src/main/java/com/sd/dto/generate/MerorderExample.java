package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerorderExample() {
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

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("PAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("PAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("PAYERNAME =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("PAYERNAME <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("PAYERNAME >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERNAME >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("PAYERNAME <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("PAYERNAME <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("PAYERNAME like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("PAYERNAME not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("PAYERNAME in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("PAYERNAME not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("PAYERNAME between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("PAYERNAME not between", value1, value2, "payername");
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

        public Criteria andMerfeeamtIsNull() {
            addCriterion("MERFEEAMT is null");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtIsNotNull() {
            addCriterion("MERFEEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtEqualTo(BigDecimal value) {
            addCriterion("MERFEEAMT =", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtNotEqualTo(BigDecimal value) {
            addCriterion("MERFEEAMT <>", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtGreaterThan(BigDecimal value) {
            addCriterion("MERFEEAMT >", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MERFEEAMT >=", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtLessThan(BigDecimal value) {
            addCriterion("MERFEEAMT <", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MERFEEAMT <=", value, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtIn(List<BigDecimal> values) {
            addCriterion("MERFEEAMT in", values, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtNotIn(List<BigDecimal> values) {
            addCriterion("MERFEEAMT not in", values, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERFEEAMT between", value1, value2, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerfeeamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERFEEAMT not between", value1, value2, "merfeeamt");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIsNull() {
            addCriterion("MERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIsNotNull() {
            addCriterion("MERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrEqualTo(String value) {
            addCriterion("MERSEQNBR =", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotEqualTo(String value) {
            addCriterion("MERSEQNBR <>", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThan(String value) {
            addCriterion("MERSEQNBR >", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR >=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThan(String value) {
            addCriterion("MERSEQNBR <", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR <=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLike(String value) {
            addCriterion("MERSEQNBR like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotLike(String value) {
            addCriterion("MERSEQNBR not like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIn(List<String> values) {
            addCriterion("MERSEQNBR in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotIn(List<String> values) {
            addCriterion("MERSEQNBR not in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrBetween(String value1, String value2) {
            addCriterion("MERSEQNBR between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotBetween(String value1, String value2) {
            addCriterion("MERSEQNBR not between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMernoIsNull() {
            addCriterion("MERNO is null");
            return (Criteria) this;
        }

        public Criteria andMernoIsNotNull() {
            addCriterion("MERNO is not null");
            return (Criteria) this;
        }

        public Criteria andMernoEqualTo(String value) {
            addCriterion("MERNO =", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoNotEqualTo(String value) {
            addCriterion("MERNO <>", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoGreaterThan(String value) {
            addCriterion("MERNO >", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoGreaterThanOrEqualTo(String value) {
            addCriterion("MERNO >=", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoLessThan(String value) {
            addCriterion("MERNO <", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoLessThanOrEqualTo(String value) {
            addCriterion("MERNO <=", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoLike(String value) {
            addCriterion("MERNO like", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoNotLike(String value) {
            addCriterion("MERNO not like", value, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoIn(List<String> values) {
            addCriterion("MERNO in", values, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoNotIn(List<String> values) {
            addCriterion("MERNO not in", values, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoBetween(String value1, String value2) {
            addCriterion("MERNO between", value1, value2, "merno");
            return (Criteria) this;
        }

        public Criteria andMernoNotBetween(String value1, String value2) {
            addCriterion("MERNO not between", value1, value2, "merno");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("TRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("TRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSTIME =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSTIME <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSTIME >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSTIME >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(Date value) {
            addCriterionForJDBCDate("TRANSTIME <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSTIME <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSTIME in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSTIME not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSTIME between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSTIME not between", value1, value2, "transtime");
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

        public Criteria andCheckstatusIsNull() {
            addCriterion("CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("ORDERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("ORDERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("ORDERSTATUS =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("ORDERSTATUS <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("ORDERSTATUS >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERSTATUS >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("ORDERSTATUS <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("ORDERSTATUS <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("ORDERSTATUS like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("ORDERSTATUS not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("ORDERSTATUS in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("ORDERSTATUS not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("ORDERSTATUS between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("ORDERSTATUS not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNull() {
            addCriterion("RESPMSG is null");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNotNull() {
            addCriterion("RESPMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespmsgEqualTo(String value) {
            addCriterion("RESPMSG =", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotEqualTo(String value) {
            addCriterion("RESPMSG <>", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThan(String value) {
            addCriterion("RESPMSG >", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESPMSG >=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThan(String value) {
            addCriterion("RESPMSG <", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThanOrEqualTo(String value) {
            addCriterion("RESPMSG <=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLike(String value) {
            addCriterion("RESPMSG like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotLike(String value) {
            addCriterion("RESPMSG not like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgIn(List<String> values) {
            addCriterion("RESPMSG in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotIn(List<String> values) {
            addCriterion("RESPMSG not in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgBetween(String value1, String value2) {
            addCriterion("RESPMSG between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotBetween(String value1, String value2) {
            addCriterion("RESPMSG not between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("RESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("RESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("RESPCODE =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("RESPCODE <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("RESPCODE >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPCODE >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("RESPCODE <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("RESPCODE <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("RESPCODE like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("RESPCODE not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("RESPCODE in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("RESPCODE not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("RESPCODE between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("RESPCODE not between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIsNull() {
            addCriterion("CRTDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIsNotNull() {
            addCriterion("CRTDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeEqualTo(Date value) {
            addCriterion("CRTDATETIME =", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotEqualTo(Date value) {
            addCriterion("CRTDATETIME <>", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeGreaterThan(Date value) {
            addCriterion("CRTDATETIME >", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTDATETIME >=", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeLessThan(Date value) {
            addCriterion("CRTDATETIME <", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CRTDATETIME <=", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIn(List<Date> values) {
            addCriterion("CRTDATETIME in", values, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotIn(List<Date> values) {
            addCriterion("CRTDATETIME not in", values, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeBetween(Date value1, Date value2) {
            addCriterion("CRTDATETIME between", value1, value2, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CRTDATETIME not between", value1, value2, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNull() {
            addCriterion("DATELASTMAINT is null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNotNull() {
            addCriterion("DATELASTMAINT is not null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintEqualTo(Date value) {
            addCriterion("DATELASTMAINT =", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotEqualTo(Date value) {
            addCriterion("DATELASTMAINT <>", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThan(Date value) {
            addCriterion("DATELASTMAINT >", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT >=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThan(Date value) {
            addCriterion("DATELASTMAINT <", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT <=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIn(List<Date> values) {
            addCriterion("DATELASTMAINT in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotIn(List<Date> values) {
            addCriterion("DATELASTMAINT not in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT not between", value1, value2, "datelastmaint");
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