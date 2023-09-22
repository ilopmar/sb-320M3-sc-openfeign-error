package com.example.openfeing.client;

import feign.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface MyTodoApi {

  @RequestMapping(method = RequestMethod.GET, value = "/todos/{todoId}")
  Todo findTodoById(@Param("todoId") String todoId);

    record Todo(Long id, Long userId, String title, boolean completed) {

    }

}
