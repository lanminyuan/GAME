package �ɻ�С��Ϸ;
import java.awt.*;
import javax.swing.*;
public class Planegame extends JFrame{   
	
	double x=100;
	double y=100;
	boolean right=true;
	

	//����ͼƬ
	Image ���=Toolkit.getDefaultToolkit().getImage("images/���.jpg");
	Image �ɻ�=Toolkit.getDefaultToolkit().getImage("images/�ɻ�.png");
	//ʹͼƬ�����ڴ�����
	public void paint(Graphics g) {
		System.out.println("������һ��");
		g.drawImage(���, 0, 0, null);
		g.drawImage(�ɻ�,(int)x,(int)y,null);
		
	if(right) {
		x=x+10;
	}else {
		x=x-10;
	}
	if(x>800) {
		right=false;
	}
	if(x<30) {
		right=true;
	}
	}
	
	//���ִ���
	void lunchFrame() {
		setSize(850,600);
		setLocation(400,400);
		setVisible(true);
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public  static void main(String[] args) {
 
		System.out.println("��һ��Ȧ");
		Planegame game=new Planegame();
		game.lunchFrame();
		
		}

	
}
