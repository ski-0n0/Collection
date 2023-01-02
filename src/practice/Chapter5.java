package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.Task.SortByDate;

public class Chapter5 {

	public static void main(String[] args) {

		// プログラムを作成
		List<Task> taskList = new ArrayList<Task>();

		taskList.add(new Task("2021年10月21日", "牛乳を買う。"));
		taskList.add(new Task("2021年9月15日", "○○社面談。"));
		taskList.add(new Task("2021年12月4日", "手帳を買う。"));
		taskList.add(new Task("2021年8月10日", "散髪に行く。"));
		taskList.add(new Task("2021年11月9日", "スクールの課題を解く。"));

		Collections.sort(taskList, new SortByDate());

		StringBuilder s = new StringBuilder();

		for (Task task : taskList) {
			s.append(task.getDate()).append(":").append(task.getContent()).append("\n");
		}
		System.out.println(s.toString());
	}

}