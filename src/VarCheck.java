import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class VarCheck {

	public static int levelspassed = 0;
	public static int disableCount=0;
	public static Border border = BorderFactory.createDashedBorder(Color.green,12, 1,1,true);
	public static Border border1 = BorderFactory.createDashedBorder(Color.red,12, 1,1,true);
	
	public VarCheck() {
		
	}
	
	public static void checklevels() {
		if(levelspassed==0) {
			levelCheck.Level1.setBorder(border);
		}
		if(levelspassed==1) {
			levelCheck.Level2.setBorder(border);
		}
		if(levelspassed==2) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
		}
		if(levelspassed==3) {
			levelCheck.Level3.setBorder(border);
			levelCheck.Level2.setBorder(border);
			levelCheck.Level4.setBorder(border);
		}
		if(levelspassed==4) {
			levelCheck.Level3.setBorder(border);
			levelCheck.Level2.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
		}
		if(levelspassed==5) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
			levelCheck.Level6.setBorder(border);
		}
		if(levelspassed==6) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
			levelCheck.Level6.setBorder(border);
			levelCheck.Level7.setBorder(border);
		}
		if(levelspassed==7) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
			levelCheck.Level6.setBorder(border);
			levelCheck.Level7.setBorder(border);
			levelCheck.Level8.setBorder(border);
		}
		if(levelspassed==8) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
			levelCheck.Level6.setBorder(border);
			levelCheck.Level7.setBorder(border);
			levelCheck.Level8.setBorder(border);
			levelCheck.Level9.setBorder(border);
		}
		if(levelspassed>=9) {
			levelCheck.Level2.setBorder(border);
			levelCheck.Level3.setBorder(border);
			levelCheck.Level4.setBorder(border);
			levelCheck.Level5.setBorder(border);
			levelCheck.Level6.setBorder(border);
			levelCheck.Level7.setBorder(border);
			levelCheck.Level8.setBorder(border);
			levelCheck.Level9.setBorder(border);
			levelCheck.Level10.setBorder(border);
		}
	}
}
