package testPalin;

public class LangueAnglaise implements LangueInterface{
    @Override
    public String Félicitation() {
        return Expressions.WellSaid;
    }
    public String GetSalutation(int hour) {
        if (hour >= 18 && hour < 24) {
            return Expressions.GoodEvening;
        }else if(hour >= 12 && hour < 18) {
            return Expressions.GoodAfternoon;
        }else if(hour >= 0 && hour < 6) {
            return Expressions.GoodNight;
        }else {
            return Expressions.Hello;
        }
    }

    public String GetAuRevoir(int hour) {
        if (hour >= 18 && hour < 24) {
            return Expressions.GoodbyeNight;
        }else if (hour >= 0 && hour < 6){
            return Expressions.SleepTight;
        }else if(hour >= 12 && hour < 18) {
            return Expressions.GoodbyeAfternoon;
        }else{
            return Expressions.GoodbyeMorning;
        }
    }

    public String ChaineVide(){
        return Expressions.Repeat;
    }
}
