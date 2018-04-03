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
			level1.Level1.setBorder(border);
		}
		if(levelspassed==1) {
			level1.Level2.setBorder(border);
		}
		if(levelspassed==2) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
		}
		if(levelspassed==3) {
			level1.Level3.setBorder(border);
			level1.Level2.setBorder(border);
			level1.Level4.setBorder(border);
		}
		if(levelspassed==4) {
			level1.Level3.setBorder(border);
			level1.Level2.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
		}
		if(levelspassed==5) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
			level1.Level6.setBorder(border);
		}
		if(levelspassed==6) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
			level1.Level6.setBorder(border);
			level1.Level7.setBorder(border);
		}
		if(levelspassed==7) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
			level1.Level6.setBorder(border);
			level1.Level7.setBorder(border);
			level1.Level8.setBorder(border);
		}
		if(levelspassed==8) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
			level1.Level6.setBorder(border);
			level1.Level7.setBorder(border);
			level1.Level8.setBorder(border);
			level1.Level9.setBorder(border);
		}
		if(levelspassed>=9) {
			level1.Level2.setBorder(border);
			level1.Level3.setBorder(border);
			level1.Level4.setBorder(border);
			level1.Level5.setBorder(border);
			level1.Level6.setBorder(border);
			level1.Level7.setBorder(border);
			level1.Level8.setBorder(border);
			level1.Level9.setBorder(border);
			level1.Level10.setBorder(border);
		}
	}
}
