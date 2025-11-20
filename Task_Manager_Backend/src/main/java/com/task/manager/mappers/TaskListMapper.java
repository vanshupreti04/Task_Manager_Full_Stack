package com.task.manager.mappers;

import com.task.manager.domain.dto.TaskListDto;
import com.task.manager.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
