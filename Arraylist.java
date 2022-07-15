package collection;

import java.util.ArrayList;
import java.util.Scanner;

import array.Student;

public class Arraylist {

	public static void main(String[] args) {
		// 배열
		int[] score = new int[3];
		
		// 정적배열(객체배열)
		Student[] stu = new Student[3];
		Scanner in = new Scanner(System.in);
		/*
		stu[0]=new Student("박은희",95);
		stu[1]=new Student("김은진",90);
		stu[2]=new Student("김태영",83);
		
		for(int i=0; i<stu.length; i++){
			System.out.println(stu[i].name+", "+stu[i].sum);
			System.out.println(stu[i]);
			}
		*/
		
		/*
		for(int i=0; i<stu.length; i++){
			stu[i]=new Student();
			stu[i].name=in.nextLine();
			stu[i].sum=in.nextInt();
		}*/
		
		
		// 동적배열(Arraylist)
		//        제네릭(Generic)
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
	
		//ArrayList<Student> als = new ArrayList<>();
		/*
		als.add(new Student("박은희",95));
		als.add(new Student("김은진",80));
		als.add(new Student("김태영",73));
		
		for(Student st: als){
			System.out.println(st.name + ", " + st.sum);
			}*/
		Student stu2 = new Student();
		ArrayList<Student> als = new ArrayList<>();
		stu2.name="정자바";
		stu2.sum=100;
		als.add(stu2);
		stu2 = new Student();
		stu2.name="홍길동";
		stu2.sum=100;
		als.add(stu2);
		stu2 = new Student();
		stu2.name="최씨";
		stu2.sum=100;
		als.add(stu2);
	
				
		for(int i=0; i<als.size();i++) {
			System.out.println(als.get(i).name);
			System.out.println(als.get(i).sum);
		}
	}

}
