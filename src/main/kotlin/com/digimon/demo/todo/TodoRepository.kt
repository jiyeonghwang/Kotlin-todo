package com.digimon.demo.domain.todo

import com.digimon.demo.domain.Todo
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface TodoRepository : ReactiveCrudRepository<Todo, Long>