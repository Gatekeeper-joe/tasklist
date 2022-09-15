package com.example.tasklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * タスク管理アプリケーションのメインクラス
 */
public class TaskListApplication {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TaskListApplication.class, args);
	}

}
