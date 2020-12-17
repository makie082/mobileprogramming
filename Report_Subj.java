public class Report_Subj extends Subj {
    int r_dueDate = 0; // 슈퍼 클래스의 필드 중 cnt 대신 report_cnt 사용
    Report_Subj(String subjN, int r_dueDate, int today){
        super(subjN, r_dueDate, today);
        report_cnt ++;
    }

    void print_info (){
        System.out.println("--------------------------");
        System.out.println("< 제출해야할 report 과제 >");
        System.out.println("과목 : " + get_subjN());
        System.out.println("제출 날짜 : "+ get_duedate());
        System.out.println("제출까지 남은 기간 : "+ get_period());
    }
}