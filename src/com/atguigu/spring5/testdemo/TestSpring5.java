package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml");
        //多了一行
        Book book = context.getBean( "book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
}