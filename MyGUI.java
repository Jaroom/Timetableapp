// Copyright 2016 Sebastian Holler <jaroomgtavhype@gmail.com>
// Copyright 2016 Patrick Pedersen <ctx.xda@gmail.com>

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class MyGUI extends JFrame{
	private static Timetable[][] timetable= new Timetable[10][5];
	private static ArrayList<String> breakTimes = new ArrayList<>();
	public static void main(String[] args) {
		//Initialize array
		for(int i=0;i<10;i++)
		{
			timetable[i] = new Timetable[5];
		}
		breakTimes.add("12:30");
		breakTimes.add("01:00");
		breakTimes.add("01:30");
		new MyGUI();
		
	}
	MyGUI(){
		
		setVisible(true);
		setTitle("My TimeTable");
		GridLayout g = new GridLayout(10, 2);
		g.setVgap(50);
		setLayout(g);
		createGUI();
		setSize(1000, 1000);
		
	}
	void createGUI(){
		JLabel tutor = new JLabel("Tutor");
		JTextField txttutor=new JTextField();
		add(tutor);
		add(txttutor);
		/*
		 *FileReader f = new FileReader(new File("filename"));
		 *while(f.hasnext())
		 *{
		 *tutorcombo.addItem(f.nextLine());
		 *}
		 */
		JComboBox<String> lessons = new JComboBox<>();
		lessons.addItem("Lesson 1");
		lessons.addItem("Lesson 2");
		lessons.addItem("Lesson 3");
		
		JLabel lessonLbl = new JLabel("Lesson");
		
		add(lessonLbl);
		add(lessons);
		
		JComboBox<String> subjects = new JComboBox<>();
		subjects.addItem("Subject 1");
		subjects.addItem("Subject 2");
		subjects.addItem("Subject 3");
		
		JLabel lblSubject = new JLabel("Subject");
		
		add(lblSubject);
		add(subjects);
		
		JLabel time = new JLabel("Time");
		JTextField hr = new JTextField();
		hr.setToolTipText("Hour");
		JTextField min = new JTextField();
		min.setToolTipText("Minutes");
		
		add(time);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 2));
		p1.add(hr);
		p1.add(min);
		add(p1);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tutor = null;
				String lesson=null;
				String subject = null;
				String time=null;
				tutor = txttutor.getText();
				lesson = lessons.getSelectedItem().toString();
				subject = subjects.getSelectedItem().toString();
				time = hr.getText()+":"+min.getText();
				if(breakTimes.contains(time))
					JOptionPane.showMessageDialog(null, "The timing is a break timing");
				else{
					Timetable t = new Timetable();
					t.tutor =tutor;
					t.lesson =lesson;
					t.subject = subject;
					t.setTime(time);
					//day 1 is selected
					//time corresponds to 11:30
					timetable[3][1] = t;
				}
				
			}
		});
		for(int i=0;i<10;i++)
		{
			for(int j =0;j<5;j++)
			{
				Timetable t = timetable[i][j];
				//Cell c = new Cell();
				//c.setText("t.getTutor()+t.getLesson()+t.getSubject())
			}
		}
		add(submit);
		
		
		
	}
}
