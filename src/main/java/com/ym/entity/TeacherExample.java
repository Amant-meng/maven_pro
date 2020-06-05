package com.ym.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andT_idIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andT_idIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andT_idEqualTo(Integer value) {
            addCriterion("t_id =", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idGreaterThan(Integer value) {
            addCriterion("t_id >", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idLessThan(Integer value) {
            addCriterion("t_id <", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idIn(List<Integer> values) {
            addCriterion("t_id in", values, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_idNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "t_id");
            return (Criteria) this;
        }

        public Criteria andT_nameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andT_nameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andT_nameEqualTo(String value) {
            addCriterion("t_name =", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameGreaterThan(String value) {
            addCriterion("t_name >", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLessThan(String value) {
            addCriterion("t_name <", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLike(String value) {
            addCriterion("t_name like", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotLike(String value) {
            addCriterion("t_name not like", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameIn(List<String> values) {
            addCriterion("t_name in", values, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_sexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andT_sexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andT_sexEqualTo(String value) {
            addCriterion("t_sex =", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexGreaterThan(String value) {
            addCriterion("t_sex >", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexLessThan(String value) {
            addCriterion("t_sex <", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexLike(String value) {
            addCriterion("t_sex like", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexNotLike(String value) {
            addCriterion("t_sex not like", value, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexIn(List<String> values) {
            addCriterion("t_sex in", values, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_sexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "t_sex");
            return (Criteria) this;
        }

        public Criteria andT_ageIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andT_ageIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andT_ageEqualTo(String value) {
            addCriterion("t_age =", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageNotEqualTo(String value) {
            addCriterion("t_age <>", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageGreaterThan(String value) {
            addCriterion("t_age >", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageGreaterThanOrEqualTo(String value) {
            addCriterion("t_age >=", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageLessThan(String value) {
            addCriterion("t_age <", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageLessThanOrEqualTo(String value) {
            addCriterion("t_age <=", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageLike(String value) {
            addCriterion("t_age like", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageNotLike(String value) {
            addCriterion("t_age not like", value, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageIn(List<String> values) {
            addCriterion("t_age in", values, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageNotIn(List<String> values) {
            addCriterion("t_age not in", values, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageBetween(String value1, String value2) {
            addCriterion("t_age between", value1, value2, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_ageNotBetween(String value1, String value2) {
            addCriterion("t_age not between", value1, value2, "t_age");
            return (Criteria) this;
        }

        public Criteria andT_phoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andT_phoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andT_phoneEqualTo(String value) {
            addCriterion("t_phone =", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneLessThan(String value) {
            addCriterion("t_phone <", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneLike(String value) {
            addCriterion("t_phone like", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneNotLike(String value) {
            addCriterion("t_phone not like", value, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneIn(List<String> values) {
            addCriterion("t_phone in", values, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_phoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "t_phone");
            return (Criteria) this;
        }

        public Criteria andT_addressIsNull() {
            addCriterion("t_address is null");
            return (Criteria) this;
        }

        public Criteria andT_addressIsNotNull() {
            addCriterion("t_address is not null");
            return (Criteria) this;
        }

        public Criteria andT_addressEqualTo(String value) {
            addCriterion("t_address =", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressNotEqualTo(String value) {
            addCriterion("t_address <>", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressGreaterThan(String value) {
            addCriterion("t_address >", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressGreaterThanOrEqualTo(String value) {
            addCriterion("t_address >=", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressLessThan(String value) {
            addCriterion("t_address <", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressLessThanOrEqualTo(String value) {
            addCriterion("t_address <=", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressLike(String value) {
            addCriterion("t_address like", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressNotLike(String value) {
            addCriterion("t_address not like", value, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressIn(List<String> values) {
            addCriterion("t_address in", values, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressNotIn(List<String> values) {
            addCriterion("t_address not in", values, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressBetween(String value1, String value2) {
            addCriterion("t_address between", value1, value2, "t_address");
            return (Criteria) this;
        }

        public Criteria andT_addressNotBetween(String value1, String value2) {
            addCriterion("t_address not between", value1, value2, "t_address");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDept_idEqualTo(Integer value) {
            addCriterion("dept_id =", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThan(Integer value) {
            addCriterion("dept_id <", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIn(List<Integer> values) {
            addCriterion("dept_id in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andC_timeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andC_timeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andC_timeEqualTo(Date value) {
            addCriterion("c_time =", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeNotEqualTo(Date value) {
            addCriterion("c_time <>", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeGreaterThan(Date value) {
            addCriterion("c_time >", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_time >=", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeLessThan(Date value) {
            addCriterion("c_time <", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeLessThanOrEqualTo(Date value) {
            addCriterion("c_time <=", value, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeIn(List<Date> values) {
            addCriterion("c_time in", values, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeNotIn(List<Date> values) {
            addCriterion("c_time not in", values, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeBetween(Date value1, Date value2) {
            addCriterion("c_time between", value1, value2, "c_time");
            return (Criteria) this;
        }

        public Criteria andC_timeNotBetween(Date value1, Date value2) {
            addCriterion("c_time not between", value1, value2, "c_time");
            return (Criteria) this;
        }

        public Criteria andM_timeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andM_timeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andM_timeEqualTo(Date value) {
            addCriterion("m_time =", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeNotEqualTo(Date value) {
            addCriterion("m_time <>", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeGreaterThan(Date value) {
            addCriterion("m_time >", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_time >=", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeLessThan(Date value) {
            addCriterion("m_time <", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeLessThanOrEqualTo(Date value) {
            addCriterion("m_time <=", value, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeIn(List<Date> values) {
            addCriterion("m_time in", values, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeNotIn(List<Date> values) {
            addCriterion("m_time not in", values, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeBetween(Date value1, Date value2) {
            addCriterion("m_time between", value1, value2, "m_time");
            return (Criteria) this;
        }

        public Criteria andM_timeNotBetween(Date value1, Date value2) {
            addCriterion("m_time not between", value1, value2, "m_time");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNull() {
            addCriterion("deltag is null");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNotNull() {
            addCriterion("deltag is not null");
            return (Criteria) this;
        }

        public Criteria andDeltagEqualTo(String value) {
            addCriterion("deltag =", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotEqualTo(String value) {
            addCriterion("deltag <>", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThan(String value) {
            addCriterion("deltag >", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThanOrEqualTo(String value) {
            addCriterion("deltag >=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThan(String value) {
            addCriterion("deltag <", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThanOrEqualTo(String value) {
            addCriterion("deltag <=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLike(String value) {
            addCriterion("deltag like", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotLike(String value) {
            addCriterion("deltag not like", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagIn(List<String> values) {
            addCriterion("deltag in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotIn(List<String> values) {
            addCriterion("deltag not in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagBetween(String value1, String value2) {
            addCriterion("deltag between", value1, value2, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotBetween(String value1, String value2) {
            addCriterion("deltag not between", value1, value2, "deltag");
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