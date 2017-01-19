
import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PlinkoMethods {
    int RandomQuestion(JTextField txt){
        int a, b,c,ans;
        Random r=new Random();
        a=r.nextInt(500);
        b=r.nextInt(500); 
        c=r.nextInt(2);
        if (c==0){
            ans=a+b;
            txt.setText(a+ "+"+b);
        }
        else{
            ans=a-b;
            txt.setText(a+ "-"+b);
        }
        return ans;
    }
    int QuestionAnswer (int chips,int ans,JTextField answer, JTextField txt){
        String input =answer.getText();
        if(parseInt(input)==ans){
            chips++;
            txt.setText("Correct!");
        }
        else{
            txt.setText("Wrong, the answer was "+ ans);
        }
        return chips;
    }
}
