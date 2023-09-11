package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

@Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test";

    @Test
    void testFindByListName() {
        TaskList taskList = new TaskList("LISTA",DESCRIPTION);
        taskListDao.save(taskList);

        String taskListTempValue = taskList.getListName();

        List<TaskList> readTaskList = taskListDao.findByListName(taskListTempValue);

        assertEquals(1,readTaskList.size());

        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
