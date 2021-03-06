package edu.black.model;

import java.util.ArrayList;
import java.util.List;

public class RolesauthorityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public RolesauthorityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIsNull() {
            addCriterion("authorityId is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIsNotNull() {
            addCriterion("authorityId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidEqualTo(Integer value) {
            addCriterion("authorityId =", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotEqualTo(Integer value) {
            addCriterion("authorityId <>", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThan(Integer value) {
            addCriterion("authorityId >", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorityId >=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThan(Integer value) {
            addCriterion("authorityId <", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThanOrEqualTo(Integer value) {
            addCriterion("authorityId <=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIn(List<Integer> values) {
            addCriterion("authorityId in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotIn(List<Integer> values) {
            addCriterion("authorityId not in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidBetween(Integer value1, Integer value2) {
            addCriterion("authorityId between", value1, value2, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotBetween(Integer value1, Integer value2) {
            addCriterion("authorityId not between", value1, value2, "authorityid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolesauthority
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 16 21:19:55 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolesauthority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
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