package ��Ư;

import java.awt.*;
import java.awt.event.*;

public class CheckBoxExam extends Frame implements ItemListener, ActionListener{

Checkbox ck1=new Checkbox("���");
		TextArea ta =new TextArea (3, 30); 
		Checkbox ck2=new Checkbox("����",true);
	Checkbox ck3=new Checkbox("Ű��");
	Checkbox ck4=new Checkbox("����", true);	
Button ck5=new Button("        Ȯ��          ");
Button ck6=new Button("        ���          ");
Button ck10=new Button("        ����           ");
	public CheckBoxExam(){
	super("üũ�ڽ���");
	addWindowListener(new WindowHandler());
	Panel p=new Panel();
	 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
	
	Label ck7=new Label("�̸�");
	TextField a = new TextField(15);
	Button c =new Button("�˻�");
	Label ck8=new Label("��ȭ��ȣ");
	TextField b = new TextField(10);

	
	p.setBackground(Color.CYAN);
    ck5.setBackground(Color.LIGHT_GRAY);
    ck6.setBackground(Color.yellow);
    ck5.setSize(200, 500);
    ck6.setSize(200, 500);
	p.add(ck1);
	p.add(ck2);
	p.add(ck3);
	p.add(ck4);
    add(p,BorderLayout.NORTH);
    add(ta,BorderLayout.CENTER);
	add(p);
    p.add(ck5);
    p.add(ck6);
    p.add(ck10);
    p.add(ck7);
    p.add(a);
    p.add(c);
    p.add(ck8);
    p.add(b);
    p.add(ta);
      
    setSize(240,500);
    setVisible(true);
    ck1.addItemListener(this);
    ck2.addItemListener(this);
    ck3.addItemListener(this);
    ck4.addItemListener(this);
    ck5.addActionListener(this);
    ck6.addActionListener(this);
    ck10.addActionListener(this);
    }

public void itemStateChanged(ItemEvent ie) {
	if(ie.getStateChange() == ItemEvent.SELECTED)
		ta.append(ie.getItem() + "�� ���õ�\n\n");
	else if(ie.getStateChange() == ItemEvent.DESELECTED)
		ta.append(ie.getItem() + "�� ��ҵ�\n\n");}
   // else if(ie.getStateChange() == ItemEvent.CLICKED) 
	//ta.append(ie.getItem() + "�� ��ҵ�\n\n");}
public void actionPerformed(ActionEvent d) {
	if(d.getSource()==ck10){
		System.exit(0);}
	//else if(d.getSource()==ActionEvent.)
			ta.append(d.getActionCommand() + "�� ���õ�\n\n");
			//else if(d.getSource()==ck6) 
	
				ta.append(d.getActionCommand() + "�� ���õ�\n\n");
		
	}
}

class WindowHandler extends WindowAdapter{
      public void windowClosing(WindowEvent e)
      {
            System.out.println("������ â �ݱ�");
            System.exit(0);
      }

public static void main(String[] args){
	CheckBoxExam a = new CheckBoxExam();
}



}
