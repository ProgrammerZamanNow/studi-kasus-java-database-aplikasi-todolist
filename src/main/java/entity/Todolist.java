package entity;

public class Todolist {

  private Integer id;

  private String todo;

  public Todolist() {
  }

  public Todolist(String todo) {
    this.todo = todo;
  }

  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
