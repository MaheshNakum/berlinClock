/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Second {

    private int second;

    public Second(int second){
        this.second = second;
    }

    public String convertSecond(){
        if (second % 2 == 0){
            return "Y";
        }
        return "O";
    }
}
