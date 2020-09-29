package com.offcn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserStartApplication.class)
public class TestUserStartApplication {
    Logger logger = LoggerFactory.getLogger(getClass());  //引入日志文件
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void contextLoads(){
      // redisTemplate.opsForValue().set("msg1","欢迎来优就业学习");
        stringRedisTemplate.opsForValue().set("msg","欢迎来优就业学习！");
        logger.debug("操作成功");
    }






}
