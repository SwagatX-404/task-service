package com.swg.service;

import com.swg.model.Task;
import com.swg.model.TaskStatus;
import com.swg.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Task createTask(Task task, String requesterRole) throws Exception {

        return null;
    }

    @Override
    public Task getTaskById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Task> getAllTask(TaskStatus status) {
        return List.of();
    }

    @Override
    public Task updateTask(Long id, Task updatedTask, Long userId) throws Exception {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public Task assignedToUser(Long userId, Long taskId) throws Exception {
        return null;
    }

    @Override
    public List<Task> assignedUsersTask(Long userId, TaskStatus status) {
        return List.of();
    }

    @Override
    public Task completeTask(Long taskId) throws Exception {
        return null;
    }
}
