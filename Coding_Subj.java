public class Coding_Subj extends Subj {
    int c_dueDate = 0; // 슈퍼 클래스의 필드 중 cnt 대신 coding_cnt 사용

    Coding_Subj(String subjN, int c_dueDate, int today, String color, String lang){
        super(subjN,c_dueDate, today,color,lang);
        coding_cnt ++;
    }

    void print_info (){
        System.out.println("--------------------------");
        System.out.println("< 제출해야할 coding 과제 >");
        System.out.println("과목 : " + get_subjN());
        System.out.println("사용하는 언어 : " + get_lang());
        System.out.println("제출 날짜 : "+ get_duedate());
        System.out.println("제출까지 남은 기간 : "+get_period());
    }
}