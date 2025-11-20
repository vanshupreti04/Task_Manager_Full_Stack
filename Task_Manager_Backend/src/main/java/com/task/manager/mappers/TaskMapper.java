package com.task.manager.mappers;

import com.task.manager.domain.dto.TaskDto;
import com.task.manager.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
