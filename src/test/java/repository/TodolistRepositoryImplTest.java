package repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.Todolist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;

import javax.sql.DataSource;

public class TodolistRepositoryImplTest {

  private HikariDataSource dataSource;

  private TodoListRepository todoListRepository;

  @BeforeEach
  void setUp() {
    dataSource = DatabaseUtil.getDataSource();
    todoListRepository = new TodoListRepositoryImpl(dataSource);
  }

  @Test
  void testAdd() {
    Todolist todolist = new Todolist();
    todolist.setTodo("Kurniawan");

    todoListRepository.add(todolist);
  }

  @Test
  void testRemove() {
    System.out.println(todoListRepository.remove(1));
    System.out.println(todoListRepository.remove(2));
    System.out.println(todoListRepository.remove(3));
    System.out.println(todoListRepository.remove(4));
  }

  @Test
  void testGetAll() {
    todoListRepository.add(new Todolist("EKo"));
    todoListRepository.add(new Todolist("Kurniawan"));
    todoListRepository.add(new Todolist("Khannedy"));

    Todolist[] todolists = todoListRepository.getAll();
    for (var todo : todolists) {
      System.out.println(todo.getId() + " : " + todo.getTodo());
    }
  }

  @AfterEach
  void tearDown() {
    dataSource.close();
  }
}
