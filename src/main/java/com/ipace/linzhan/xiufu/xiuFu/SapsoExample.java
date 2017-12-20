package com.ipace.linzhan.xiufu.xiuFu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SapsoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SapsoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIsNull() {
            addCriterion("timeSameBatch is null");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIsNotNull() {
            addCriterion("timeSameBatch is not null");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchEqualTo(String value) {
            addCriterion("timeSameBatch =", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotEqualTo(String value) {
            addCriterion("timeSameBatch <>", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchGreaterThan(String value) {
            addCriterion("timeSameBatch >", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchGreaterThanOrEqualTo(String value) {
            addCriterion("timeSameBatch >=", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLessThan(String value) {
            addCriterion("timeSameBatch <", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLessThanOrEqualTo(String value) {
            addCriterion("timeSameBatch <=", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLike(String value) {
            addCriterion("timeSameBatch like", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotLike(String value) {
            addCriterion("timeSameBatch not like", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIn(List<String> values) {
            addCriterion("timeSameBatch in", values, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotIn(List<String> values) {
            addCriterion("timeSameBatch not in", values, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchBetween(String value1, String value2) {
            addCriterion("timeSameBatch between", value1, value2, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotBetween(String value1, String value2) {
            addCriterion("timeSameBatch not between", value1, value2, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andOsnoIsNull() {
            addCriterion("osNo is null");
            return (Criteria) this;
        }

        public Criteria andOsnoIsNotNull() {
            addCriterion("osNo is not null");
            return (Criteria) this;
        }

        public Criteria andOsnoEqualTo(String value) {
            addCriterion("osNo =", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotEqualTo(String value) {
            addCriterion("osNo <>", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoGreaterThan(String value) {
            addCriterion("osNo >", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoGreaterThanOrEqualTo(String value) {
            addCriterion("osNo >=", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLessThan(String value) {
            addCriterion("osNo <", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLessThanOrEqualTo(String value) {
            addCriterion("osNo <=", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLike(String value) {
            addCriterion("osNo like", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotLike(String value) {
            addCriterion("osNo not like", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoIn(List<String> values) {
            addCriterion("osNo in", values, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotIn(List<String> values) {
            addCriterion("osNo not in", values, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoBetween(String value1, String value2) {
            addCriterion("osNo between", value1, value2, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotBetween(String value1, String value2) {
            addCriterion("osNo not between", value1, value2, "osno");
            return (Criteria) this;
        }

        public Criteria andEbnoIsNull() {
            addCriterion("ebNo is null");
            return (Criteria) this;
        }

        public Criteria andEbnoIsNotNull() {
            addCriterion("ebNo is not null");
            return (Criteria) this;
        }

        public Criteria andEbnoEqualTo(String value) {
            addCriterion("ebNo =", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoNotEqualTo(String value) {
            addCriterion("ebNo <>", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoGreaterThan(String value) {
            addCriterion("ebNo >", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoGreaterThanOrEqualTo(String value) {
            addCriterion("ebNo >=", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoLessThan(String value) {
            addCriterion("ebNo <", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoLessThanOrEqualTo(String value) {
            addCriterion("ebNo <=", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoLike(String value) {
            addCriterion("ebNo like", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoNotLike(String value) {
            addCriterion("ebNo not like", value, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoIn(List<String> values) {
            addCriterion("ebNo in", values, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoNotIn(List<String> values) {
            addCriterion("ebNo not in", values, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoBetween(String value1, String value2) {
            addCriterion("ebNo between", value1, value2, "ebno");
            return (Criteria) this;
        }

        public Criteria andEbnoNotBetween(String value1, String value2) {
            addCriterion("ebNo not between", value1, value2, "ebno");
            return (Criteria) this;
        }

        public Criteria andCaigounoIsNull() {
            addCriterion("caiGouNo is null");
            return (Criteria) this;
        }

        public Criteria andCaigounoIsNotNull() {
            addCriterion("caiGouNo is not null");
            return (Criteria) this;
        }

        public Criteria andCaigounoEqualTo(String value) {
            addCriterion("caiGouNo =", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoNotEqualTo(String value) {
            addCriterion("caiGouNo <>", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoGreaterThan(String value) {
            addCriterion("caiGouNo >", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoGreaterThanOrEqualTo(String value) {
            addCriterion("caiGouNo >=", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoLessThan(String value) {
            addCriterion("caiGouNo <", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoLessThanOrEqualTo(String value) {
            addCriterion("caiGouNo <=", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoLike(String value) {
            addCriterion("caiGouNo like", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoNotLike(String value) {
            addCriterion("caiGouNo not like", value, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoIn(List<String> values) {
            addCriterion("caiGouNo in", values, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoNotIn(List<String> values) {
            addCriterion("caiGouNo not in", values, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoBetween(String value1, String value2) {
            addCriterion("caiGouNo between", value1, value2, "caigouno");
            return (Criteria) this;
        }

        public Criteria andCaigounoNotBetween(String value1, String value2) {
            addCriterion("caiGouNo not between", value1, value2, "caigouno");
            return (Criteria) this;
        }

        public Criteria andPrdnoIsNull() {
            addCriterion("prdNo is null");
            return (Criteria) this;
        }

        public Criteria andPrdnoIsNotNull() {
            addCriterion("prdNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrdnoEqualTo(String value) {
            addCriterion("prdNo =", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotEqualTo(String value) {
            addCriterion("prdNo <>", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoGreaterThan(String value) {
            addCriterion("prdNo >", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoGreaterThanOrEqualTo(String value) {
            addCriterion("prdNo >=", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLessThan(String value) {
            addCriterion("prdNo <", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLessThanOrEqualTo(String value) {
            addCriterion("prdNo <=", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLike(String value) {
            addCriterion("prdNo like", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotLike(String value) {
            addCriterion("prdNo not like", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoIn(List<String> values) {
            addCriterion("prdNo in", values, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotIn(List<String> values) {
            addCriterion("prdNo not in", values, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoBetween(String value1, String value2) {
            addCriterion("prdNo between", value1, value2, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotBetween(String value1, String value2) {
            addCriterion("prdNo not between", value1, value2, "prdno");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNull() {
            addCriterion("saphh is null");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNotNull() {
            addCriterion("saphh is not null");
            return (Criteria) this;
        }

        public Criteria andSaphhEqualTo(String value) {
            addCriterion("saphh =", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotEqualTo(String value) {
            addCriterion("saphh <>", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThan(String value) {
            addCriterion("saphh >", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThanOrEqualTo(String value) {
            addCriterion("saphh >=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThan(String value) {
            addCriterion("saphh <", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThanOrEqualTo(String value) {
            addCriterion("saphh <=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLike(String value) {
            addCriterion("saphh like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotLike(String value) {
            addCriterion("saphh not like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhIn(List<String> values) {
            addCriterion("saphh in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotIn(List<String> values) {
            addCriterion("saphh not in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhBetween(String value1, String value2) {
            addCriterion("saphh between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotBetween(String value1, String value2) {
            addCriterion("saphh not between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andSapphIsNull() {
            addCriterion("sapph is null");
            return (Criteria) this;
        }

        public Criteria andSapphIsNotNull() {
            addCriterion("sapph is not null");
            return (Criteria) this;
        }

        public Criteria andSapphEqualTo(String value) {
            addCriterion("sapph =", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotEqualTo(String value) {
            addCriterion("sapph <>", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphGreaterThan(String value) {
            addCriterion("sapph >", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphGreaterThanOrEqualTo(String value) {
            addCriterion("sapph >=", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLessThan(String value) {
            addCriterion("sapph <", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLessThanOrEqualTo(String value) {
            addCriterion("sapph <=", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLike(String value) {
            addCriterion("sapph like", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotLike(String value) {
            addCriterion("sapph not like", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphIn(List<String> values) {
            addCriterion("sapph in", values, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotIn(List<String> values) {
            addCriterion("sapph not in", values, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphBetween(String value1, String value2) {
            addCriterion("sapph between", value1, value2, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotBetween(String value1, String value2) {
            addCriterion("sapph not between", value1, value2, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapwlmIsNull() {
            addCriterion("sapwlm is null");
            return (Criteria) this;
        }

        public Criteria andSapwlmIsNotNull() {
            addCriterion("sapwlm is not null");
            return (Criteria) this;
        }

        public Criteria andSapwlmEqualTo(String value) {
            addCriterion("sapwlm =", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotEqualTo(String value) {
            addCriterion("sapwlm <>", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmGreaterThan(String value) {
            addCriterion("sapwlm >", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmGreaterThanOrEqualTo(String value) {
            addCriterion("sapwlm >=", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLessThan(String value) {
            addCriterion("sapwlm <", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLessThanOrEqualTo(String value) {
            addCriterion("sapwlm <=", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLike(String value) {
            addCriterion("sapwlm like", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotLike(String value) {
            addCriterion("sapwlm not like", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmIn(List<String> values) {
            addCriterion("sapwlm in", values, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotIn(List<String> values) {
            addCriterion("sapwlm not in", values, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmBetween(String value1, String value2) {
            addCriterion("sapwlm between", value1, value2, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotBetween(String value1, String value2) {
            addCriterion("sapwlm not between", value1, value2, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andMaitounoIsNull() {
            addCriterion("maiTouNo is null");
            return (Criteria) this;
        }

        public Criteria andMaitounoIsNotNull() {
            addCriterion("maiTouNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaitounoEqualTo(String value) {
            addCriterion("maiTouNo =", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoNotEqualTo(String value) {
            addCriterion("maiTouNo <>", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoGreaterThan(String value) {
            addCriterion("maiTouNo >", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoGreaterThanOrEqualTo(String value) {
            addCriterion("maiTouNo >=", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoLessThan(String value) {
            addCriterion("maiTouNo <", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoLessThanOrEqualTo(String value) {
            addCriterion("maiTouNo <=", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoLike(String value) {
            addCriterion("maiTouNo like", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoNotLike(String value) {
            addCriterion("maiTouNo not like", value, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoIn(List<String> values) {
            addCriterion("maiTouNo in", values, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoNotIn(List<String> values) {
            addCriterion("maiTouNo not in", values, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoBetween(String value1, String value2) {
            addCriterion("maiTouNo between", value1, value2, "maitouno");
            return (Criteria) this;
        }

        public Criteria andMaitounoNotBetween(String value1, String value2) {
            addCriterion("maiTouNo not between", value1, value2, "maitouno");
            return (Criteria) this;
        }

        public Criteria andLuohaoIsNull() {
            addCriterion("luoHao is null");
            return (Criteria) this;
        }

        public Criteria andLuohaoIsNotNull() {
            addCriterion("luoHao is not null");
            return (Criteria) this;
        }

        public Criteria andLuohaoEqualTo(String value) {
            addCriterion("luoHao =", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoNotEqualTo(String value) {
            addCriterion("luoHao <>", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoGreaterThan(String value) {
            addCriterion("luoHao >", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoGreaterThanOrEqualTo(String value) {
            addCriterion("luoHao >=", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoLessThan(String value) {
            addCriterion("luoHao <", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoLessThanOrEqualTo(String value) {
            addCriterion("luoHao <=", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoLike(String value) {
            addCriterion("luoHao like", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoNotLike(String value) {
            addCriterion("luoHao not like", value, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoIn(List<String> values) {
            addCriterion("luoHao in", values, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoNotIn(List<String> values) {
            addCriterion("luoHao not in", values, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoBetween(String value1, String value2) {
            addCriterion("luoHao between", value1, value2, "luohao");
            return (Criteria) this;
        }

        public Criteria andLuohaoNotBetween(String value1, String value2) {
            addCriterion("luoHao not between", value1, value2, "luohao");
            return (Criteria) this;
        }

        public Criteria andGanghaoIsNull() {
            addCriterion("gangHao is null");
            return (Criteria) this;
        }

        public Criteria andGanghaoIsNotNull() {
            addCriterion("gangHao is not null");
            return (Criteria) this;
        }

        public Criteria andGanghaoEqualTo(String value) {
            addCriterion("gangHao =", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoNotEqualTo(String value) {
            addCriterion("gangHao <>", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoGreaterThan(String value) {
            addCriterion("gangHao >", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("gangHao >=", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoLessThan(String value) {
            addCriterion("gangHao <", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoLessThanOrEqualTo(String value) {
            addCriterion("gangHao <=", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoLike(String value) {
            addCriterion("gangHao like", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoNotLike(String value) {
            addCriterion("gangHao not like", value, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoIn(List<String> values) {
            addCriterion("gangHao in", values, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoNotIn(List<String> values) {
            addCriterion("gangHao not in", values, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoBetween(String value1, String value2) {
            addCriterion("gangHao between", value1, value2, "ganghao");
            return (Criteria) this;
        }

        public Criteria andGanghaoNotBetween(String value1, String value2) {
            addCriterion("gangHao not between", value1, value2, "ganghao");
            return (Criteria) this;
        }

        public Criteria andRealwidthIsNull() {
            addCriterion("realWidth is null");
            return (Criteria) this;
        }

        public Criteria andRealwidthIsNotNull() {
            addCriterion("realWidth is not null");
            return (Criteria) this;
        }

        public Criteria andRealwidthEqualTo(String value) {
            addCriterion("realWidth =", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthNotEqualTo(String value) {
            addCriterion("realWidth <>", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthGreaterThan(String value) {
            addCriterion("realWidth >", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthGreaterThanOrEqualTo(String value) {
            addCriterion("realWidth >=", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthLessThan(String value) {
            addCriterion("realWidth <", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthLessThanOrEqualTo(String value) {
            addCriterion("realWidth <=", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthLike(String value) {
            addCriterion("realWidth like", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthNotLike(String value) {
            addCriterion("realWidth not like", value, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthIn(List<String> values) {
            addCriterion("realWidth in", values, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthNotIn(List<String> values) {
            addCriterion("realWidth not in", values, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthBetween(String value1, String value2) {
            addCriterion("realWidth between", value1, value2, "realwidth");
            return (Criteria) this;
        }

        public Criteria andRealwidthNotBetween(String value1, String value2) {
            addCriterion("realWidth not between", value1, value2, "realwidth");
            return (Criteria) this;
        }

        public Criteria andReallengthIsNull() {
            addCriterion("realLength is null");
            return (Criteria) this;
        }

        public Criteria andReallengthIsNotNull() {
            addCriterion("realLength is not null");
            return (Criteria) this;
        }

        public Criteria andReallengthEqualTo(String value) {
            addCriterion("realLength =", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthNotEqualTo(String value) {
            addCriterion("realLength <>", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthGreaterThan(String value) {
            addCriterion("realLength >", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthGreaterThanOrEqualTo(String value) {
            addCriterion("realLength >=", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthLessThan(String value) {
            addCriterion("realLength <", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthLessThanOrEqualTo(String value) {
            addCriterion("realLength <=", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthLike(String value) {
            addCriterion("realLength like", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthNotLike(String value) {
            addCriterion("realLength not like", value, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthIn(List<String> values) {
            addCriterion("realLength in", values, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthNotIn(List<String> values) {
            addCriterion("realLength not in", values, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthBetween(String value1, String value2) {
            addCriterion("realLength between", value1, value2, "reallength");
            return (Criteria) this;
        }

        public Criteria andReallengthNotBetween(String value1, String value2) {
            addCriterion("realLength not between", value1, value2, "reallength");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaIsNull() {
            addCriterion("chengFenDaiMa is null");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaIsNotNull() {
            addCriterion("chengFenDaiMa is not null");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaEqualTo(String value) {
            addCriterion("chengFenDaiMa =", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaNotEqualTo(String value) {
            addCriterion("chengFenDaiMa <>", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaGreaterThan(String value) {
            addCriterion("chengFenDaiMa >", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaGreaterThanOrEqualTo(String value) {
            addCriterion("chengFenDaiMa >=", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaLessThan(String value) {
            addCriterion("chengFenDaiMa <", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaLessThanOrEqualTo(String value) {
            addCriterion("chengFenDaiMa <=", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaLike(String value) {
            addCriterion("chengFenDaiMa like", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaNotLike(String value) {
            addCriterion("chengFenDaiMa not like", value, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaIn(List<String> values) {
            addCriterion("chengFenDaiMa in", values, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaNotIn(List<String> values) {
            addCriterion("chengFenDaiMa not in", values, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaBetween(String value1, String value2) {
            addCriterion("chengFenDaiMa between", value1, value2, "chengfendaima");
            return (Criteria) this;
        }

        public Criteria andChengfendaimaNotBetween(String value1, String value2) {
            addCriterion("chengFenDaiMa not between", value1, value2, "chengfendaima");
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