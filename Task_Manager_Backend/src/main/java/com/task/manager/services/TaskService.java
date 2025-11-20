package com.task.manager.services;

import com.task.manager.domain.entities.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    List<Task> listTasks(UUID taskListId);
    Task createTask(UUID taskListId, Task task);
    Optional<Task> getTask(UUID taskListId, UUID taskId);
    Task updateTask(UUID taskListID, UUID taskId, Task task);
    void deleteTask(UUID taskListId, UUID taskId);
}
