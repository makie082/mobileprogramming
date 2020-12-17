import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("< 과제 확인 프로그램 >");

        Report_Subj[] rs = new Report_Subj[4];
        Coding_Subj[] cs = new Coding_Subj[2];

        rs[0] = new Report_Subj("computer structure", 31, 17, "blue");
        rs[1] = new Report_Subj("mobile programming", 20, 17, "black");
        rs[2] = new Report_Subj("Algorithm", 25, 17, "red");
        rs[3] = new Report_Subj("understanding of performance arts", 3, 17, "purple");

        cs[0] = new Coding_Subj("system programming", 1, 17, "pink","C++");
        cs[1] = new Coding_Subj("digital circuit", 29, 17, "grey","Python");

        for (int i=0; i<rs.length; i++){
            rs[i].print_info();
        }
        for (int j=0; j<cs.length; j++){
            cs[j].print_info();
        }

        System.out.println("--------------------------");
        System.out.println("\n해야하는 모든 과제 개수 : " + Subj.get_wholecnt());
        System.out.println("해야하는 report 과제 개수 : " + Subj.get_reportcnt());
        System.out.println("해야하는 coding 과제 개수 : " + Subj.get_codingcnt());

        rs[3].replaceDuedate(3);
        System.out.println("\n"+rs[3].get_subjN()+"의 변경된 제출 날짜는 " + rs[3].get_duedate() + "일까지 입니다");

        // 검색
        for (int a=0; a<rs.length; a++){
            if (rs[a].get_period() < 5){
                System.out.println(rs[a].subjN+"의 제출기한이 "+rs[a].get_period()+"일만큼 남았습니다. 서둘러 끝내세요.");
            }
        }
        for (int b=0; b<cs.length; b++){
            if (cs[b].get_period() < 5){
                System.out.println(cs[b].subjN+"의 제출기한이 "+cs[b].get_period()+"일만큼 남았습니다. 서둘러 끝내세요.");
            }
        }

    }
}