// 비대면 강의가 지속되면서 해야할 과제가 상당히 늘어났고
// 확인하는 것이 어려워 만들게 되었다
// Subj라는 부모 클래스에 과제의 종류에 따라서 report와 coding을 자식 클래스로 두고 나누었다

abstract class Subj { // 매장 내 직원과 알바관리
    // 필드
    String subjN = ""; // 과목명
    int dueDate = 0; //제출기한
    int today = 0; //오늘 날짜
    int period = 0; //제출기간까지 남은 날짜
    String lang = ""; // 언어

    static int wholeCnt=0; //과제 개수
    static int report_cnt=0;
    static int coding_cnt=0;

    Subj(String subjN, int duedate, int today){
        this.subjN = subjN;
        this.dueDate = duedate;
        this.today = today;
        wholeCnt ++;
    }

    Subj(String subjN, int duedate, int today, String lang){
        this.subjN = subjN;
        this.dueDate = duedate;
        this.today = today;
        this.lang = lang;
        wholeCnt ++;
    }

    //method
    public static int get_wholecnt(){return wholeCnt;}
    public static int get_codingcnt(){return coding_cnt;}
    public static int get_reportcnt(){return report_cnt;}

    String get_subjN(){return subjN;}
    int get_duedate(){return dueDate;}
    int get_today(){return today;}
    String get_lang(){return lang;}
    int get_period(){ //오늘부로 남은 날짜 알아보기
        period = dueDate-today;
        if (period < 0){
            period = period + 31;
        }
        if (period < 3){
            System.out.println("과제를 빨리 끝내야합니다.");
        }
        return period;
    }
    void replaceDuedate(int day){ // 교수님이 과제기한 연장해주시기
        dueDate += day;
        if (dueDate > 31){
            dueDate -= 31;
        }
    }
    void print_info (){
        System.out.println("--------------------------");
        System.out.println("< 제출해야할 과제 >");
        System.out.println("과목 : " + get_subjN());
        System.out.println("제출 날짜 : "+ get_duedate());
        System.out.println("제출까지 남은 기간 : "+ get_period());
    }
}
