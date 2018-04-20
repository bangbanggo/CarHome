package edu.black.service.impl;

import edu.black.dao.FeedbacksMapper;
import edu.black.model.Feedbacks;
import edu.black.model.FeedbacksExample;
import edu.black.service.FeedbackService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FeedbackServiceImpl implements FeedbackService {

    private SqlSessionFactory factory;
    private List<Feedbacks> feedbackList = null;
    private Feedbacks client = null;

    public FeedbackServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Feedbacks feedback) {
        SqlSession session = factory.openSession();
        FeedbacksMapper mapper = session.getMapper(FeedbacksMapper.class);
        boolean result = mapper.insertSelective(feedback)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean update(Feedbacks feedback) {
        SqlSession session = factory.openSession();
        FeedbacksMapper mapper = session.getMapper(FeedbacksMapper.class);
        boolean result = mapper.updateByPrimaryKeySelective(feedback)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public Feedbacks getFeedback(Feedbacks feedback) {
        SqlSession session = factory.openSession();
        FeedbacksMapper mapper = session.getMapper(FeedbacksMapper.class);
        client = mapper.selectByPrimaryKey(feedback.getFeedbackid());
        session.close();
        return client;
    }
    @Override
    public List<Feedbacks> queryall(Feedbacks feedback) {
        SqlSession session = factory.openSession();
        FeedbacksMapper mapper = session.getMapper(FeedbacksMapper.class);
        FeedbacksExample example = new FeedbacksExample();
        if (feedback.getFeedbackdate()!=null) {
            example.createCriteria().andFeedbackdateLike("%" + feedback.getFeedbackdate() + "%");
        }else if (feedback.getClient()!=null) {
            feedbackList = mapper.selectByFeedback(feedback);
        }else {
            feedbackList = mapper.selectByExample(example);
        }
        session.close();
        return feedbackList;
    }

    @Override
    public boolean delete(List<Feedbacks> feedbackList) {
        List<Integer> ids = new ArrayList<>();
        for (Feedbacks feedback:feedbackList){
            ids.add(feedback.getFeedbackid());
        }
        SqlSession session = factory.openSession();
        FeedbacksMapper mapper = session.getMapper(FeedbacksMapper.class);
        FeedbacksExample example = new FeedbacksExample();
        example.createCriteria().andFeedbackidIn(ids);
        mapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }
}
