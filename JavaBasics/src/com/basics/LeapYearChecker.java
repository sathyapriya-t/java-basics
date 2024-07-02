public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year <= 0){
            return false;
        }
        else if(year%4 ==0 && year%100 !=0){
            if(year%400 == 0){
                return false;
            }
            return true;
        }
        else if(year%4 ==0 && year%100 == 0){
            if(year%400 ==0){
                return true;
            }
            return false;
        }
        return false;

    }
    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        leapYearChecker.isLeapYear(2048)
    }

    }