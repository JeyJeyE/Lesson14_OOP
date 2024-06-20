package com.zadachadz.les14.gr_and_st;

public class Main {

	public static void main(String[] args) {
		Student[] st = new Student[10]; //rонструктор класса Student принимает имя, номер группы и массив оценок
		st = masStudents(st);//метод инициализирует массив студентов. cоздает объектs типа Student с именами, номерами групп и оценками.
		
		Group group = new Group(st);
        group.printBestMarks(); 
	}

	public static Student[] masStudents(Student[] st) {		
		st[0] = new Student("Незнающий В.В.", 10705219, new int[] { 8, 7, 7, 8, 8 });
		st[1] = new Student("Потеряшкин П.П.", 10705219, new int[] { 5, 9, 10, 9, 8 });
		st[2] = new Student("Пушкин А.С.", 10705219, new int[] { 9, 9, 9, 9, 9 });
		st[3] = new Student("Иванов И.И.", 10705219, new int[] { 3, 9, 9, 9, 9 });
		st[4] = new Student("Краснов Г.И.", 10705219, new int[] { 5, 8, 7, 8, 7 });
		st[5] = new Student("Александровский Ф.Х.", 10705119, new int[] { 10, 10, 10, 10, 10 });
		st[6] = new Student("Джаванов А. Л.", 10705119, new int[] { 2, 5, 8, 4, 8 });
		st[7] = new Student("Харитонов З.И.", 10705119, new int[] { 9, 9, 9, 8, 9 });
		st[8] = new Student("Потемкин З.У.", 10705119, new int[] { 9, 8, 0, 7, 9 });
		st[9] = new Student("Эрнст К.Г.", 10705119, new int[] { 5, 6, 7, 6, 7 });
		return st;
	}

}
