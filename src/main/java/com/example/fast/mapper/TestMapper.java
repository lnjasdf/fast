package com.example.fast.mapper;

import com.example.fast.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lnjasdf on 2017/7/14.
 */
@Mapper
public interface TestMapper {

    @Select("SELECT user_id strValue, can_message intValue FROM t_filtered_user")
    List<TestEntity> listFilteredUser();
}
