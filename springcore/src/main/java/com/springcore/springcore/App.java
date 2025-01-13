package com.springcore.springcore;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext contxt = new ClassPathXmlApplication(config.xml);
    Student student = contxt.getBean("student");
    System.out.println(student);
  }
}
