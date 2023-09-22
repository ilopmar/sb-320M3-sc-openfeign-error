package com.example.openfeing.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "todoClient", url = "https://jsonplaceholder.typicode.com")
public interface MyTodoTodoClient extends MyTodoApi {

}
