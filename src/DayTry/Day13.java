package DayTry;

public class Day13 {
    public static void main(String[] args) {
        Day13 obj13 = new Day13();
        obj13.striptrailing();
        obj13.linearsearch();
    }

    void linearsearch(){
        String s = "Hello Mohamed Bahir Hussain";
        char key = 'a';
        int flag = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == key){
                count++;
                flag = 1;
            }
        }
        if(flag == 0) {
            System.out.println("Sorry your element is not find in here");
        }
        System.out.println(count);
    }

    void striptrailing(){
        String s = "Hello Mohamed Bahir Hussain        ";
        System.out.println(s.length());
        int end = 0;
        int count = 0;
        for(int i=s.length()-1; i>= 0; i--){
            if(s.charAt(i) == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for (int i=0; i<=end; i++){
            System.out.print(s.charAt(i));
            count ++;
        }
        System.out.println();
        System.out.println(count);
    }
}
