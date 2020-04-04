package com.vivi.bugTracking.dao.mapper;

import com.vivi.bugTracking.model.Department;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
        "classpath*:db-test-unit.xml"
})
public class DepartmentMapperTest {

    @Autowired
    DeptMapper deptMapper;

    @Test
    public void testSelectByLoginId() {
        assertNotNull(deptMapper);
        Set<Department> depts = deptMapper.selectAll();
        assertNotNull(depts);
    }
}