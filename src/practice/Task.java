package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Task {

	// プログラムを作成
	private LocalDate date;
	private String content;

	public Task(String date, String content) {
		this.setDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy年M月d日")));
		this.setContent(content);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	static class SortByDate implements Comparator<Task> {
		@Override
		public int compare(Task a, Task b) {
			return a.getDate().compareTo(b.getDate());
		}
	}

}