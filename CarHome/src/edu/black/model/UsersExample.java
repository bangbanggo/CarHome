package edu.black.model;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
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
     * This method corresponds to the database table users
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
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
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
     * This class corresponds to the database table users
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameIsNull() {
            addCriterion("userAccessName is null");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameIsNotNull() {
            addCriterion("userAccessName is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameEqualTo(String value) {
            addCriterion("userAccessName =", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameNotEqualTo(String value) {
            addCriterion("userAccessName <>", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameGreaterThan(String value) {
            addCriterion("userAccessName >", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameGreaterThanOrEqualTo(String value) {
            addCriterion("userAccessName >=", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameLessThan(String value) {
            addCriterion("userAccessName <", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameLessThanOrEqualTo(String value) {
            addCriterion("userAccessName <=", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameLike(String value) {
            addCriterion("userAccessName like", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameNotLike(String value) {
            addCriterion("userAccessName not like", value, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameIn(List<String> values) {
            addCriterion("userAccessName in", values, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameNotIn(List<String> values) {
            addCriterion("userAccessName not in", values, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameBetween(String value1, String value2) {
            addCriterion("userAccessName between", value1, value2, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccessnameNotBetween(String value1, String value2) {
            addCriterion("userAccessName not between", value1, value2, "useraccessname");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordIsNull() {
            addCriterion("userAccessPassword is null");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordIsNotNull() {
            addCriterion("userAccessPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordEqualTo(String value) {
            addCriterion("userAccessPassword =", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordNotEqualTo(String value) {
            addCriterion("userAccessPassword <>", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordGreaterThan(String value) {
            addCriterion("userAccessPassword >", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userAccessPassword >=", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordLessThan(String value) {
            addCriterion("userAccessPassword <", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordLessThanOrEqualTo(String value) {
            addCriterion("userAccessPassword <=", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordLike(String value) {
            addCriterion("userAccessPassword like", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordNotLike(String value) {
            addCriterion("userAccessPassword not like", value, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordIn(List<String> values) {
            addCriterion("userAccessPassword in", values, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordNotIn(List<String> values) {
            addCriterion("userAccessPassword not in", values, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordBetween(String value1, String value2) {
            addCriterion("userAccessPassword between", value1, value2, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUseraccesspasswordNotBetween(String value1, String value2) {
            addCriterion("userAccessPassword not between", value1, value2, "useraccesspassword");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNull() {
            addCriterion("userGender is null");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNotNull() {
            addCriterion("userGender is not null");
            return (Criteria) this;
        }

        public Criteria andUsergenderEqualTo(String value) {
            addCriterion("userGender =", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotEqualTo(String value) {
            addCriterion("userGender <>", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThan(String value) {
            addCriterion("userGender >", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThanOrEqualTo(String value) {
            addCriterion("userGender >=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThan(String value) {
            addCriterion("userGender <", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThanOrEqualTo(String value) {
            addCriterion("userGender <=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLike(String value) {
            addCriterion("userGender like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotLike(String value) {
            addCriterion("userGender not like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderIn(List<String> values) {
            addCriterion("userGender in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotIn(List<String> values) {
            addCriterion("userGender not in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderBetween(String value1, String value2) {
            addCriterion("userGender between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotBetween(String value1, String value2) {
            addCriterion("userGender not between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("userTel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("userTel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("userTel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("userTel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("userTel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("userTel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "usertel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
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
     * This class corresponds to the database table users
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