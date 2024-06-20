package com.zadachadz.les14.gr_and_st;

public class Group {

	private Student[] students;

	public Group(Student[] students) { // конструктор, принимающий массив студентов
		this.students = students; // и инициализирующий поле student данного объекта класса Group этим массивом
	}

	public void printBestMarks() { // метод для выведения лучших оценок
		System.out.println("Наши умницы:");
		for (Student student : students) {
			int[] bestMarks = student.getmarks();
			boolean best = true;
			for (int i : bestMarks) {
				if (i < 9) {
					best = false;
					break;
				}
			}
			if (best) {
				System.out.println(student.getlastNameAndName() + ", номер группы " + student.getnumberOfGroup());
			}
		}
	}
}
