import java.util.Scanner;

import javax.swing.JButton;

class Endless
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        JButton b = new JButton();
        
    	//defining days in the week
    	String[]days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        //defining subjects in the week
        String[]sub = new String[18];
        sub[0] = "\nMath";
        sub[1] = "\nGerman";
        sub[2] = "\nEnglish";
        sub[3] = "\nHistory";
        sub[4] = "\nGeography";
        sub[5] = "\nBiologie";
        sub[6] = "\nFrench";
        sub[7] = "\nReligion";
        sub[8] = "\nPhysics";
        sub[9] = "\nCzech";
        sub[10]= "\nPhysical Education";
        sub[11]= "\nMusik";
        sub[12]= "\nArt";
        sub[13]= "\nChemistry";
        sub[14]= "\nOrganisation hour";
        sub[15]= "\nInformatik";
        sub[16]= "\nCourlibre";
        sub[17]= "\nSocial Studies";
        
        String[]hour= new String [10];
        hour[0]= "\n1.";
        hour[1]= "\n2.";
        hour[2]= "\n3.";
        hour[3]= "\n4.";
        hour[4]= "\n5.";
        hour[5]= "\n6.";
        hour[6]= "\n7.";
        hour[7]= "\n8.";
        hour[8]= "\n9.";
        
        while(true)
        {
            System.out.println("WHAT UP YOU WANT TO KNOW THE TIMETABLE ? LUL");
            String s = sc.nextLine();
            String m = (hour[0]+sub[2] +hour[1]+sub[2] +hour[2]+sub[5] +hour[3]+sub[5] +hour[4]+sub[6] +hour[5]+sub[4]+hour[6]+sub[16]+hour[7]+sub[11] +hour[8]+sub[11]);
            String t = (hour[0]+sub[9] +hour[1]+sub[1] +hour[2]+sub[13]+hour[3]+sub[3] +hour[4]+sub[0] +hour[5]+sub[0]+hour[6]+sub[14]);
            String w = (hour[0]+sub[6] +hour[1]+sub[17]+hour[2]+sub[2] +hour[3]+sub[8] +hour[4]+sub[8] +hour[5]+sub[4]+hour[6]+sub[16]+hour[7]+sub[15]+ hour[8]+sub[15]);
            String th =(hour[0]+sub[6] +hour[1]+sub[6] +hour[2]+sub[3] +hour[3]+sub[1] +hour[4]+sub[1] +hour[5]+sub[16]+hour[6]+sub[10] + hour[7]+sub[10] +hour[8]+sub[7]);
            String f = (hour[0]+sub[0] +hour[1]+sub[0] +hour[2]+sub[2] +hour[3]+sub[13]+hour[4]+sub[1] +hour[5]+sub[9]);
            String sa = ("You are luck today is no school :)");
            String su = sa;
            boolean check1 = days[0].intern()==s.intern();
            boolean check2 = days[1].intern()==s.intern();
            boolean check3 = days[2].intern()==s.intern();
            boolean check4 = days[3].intern()==s.intern();
            boolean check5 = days[4].intern()==s.intern();
            boolean check6 = days[5].intern()==s.intern();
            boolean check7 = days[6].intern()==s.intern();
            
            if(check1 == true)
            {
                System.out.println(days[0] + m);
                
            }
             else if(check2==true)
            {
                System.out.println(days[1] + t);
            }
            else if(check3==true)
            {
                System.out.println(days[2] + w);
            }
            else if(check4==true)
            {
                System.out.println(days[3] + th);
            }
            else if(check5==true)
            {
                System.out.println(days[4] + f);
    
            }
            else if(check6==true)
            {
                System.out.println(sa);
            }
            else if(check7==true)
            {
                System.out.println(su);
            
            }
            
        }
    }    
}