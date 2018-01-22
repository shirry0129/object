import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> student_list = new ArrayList<Student>();
		student_list.add(new Student("古川彩音",45,401));
		student_list.add(new Student("相沢未鈴",100,402));
		student_list.add(new Student("成瀬梨紗",75,403));
		student_list.add(new Student("夢眠瑛美",83,404));
		student_list.add(new Student("藤咲ねむ",64,405));

		for(int i=0;i<student_list.size();i++) {
			System.out.println(student_list.get(i).getStudent_number()+" "+student_list.get(i).getName()+":"+student_list.get(i).getScore());
		}

		student_list.sort(new ScoreComparator());
		for(int i=0;i<student_list.size();i++) {
			System.out.println((i+1)+" "+student_list.get(i).getStudent_number()+" "+student_list.get(i).getName()+":"+student_list.get(i).getScore());
		}
	}

}

class Student{
	private String name;
	private int score;
	private int student_number;

	Student(String name,int score,int student_number){
		setName(name);
		setScore(score);
		setStudent_number(student_number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getStudent_number() {
		return student_number;
	}

	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
}

class ScoreComparator implements Comparator<Student>{
	public int compare(Student student1,Student student2) {
		int score1 = student1.getScore();
		int score2 = student2.getScore();

		if(score1>score2) {
			return -1;
		}
		else if(score1==score2) {
			return 0;
		}
		else { //if(score1<score2) {
			return 1;
		}
	}
}