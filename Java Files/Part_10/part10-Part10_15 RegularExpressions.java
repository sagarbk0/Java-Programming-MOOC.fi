
public class Checker {
    public boolean isDayOfWeek(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string){
        return (string.matches("(a|e|i|o|u)*"));
    }
    
    public boolean timeOfDay(String string){
        return string.matches("([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])");
//        return string.matches("(0[0-9]|[10-23]):(0[0-9]|[10-59]):(0[0-9]|[10-59])");
    }
}